
# Smart-City-Governance Blog  

<p align = 'right'>智慧城市治理博客</p>  <br>    

- [Smart-City-Governance Blog](#smart-city-governance-blog)
  - [（一）项目前景和范围](#一项目前景和范围)
    - [系统简介：](#系统简介)
    - [可行性分析](#可行性分析)
      - [技术可行性](#技术可行性)
      - [操作可行性](#操作可行性)
      - [经济可行性](#经济可行性)
      - [法律可行性](#法律可行性)
    - [系统功能](#系统功能)
  - [（二） 涉众分析和数据采样结果](#二-涉众分析和数据采样结果)
    - [问卷格式](#问卷格式)
    - [问卷结果（数据）](#问卷结果数据)
    - [问卷结果（图表）](#问卷结果图表)
    - [数据分析](#数据分析)
  - [（三） 面谈与甲方乙方沟通](#三-面谈与甲方乙方沟通)
    - [面谈方法](#面谈方法)
    - [面谈过程](#面谈过程)
    - [面谈问题类型](#面谈问题类型)
      - [线上微信会谈主要是开放式问题类型，总结关于功能需求面向对象与范围等的需求。](#线上微信会谈主要是开放式问题类型总结关于功能需求面向对象与范围等的需求)
      - [线下面谈主要就原型草案进行评估，提供优化方案，进行进一步优化。](#线下面谈主要就原型草案进行评估提供优化方案进行进一步优化)
  - [（四）智慧城市治理系统软件需求规格说明](#智慧城市治理系统软件需求规格说明)
    - [(IEEE 830 标准)](#ieee-830-标准)
    - [a. 引言](#a-引言)
      - [a. 1目的](#a-1目的)
      - [a. 2预期的读者和阅读建议](#a-2预期的读者和阅读建议)
      - [a. 3产品的范围](#a-3产品的范围)
    - [b. 综合描述](#b-综合描述)
      - [b.1产品的前景](#b1产品的前景)
      - [b.2产品的功能](#b2产品的功能)
      - [b.3用户类和特征](#b3用户类和特征)
      - [b.4 可行性分析](#b4-可行性分析)
      - [b.5运行环境](#b5运行环境)
      - [b.6设计和实现上的限制](#b6设计和实现上的限制)
      - [b.7假设和依赖](#b7假设和依赖)
    - [c. 外部接口需求](#c-外部接口需求)
      - [c. 1用户界面](#c-1用户界面)
      - [c. 2硬件接口](#c-2硬件接口)
      - [c.3软件接口](#c3软件接口)
      - [c.4通信接口](#c4通信接口)
    - [d.系统特性](#d系统特性)
      - [d.1说明和优先级](#d1说明和优先级)
      - [d.2激励/响应序列](#d2激励响应序列)
      - [d.3功能需求](#d3功能需求)
    - [e.其它非功能需求](#e其它非功能需求)
      - [e.1性能需求](#e1性能需求)
      - [e.2安全设施需求](#e2安全设施需求)
      - [e.3安全性需求](#e3安全性需求)
      - [e.4软件质量标准属性](#e4软件质量标准属性)
      - [e.5业务规则](#e5业务规则)
      - [e.6用户文档](#e6用户文档)
    - [f.其它需求](#f其它需求)
    - [附录A:词汇表](#附录a词汇表)
    - [附录B：分析模型](#附录b分析模型)
    - [附录C:待确定问题的列表](#附录c待确定问题的列表)

## （一）项目前景和范围

### 系统简介：
在现今的城市中，现代化的管理方式使得城市的治理变得更为细节化。如果以以前人传人的方式治理城市会使得数据的传递效率降低，数据丢失的可能性加大。所以我们计划设计一个智慧城市治理系统使得管理者可以更好的治理城市。本系统以城市为背景，利用城市中物联设备的音频采集功能以及城市政务云平台提供的计算资源，通过AI、大数据等技术实现对城市道路破损、违法停车、违法广告等事件的实时检测、预警和处理功能。事件上报可通过移动APP手机上报，或通过智能视频巡防自动发现上报；所有上报事件将进行统一受理，依照各部门现有事项划分体系，将提交的事件初步分类，将事件与主办部门绑定并派发至该部门；可预设事件级别、办结时限、是否督办以及处理反馈等功能。
### 可行性分析
#### 技术可行性
智慧城市治理系统本身问题稍许复杂，但所需技术并不艰深，技术风险无。主要需要对于各部门分工明确，各功能模板划分具体，开发时可借鉴一线城市治理系统先例。
#### 操作可行性
此智慧城市治理系统预期操作符合城市管理者与居民的操作流程，各功能需求彼此间联系且目标明确，用户能方便理解需求其中模糊的概念。
#### 经济可行性
该系统不以盈利为目的，旨在为居民与城市管理者提供一个更好的操作平台。
#### 法律可行性
该系统开发流程的各个步骤以及所采用的代码都是项目参与人员努力后的结果，不存在侵害他人知识产权的可能性。
### 系统功能
功能简介：
1. 事件上报系统：用户可通过移动APP手机上报事件与智能视频巡防系统上报的事件一同上传到数据库。
2. 事件分类系统：在数据库中提取事件并将其分类、预设事件级别，并上传至对应部门。
3. 事件处理系统：管理者办结事件、办理结果提供与用户并提供反馈。  

（二） 涉众分析和数据采样结果
-------------------
采用了问卷形式来进行涉众分析和数据采样<br>
共回收了**108**份有效问卷  

### 问卷格式
![image](https://user-images.githubusercontent.com/128110243/225808848-8b41a86c-f4c3-4340-bedd-215238112713.png)<br>
![image](https://user-images.githubusercontent.com/128110243/225808870-82913859-0e01-48fc-8fa1-dc7fb960050c.png)<br>
![image](https://user-images.githubusercontent.com/128110243/225808900-540ef88d-b753-455f-9fa2-d1799528c744.png)<br>
![image](https://user-images.githubusercontent.com/128110243/225808916-98373a1e-1561-4ace-b85a-17954ab9473c.png)<br>

### 问卷结果（数据）
![image](https://user-images.githubusercontent.com/128110243/225808556-1aba0d17-6ba3-40db-a26f-6b02c5d66d46.png)<br>
![image](https://user-images.githubusercontent.com/128110243/225808589-caa3b269-5192-4b30-bbf6-1ddeb4ef188b.png)<br>
![image](https://user-images.githubusercontent.com/128110243/225808640-d51a7790-425e-47c4-ab26-407defea3b5f.png)<br>
![image](https://user-images.githubusercontent.com/128110243/225808670-5418e714-a81c-45ef-965b-96199b3ec936.png)<br>
![image](https://user-images.githubusercontent.com/128110243/225808710-143df7dd-cec3-4529-a094-1c3c48210dba.png)<br>

### 问卷结果（图表）
![image](https://user-images.githubusercontent.com/128110243/225805230-b0235d37-3937-433a-a4f5-f2c485eb79c6.png)  <br>

### 数据分析  

由这份问卷中我们可以看出，大家基本上都不怎么了解或者使用过智慧城市系统，但是大多认为所在城市需要使用智慧城市系统，所以这就说明了我们进行智慧城市系统的设计的必要性和前景是非常广阔的<br>
大家最希望智慧城市治理所包括的内容是高效精确执法，交通监控管理和卫生应急服务，未来设计系统可以主要围绕这三方面展开  

（三） 面谈与甲方乙方沟通
----------------------------

### 面谈方法
1.	先就项目相关基本事宜进行简单微信会谈。
2.	于2023年3月15日下午进行面对面详谈。
### 面谈过程
1.	准备面谈，列出基本的问题在线上进行基本的解决，具体线下再进行讨论。
2.	具体线下面谈，对方案简单原型进行评估，进行进一步的修改。
3.	总结笔录，对面谈结果进行总结。
###	面谈问题类型
#### 线上微信会谈主要是开放式问题类型，总结关于功能需求面向对象与范围等的需求。<br>
![f656107d704cd56b33cf58315e72fc7](https://user-images.githubusercontent.com/128110243/225805579-bfe45565-dbca-4a7e-be4b-a5920d845d02.jpg)<br>
![image](https://user-images.githubusercontent.com/128110243/225805590-fa37e9cc-dfa1-49ad-8e86-173e9ac46361.png)<br>
![image](https://user-images.githubusercontent.com/128110243/225805597-4ca5e677-b8dd-4a31-b86b-80de0c744327.png)<br>
#### 线下面谈主要就原型草案进行评估，提供优化方案，进行进一步优化。<br>
面谈类型：半结构化面谈，涵盖乙方预设的问题，也听取甲方的其他意见。<br>
![image](https://user-images.githubusercontent.com/128110243/225805685-01a3b675-ba3f-4070-8a48-fbbe105b71f6.png)<br>
![image](https://user-images.githubusercontent.com/128110243/225805690-0851f268-629a-4a28-b63f-4c821247a252.png)<br>
![image](https://user-images.githubusercontent.com/128110243/225805719-5302bd53-5258-4254-b0ca-9ef7b2b2efc2.png)<br>


## （四） 智慧城市治理系统软件需求规格说明

### (IEEE 830 标准)
### a. 引言 
#### a. 1目的 
设计智慧城市治理系统，本系统以城市为背景，利用城市中物联设备的音频采集功能以及城市政务云平台提供的计算资源，通过AI、大数据等技术实现对城市道路破损、违法停车、违法广告等事件的实时检测、预警和处理功能。事件上报可通过移动APP手机上报，或通过智能视频巡防自动发现上报；所有上报事件将进行统一受理，依照各部门现有事项划分体系，将提交的事件初步分类，将事件与主办部门绑定并派发至该部门；可预设事件级别、办结时限、是否督办以及处理反馈等功能。
#### a. 2预期的读者和阅读建议 
本《软件需求规格说明书》的预期读者是：1.程序教学平台开发经理；2.技术部经理；3.项目组所有人员；4.测试组人员；
项目组人员需根据该规格说明来进行开发，制定开发计划，安排具体工作。
测试组人员需了解项目的各种需求，并根据需求制定的范围、方法来设计测试用例、执行和记录测试过程并记录和报告缺陷。
#### a. 3产品的范围 
产品受众为城市所有居民以及城市管理者与执行者。该系统不以盈利为目的，旨在为居民与城市管理者提供一个更好的操作平台。
 
### b. 综合描述 
#### b.1产品的前景 
在现今的城市中，现代化的管理方式使得城市的治理变得更为细节化。如果以以前人传人的方式治理城市会使得数据的传递效率降低，数据丢失的可能性加大。所以我们计划设计一个智慧城市治理系统使得城市治理更加有效。
#### b.2产品的功能 
1. 事件上报系统：用户可通过移动APP手机上报事件与智能视频巡防系统上报的事件一同上传到数据库。
2. 事件分类系统：在数据库中提取事件并将其分类、预设事件级别，并上传至对应部门。
3. 事件处理系统：管理者办结事件、办理结果提供与用户并提供反馈。
#### b.3用户类和特征 
1. 城市居民：此类用户如发现城市中出现道路破损、违法停车、违法广告等事件，可将其汇报并上传至系统数据库中；也对于相关部门对于事件处理进行反馈工作；
2. 城市管理行政执法者：对于数据库系统中初步分类分级的事件进行勘误，并检测系统运行情况。对于事件处理的反馈情况进行政策人员上的改动；
3. 事件处理者：此类用户主要由公安局、人事局、交通局、卫生局、应急管理局等人员组成。对于从系统数据库中分发到的各类事件进行接受以及处理。
#### b.4 可行性分析
1. 技术可行性：智慧城市治理系统本身问题稍许复杂，但所需技术并不艰深，技术风险无。主要需要对于各部门分工明确，各功能模板划分具体，开发时可借鉴一线城市治理系统先例。
2. 操作可行性：此智慧城市治理系统预期操作符合城市管理者与居民的操作流程，各功能需求彼此间联系且目标明确，用户能方便理解需求其中模糊的概念。
3. 经济可行性：该系统不以盈利为目的，旨在为居民与城市管理者提供一个更好的操作平台。
4. 法律可行性：该系统开发流程的各个步骤以及所采用的代码都是项目参与人员努力后的结果，不存在侵害他人知识产权的可能性。
#### b.5运行环境 
客户端应能够在Android和IOS稳定运行，并能通过电台即时传达，服务端应在Linux稳定运行。
#### b.6设计和实现上的限制 
- 技术和工具：必须使用python编程语言进行开发，使用HTML进行网站开发，使用MySQL数据库进行数据存储和管理
- 开发规范和标准：开发过程中必须遵守PEP 8编码规范，包括命名规范、代码注释、缩进和代码风格等。
- 企业策略和政府法规：在开发过程中必须遵守企业保密协议和政府相关法规，保护用户隐私和数据安全。
- 硬件限制：应用程序必须适应不同硬件平台，例如不同的操作系统和处理器架构，同时需要考虑应用程序对存储器和CPU的使用。
- 数据转换格式标准：所有数据必须使用标准的JSON格式进行传输，以确保数据的互操作性和可移植性。
- 工业标准：在开发过程中必须遵守相关的工业标准，包括ISO 9001质量管理标准和ISO 27001信息安全管理标准，以确保产品质量和数据安全。
#### b.7假设和依赖 
本项目能否成功实施，主要取决于以下几个条件：
1. 对现有的软件开发流程进行详细的了解，同时学习现有的智慧城市治理平台，了解各环节运作的原理和机制。
2. 具有稳定、团结的项目团队，团队成员默契配合，按时按量完成自身任务。
3. 团队掌握城市管理相关小程序开发的主要环节和各个步骤，拥有软件系统的运行必要的且能够满足系统运行条件的硬件环境和通讯环境。

### c. 外部接口需求 
利用本节来确定可以保证新产品与外部组件正确连接的需求。关联图表示了高层抽象的外部接口。需要把对接口数据和控制组件的详细描述写入数据字典中。如果产品的不同部分有不同的外部接口，那么应把这些外部接口的详细需求并入到这一部分的实例中。
#### c. 1用户界面 
陈述所需要的用户界面的软件组件。描述每个用户界面的逻辑特征。以下是可能要包括的一些特征： 
- 将要采用的图形用户界面（GUI）标准或产品系列的风格。 
- 屏幕布局或解决方案的限制。 
- 将出现在每个屏幕的标准按钮、功能或导航链接（例如一个帮助按钮）。 
- 快捷键。 
- 错误信息显示标准。 
对于用户界面的细节，例如特定对话的布局，应该写入一个独立的用户界面规格说明中，而不能写入软件需求规格说明中。 
#### c. 2硬件接口 
描述系统中软件和硬件每一接口的特征。这种描述可能包括支持的硬件类型、软硬件之间的交流的数据和控制信息的性质以及使用的通信协议。 
#### c.3软件接口 
描述该产品与其他外部组件（由名字和版本识别）的连接，包括数据库、操作系统、工具、库和集成的商业组件，明确并描述在软件组件之间交换数据或消息的目的，描述所需要的服务以及内部组件通令的性质，确定将在组件之间共享的数据，如果必须用一种特殊的方法来实现数据共享机制，例如在多任务操作系统中的一个全局数据区，那么就必须把它定义为一种实现上的限制。 
#### c.4通信接口 
描述与产品所使用的通信功能相关的，包括电子、Web浏览器、网络通信标准或协议及电子表格等等。定义了相关的消息格式。规定通信安全或加密问题、数据传输速率和同步通信机制。

### d.系统特性
功能是根据系统特性即产品所提供的主要服务来组织的。你可能更喜欢通过使用实例、运行模式、用户类、对象类或功能等级来组织这部分内容（IEEE1998）。你还可以使用这些元素的组合。总而言之，你必须选择一种使读者易二理解预期产品的组织方案。 
仅用简短的语句说明特性的名称，例如“4.1拼写检查和拼写字典管理”。无论你想说明何种特性，阐述每种特性时都将重述从d.1-d.3这三步系统特性。 
#### d.1说明和优先级
提出了对该系统特性的简短说明并指出该特性的优先级是高、中，还是低。或者你还可以包括对特定优先级部分的评价，例如利益、损失、费用和风险，其相对优先等级可以从1（低）到9（高）。 
#### d.2激励/响应序列 
列出输入激励（用户动作、来自外部设备的信号或其它触发器）和定义这一特性行为的系统响应序列。就像在第8章讲座的那样，这些序列将与使用实例相关的对话元素相对应。
#### d.3功能需求
列出与该特性相关的详细功能。这些是必须提交给用户的软件功能，使用户可以使用所提供的特性服务或者使用所指定的使用实例招待任务。描述产品如何响应可预知的出错条件或者非法输入或动作。就像本章开头所描述的那样，你必须唯一的标识每个需求。
 
### e.其它非功能需求
这部分列举出了所有非功能需求，而不是外部接口需求和限制。
#### e.1性能需求
阐述了不同的应用领域对产品性能的需求，并解释它们的原理以帮助开发人员做出合理的设计选择。确定相互合作的用户数或者所支持的操作、响应时间以及与实时系统的时间关系。你还可以在这里定义容量需求，例如存储器和磁盘容量的需求或者存储在数据库中表的最大行数。尽可能详细地确定性能需求。可能需要针对每个功能需求或特性分别陈述其性能需求，而不是把它们都集中在一起陈述。例如，“在运行微软Windows 2000的450MhzPentium II的计算机上，当系统至少有50％的空闲资源时，95％的目录数据库查询必须在两秒内完成” 
#### e.2安全设施需求
详尽陈述与产品使用过程中可能发生的损失、破坏或危害相关的需求。定义必须采取的安全保护或动作，还有那些预防的潜在的危险动作。明确产品必须遵从的安全标准、策略或规则。一个安全设施需求的范例如下：“如果油箱的压力超过了规定的最大压力的95％，那么必须在1秒种内终止操作”。 
#### e.3安全性需求
详尽陈述与系统安全性、完整性或与私人问题相关的需求，这些问题将会影响到产品的使用和产品所创建或使用的数据的保护。定义用户身份确认或授权需求。明确产品必须满足的安全性或保密性策略。你可能更喜欢通过称为完整性的质量属性来阐述这些需求。一个软件系统的安全需求的范例如下：“每个用户在第一次登录后，必须更改最初登录密码。最初的登录密码不能重用。” 
#### e.4软件质量标准属性
详尽陈述与客户或开发人员至关重要的其产品质量特性。这些特性必须是确定、定量的并在可能时是可验证的。至少应指明不同属性的相对侧重点，例如易用程度优于易学程度，或者可移植优于有效性。 
#### e.5业务规则
列举出有关产品的所有操作规则，例如什么人在特定环境下可以进行何种操作。这些本身不是功能需求，但它们可以暗示某些功能需求执行这些规则。一个业务规则的范例如下：“只有持有管理员密码的用户才能执行$100.00或更大额的退款操作。“ 
#### e.6用户文档
列举出将与软件一同发行的用户文档部分，例如，用户手册、在线帮助和教程。明确所有已知的用户文档的交付格式和标准。

### f.其它需求
定义在软件需求规格说明的其它部分未出现的需求，例如国际化需求或法律上的需求。你还可以增加有关操作、管理和维护部分来完善产品安装、配置、启动和关闭、修复和容错，以及登录和监控操作等方面的需求。在模板中加入与你的项目相关的新部分。如果你不需要增加其它需求，就省略这一部分。

### 附录A:词汇表
定义所有必要的术语，以便读者可以正确地解释软件需求说明，包括词头和缩写。你可能希望为整个公司创建一张跨越多项项目的词汇表，并且只包括特定于单一项目的软件需求规格说明中的术语。
### 附录B：分析模型
这个可选部分包括或涉及到相关的分析模型的位置，例如数据流程图、类图、状态转换图或实体-关系图。
### 附录C:待确定问题的列表
编辑一张在软件需求规格说明中待确定问题的列表，其中每一表项都是编上号的，以便于跟踪调查。
