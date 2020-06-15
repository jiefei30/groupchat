package com.marchsoft.groupchat.service;

import com.marchsoft.groupchat.domian.Message;

import java.util.List;

public interface MessageService {

    void saveMessage(Message message);

    List<Message> findAll();

}
