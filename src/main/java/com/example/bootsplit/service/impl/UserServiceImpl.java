package com.example.bootsplit.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bootsplit.entity.User;
import com.example.bootsplit.mapper.UserMapper;
import com.example.bootsplit.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lintianxing
 * @since 2022-03-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public IPage<User> selectUserPage(User user) {
        Page<User> userPage = new Page<>(1,3);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(User::getId,user.getId());
        Page<User> userPage1 = userMapper.selectPage(userPage, queryWrapper);


        return userPage1;
    }
}
