import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blockchain {
    private List<Block> blockchain;

    // 初始化区块链
    public Blockchain() {
        blockchain = new ArrayList<>();
        // 添加创世块
        Block genesisBlock = new Block("0", new Date(), "Genesis Block");
        genesisBlock.mineBlock(1);
        blockchain.add(genesisBlock);
    }

    // 添加新块
    public void addBlock(Block block) {
        // 为新块计算哈希值
        block.setPreviousHash(blockchain.get(blockchain.size() - 1).getHash());
        block.mineBlock(1);
        blockchain.add(block);
    }

    // 获取区块链中所有块的列表
    public List<Block> getBlockchain() {
        return blockchain;
    }

    // 加密数据
    public static String encryptData(String data) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(data.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(Integer.toHexString((b & 0xff) + 0x100).substring(1));
        }
        return sb.toString();
    }

    // 共享数据
    public void shareData(Block block) {
        // 将新块添加到区块链中
        addBlock(block);
        // 将新块的哈希值加密后发送给所有节点
        String encryptedHash = null;
        try {
            encryptedHash = encryptData(block.getHash());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        for (Node node : Node.getAllNodes()) {
            node.receiveBlock(block, encryptedHash);
        }
    }
}



public class Node {
    private String id;

    public Node(String id) {
        this.id = id;
    }

    // 接收新块
    public void receiveBlock(Block block, String encryptedHash) {
// 验证哈希值是否正确
        String hash = null;
        try {
            hash = Blockchain.encryptData(block.getPreviousHash() + block.getTimestamp().toString() + block.getData() + block.getNonce());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        if (!hash.equals(encryptedHash)) {
            System.out.println("Invalid block received: " + block.getHash());
            return;
        }
// 将新块添加到节点的区块链中
        Blockchain blockchain = Node.getBlockchain();
        if (blockchain.getBlockchain().contains(block)) {
            System.out.println("Block already in blockchain: " + block.getHash());
            return;
        }
        blockchain.addBlock(block);
        System.out.println("Block added to blockchain: " + block.getHash());
    }

    // 获取所有节点的列表
    public static List<Node> getAllNodes() {
// 返回存储在数据库或其他地方的节点列表
        return null;
    }

    // 获取节点的区块链
    public static Blockchain getBlockchain() {
// 返回存储在数据库或其他地方的区块链
        return null;
    }
}