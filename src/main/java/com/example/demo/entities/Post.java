package com.example.demo.entities;

import lombok.Data;

/**
 * @author 神隐`
 * 创建时间 2021-07-06 17:03
 */


@Data
public class Post {
    private Integer id;

    private String title;

    private Integer view;

    private String content;
}