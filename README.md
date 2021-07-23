- [MarkdownAddDirectory](#MarkdownAddDirectory)
  - [使用方法](#使用方法)
  - [先挖个坑](#先挖个坑)

# MarkdownAddDirectory
----
Markdown Add Directory,对markdown文件根据标题来添加目录,本文目录使用该工具生成

## 使用方法

调用MarkDownAddDirectory函数中的markDownAddDirectory函数即可(需要传入markdown文件路径)

```java
//s为所需要添加markdown目录文件的绝对路径
new MarkDownAddDirectory().markDownAddDirectory(s);
```

## 先挖个坑
暂时未做代码区中以`#`开始的识别,下个版本会实现
