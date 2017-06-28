package com.autumn.efi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autumn.efi.dao.UserDao;
import com.autumn.efi.model.User;
import com.autumn.efi.services.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public Integer insertUserInfo() {
		int i = userDao.insert(new User(3, "老王", "123", 11));
		System.out.println("1/0=" + (1 / 0));
		return i;
	}

}
