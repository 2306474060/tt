package com.example.bootsplit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bootsplit.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
