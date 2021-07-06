package com.example.demo.mapper;

import com.example.demo.entities.Post;

import java.util.List;

/**
 * @author 神隐`
 * 创建时间 2021-07-06 17:03
 */


public interface PostMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);

    List<Post> getAllPost();
}