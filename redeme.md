

一、相关环境配置

1.方便代码运行时更改，提高效率（非必须项）

![image-20241021140248671](C:\Users\Q3309\AppData\Roaming\Typora\typora-user-images\image-20241021140248671.png)



2.maven这里写自己的配置位置，不推荐用idea自带的

![image-20241021140417969](C:\Users\Q3309\AppData\Roaming\Typora\typora-user-images\image-20241021140417969.png)

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



![image-20241021170314645](C:\Users\Q3309\AppData\Roaming\Typora\typora-user-images\image-20241021170314645.png)



上传图片之后后端返回信息示例：

zhangsan
3.png
image/png
C:\Users\Q3309\AppData\Local\Temp\tomcat-docbase.8080.17841872554264106485\upload\

2.

三、测试

相关的get和post接口测试采用postman进行测试



![image-20241021140121123](C:\Users\Q3309\AppData\Roaming\Typora\typora-user-images\image-20241021140121123.png)



SpringBoot拦截器原理

![image-20241021173016601](C:\Users\Q3309\AppData\Roaming\Typora\typora-user-images\image-20241021173016601.png)

其它请参考B站刘老师的课程【1天搞定SpringBoot+Vue全栈开发】 https://www.bilibili.com/video/BV1nV4y1s7ZN/?p=2&share_source=copy_web&vd_source=b85600dcb8f672770c13984d2746bde1

