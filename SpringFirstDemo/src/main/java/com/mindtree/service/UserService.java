package com.mindtree.service;

import com.mindtree.model.Login;
import com.mindtree.model.User;

public interface UserService {

	User validateUser(Login login);

	void register(User user);

}
