package com.example.bootsplit.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.bootsplit.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lintianxing
 * @since 2022-03-15
 */
public interface IUserService extends IService<User> {

    public IPage<User> selectUserPage(User user);


}
