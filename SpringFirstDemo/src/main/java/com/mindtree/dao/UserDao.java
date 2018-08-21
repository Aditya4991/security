package com.mindtree.dao;

import com.mindtree.model.Login;
import com.mindtree.model.User;

public interface UserDao {
	  void register(User user);
	  User validateUser(Login login);
	}