package com.service;

import java.util.List;

import com.model.Users;

public interface UserDAO {

	public boolean loginValid(Users users);
	public void registerUser(Users users);
	public List<Users> loadUsers();
	public boolean findUser(String name);
	public boolean deleteUser(String name);
}
