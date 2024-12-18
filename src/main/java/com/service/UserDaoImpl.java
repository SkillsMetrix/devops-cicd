package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Users;

@Service
public class UserDaoImpl implements UserDAO {
	ArrayList<Users> al = new ArrayList<Users>();

	@Override
	public boolean loginValid(Users users) {

		if (users.getUname().equals("admin") && users.getPass().equals("admin123")) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void registerUser(Users users) {
		al.add(users);
		System.out.println(al);

	}

	@Override
	public List<Users> loadUsers() {
		 
		return al;
	}

	@Override
	public boolean findUser(String name) {
		 for(Users usr:al) {
			 if(usr.getUname().equals(name)) {
				 return true;
			 }
		 }
		 return false;
	}

	@Override
	public boolean deleteUser(String name) {
		 
		 for(Users usr:al) {
			 if(usr.getUname().equals(name)) {
				 al.remove(usr);
				 return true;
			 }
		 }
		 return false;
	}

}
