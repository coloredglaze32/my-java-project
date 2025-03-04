# Logback

## 1. 使用Logback的步骤
1. 导入Logback所需的jar包，并添加到项目资源库中
   * 在项目下新建lib文件夹，把Logback所需要的jar文件存放到该文件夹下
   * lib文件夹下的jar文件，全选右击选择Add as library
2. 把Logback核心配置文件[logback.xml](../logback.xml)拷贝到当前项目的src目录下
3. 在代码中获取日志对象
```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
private static Logger logger = LoggerFactory.getLogger("LogBackTest01:");

logger.info("进入到main程序");
logger.debug("调用show()方法");
logger.trace("show方法执行！");
```

## 2.logback.xml (文件路径：[logback.xml](../logback.xml))
**Logback日志系统的特性都是捅咕核心配置文件logback.xml控制**  
* Logback日志输出，格式设置
```xml
<!--处处到控制台的配置标志-->
<appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">

<!--输出到系统文件的配置标志-->
<appender name="FILE" class="ch.qos.logback.core.ConsoleAppender">
```
* 输出格式
```xml
<!--格式化输出：
%d表示日期，
%thread表示线程名，
%-5level：级别从左显示5个字符宽度
%msg：日志消息，
%n是换行符
-->
<pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%-5level]  %c [%thread] : %msg%n</pattern>
```

## 3.日志级别
如果系统上线后只想记录一些错误的日志信息或者不想记录日志了，怎么办？  
**可以通过设置日志的输出级别来控制哪些日志信息输出或者不输出**
* 级别程度依次是TRACE<DEBUG<INFO<WARN<ERROR;默认级别是debug（忽略大消息）
* <span style="color:red">作用：用于控制系统中哪些日志级别是可以输出的，只输出级别不低于设定级别的日志信息</span>
* ALL和OFF是打开和关闭全部日志信息
```xml
<root level="ALL">
     <appender-ref ref="CONSOLE"/>
     <appender-ref ref="FILE" />
</root>
```
