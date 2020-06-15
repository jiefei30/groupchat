package com.marchsoft.groupchat;

import com.marchsoft.groupchat.netty.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author DELL
 * @date 2020/5/20 17:56
 */
@SpringBootApplication
public class GroupChatStart implements CommandLineRunner {

    @Autowired
    WebSocketServer webSocketServer;

    public static void main(String[] args){
        SpringApplication.run(GroupChatStart.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        webSocketServer.run();
    }
}
