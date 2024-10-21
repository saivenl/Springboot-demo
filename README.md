一、相关环境配置

1.更改自动编译，方便代码运行时更改，提高效率（非必须项）

2.maven这里写自己的配置位置，不推荐用idea自带的


3.在使用swagger时的springboot版本尽量不要用3开头的<version>2.7.13</version>

其它

```
<!-- 添加 Swagger 2 相关功能 -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>

<!-- 添加 Swagger UI 相关功能 -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
```

二、相关文件说明

1.static用来存放静态文件（图片）等

上传图片之后后端返回信息示例：

zhangsan
3.png
image/png
C:\Users\Q3309\AppData\Local\Temp\tomcat-docbase.8080.17841872554264106485\upload\

2.

三、测试

相关的get和post接口测试采用postman进行测试



其它请参考B站刘老师的课程【1天搞定SpringBoot+Vue全栈开发】 https://www.bilibili.com/video/BV1nV4y1s7ZN/?p=2&share_source=copy_web&vd_source=b85600dcb8f672770c13984d2746bde1

