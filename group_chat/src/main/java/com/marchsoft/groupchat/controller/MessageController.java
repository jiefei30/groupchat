package com.marchsoft.groupchat.controller;

import com.marchsoft.groupchat.domian.Message;
import com.marchsoft.groupchat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author DELL
 * @date 2020/5/20 18:43
 */
@RestController
@CrossOrigin
@RequestMapping("message")
public class MessageController {

    @Autowired
    MessageService messageService;

    /**
     * 测试
     * @return
     */
    @GetMapping("test")
    public String test(){
        return "YES!";
    }

    /**
     * 添加用户
     */
    @PostMapping("save")
    public Map<String,Object> save(@RequestBody Message message){
        HashMap<String, Object> map = new HashMap<>();
        try {
            messageService.saveMessage(message);
            map.put("success",true);
            map.put("msg","添加弹幕成功");
        }catch (Exception e){
            e.printStackTrace();
            map.put("success",false);
            map.put("msg","添加弹幕失败: " + e.getMessage());
        }
        return map;
    }

    /**
     * 查询所有弹幕
     */
    @GetMapping("findAll")
    public Map<String,Object> findAll(Integer page,Integer rows){
        Map<String,Object> map = new HashMap<>();
        try{
            List<Message> results = messageService.findAll();
            map.put("results",results);
            map.put("status",200);
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }
}
