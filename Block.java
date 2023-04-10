import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class Block {
    private String previousHash;
    private String hash;
    private String data;
    private Date timestamp;
    private int nonce;

    public Block(String previousHash, Date timestamp, String data) {
        this.previousHash = previousHash;
        this.timestamp = timestamp;
        this.data = data;
        nonce = 0;
        hash = calculateHash();
    }

    // 计算块的哈希值
    public String calculateHash() {
        String dataToHash = previousHash + timestamp.toString() + data + nonce;
        String hash = null;
        try {
            hash = Blockchain.encryptData(dataToHash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hash;
    }

    // 尝试挖掘新块
    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0');
        while (!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = calculateHash();
        }
        System.out.println("Block mined: " + hash);
    }

    // 获取块的哈希值
    public String getHash() {
        return hash;
    }

    // 设置前一块的哈希值
    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }
}