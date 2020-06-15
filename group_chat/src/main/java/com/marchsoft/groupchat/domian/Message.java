package com.marchsoft.groupchat.domian;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author DELL
 * @date 2020/5/20 19:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ToString
public class Message implements Serializable {

    private int id;

    private String content;

    private int size;

    private String color;

    private boolean bold;

    private boolean italic;

    private int position;

    private String ip;

    private String name;

//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String time;

    private int available;


}
