# 使用Logback的步骤

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
4. 