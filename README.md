# Groupchat

#### introduce
Server of groupchat system. Among them, netty mainly forwards broadcast messages, and sprngboot server stores the messages sent from the web.

bilibili：https://www.bilibili.com/video/BV1Ap4y1D7iQ?spm_id_from=333.999.0.0

![](https://file.makeyourchoice.cn/img/github/groupchat.jpg)

#### Architecture
springboot & netty


#### How to install

1.  Import the database into groupchat.sql in the root path (build database and table)
2.  Import idea and start the project

#### How to use

1.  Modify the configuration in application.yml according to personal circumstances：
port and path：
```yml
server:
  port: 7084      #springboot port
  servlet:
    context-path: /groupchat  #project request path

netty:
  port: 7000    #netty port
  context-path: /groupchat   #netty request path（Be consistent with the web）
```
database：
```yml
#   datasource configure
  datasource:
    username: root
    password: root
    url: jdbc:mysql://localhost:3306/groupchat?characterEncoding=UTF-8&useSSL=false
    driver-class-name: com.mysql.jdbc.Driver
```

#### Sponsor

1.  jiefei30

