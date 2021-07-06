package com.example.demo.service;

import com.example.demo.entities.Post;
import com.example.demo.mapper.PostMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 神隐`
 * 创建时间 2021-07-06 17:03
 */
    
    
@Service
public class PostService{

    @Resource
    private PostMapper postMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return postMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Post record) {
        return postMapper.insert(record);
    }

    
    public int insertSelective(Post record) {
        return postMapper.insertSelective(record);
    }

    
    public Post selectByPrimaryKey(Integer id) {
        return postMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Post record) {
        return postMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Post record) {
        return postMapper.updateByPrimaryKey(record);
    }

    public List<Post> getAllPost() {
        return postMapper.getAllPost();
    }
}
