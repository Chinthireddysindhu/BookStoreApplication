package com.BookStore.Services;

import com.BookStore.Model.User;

public interface UserService {
	User getUserById(int u);
	User createUser(User u);
	void suspendUser(int id);
	User updateUser(User u);

	//void deductMoney(int userId, double v);

	void deductMoney(int userId, double v);
}
