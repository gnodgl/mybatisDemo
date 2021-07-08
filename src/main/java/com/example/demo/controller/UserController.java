package com.example.demo.controller;

import com.example.demo.entities.Post;
import com.example.demo.entities.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.PostService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author 神隐`
 * 创建时间 2021-07-06 15:33
 */

@RestController
public class UserController {
    @Resource
    UserMapper userMapper;

    @Resource
    PostService postService;

    @PostMapping("/user")
    public User updateUser(@RequestBody User user){
        System.out.println(user);
        int i = userMapper.insertUser(user);
        System.out.println(i);
        return user;
    }

    @PutMapping("/user")
    public User insertUser(@RequestBody User user){
        System.out.println(userMapper.updateUser(user));
        return user;
    }

    @PostMapping("/post")
    public int insertPost(@RequestBody Post post){
        return postService.insert(post);
    }

    @PostMapping("/posts")
    public PageInfo<Post> getAllPost(@RequestBody HashMap<String,String> query){
        int pageNum = Integer.parseInt(query.get("pageNum"));
        int pageSize = Integer.parseInt(query.get("pageSize"));
        return postService.getAllPost(pageNum,pageSize);
    }
}
