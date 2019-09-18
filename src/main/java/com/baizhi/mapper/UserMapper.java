package com.baizhi.mapper;

import com.baizhi.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    public List<User> findAll();
}
