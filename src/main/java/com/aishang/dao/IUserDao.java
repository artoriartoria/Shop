package com.aishang.dao;

import com.aishang.model.User;

public interface IUserDao {
    User selectUser(long id);
}
