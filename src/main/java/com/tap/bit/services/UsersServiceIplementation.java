package com.tap.bit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.bit.entities.Users;
import com.tap.bit.repositories.UsersRepository;
@Service
public class UsersServiceIplementation implements UsersService{
	@Autowired
	UsersRepository repo;
	@Override
	public String addUser(Users user) {
		repo.save(user);
		return "user added successfully";
	}
	@Override
	public boolean emailExists(String email) {
		if(repo.findByEmail(email)==null) {
			return false;
		}else {
			return true;
		}
		
	}
	@Override
	public boolean validateUser(String email, String password) {
		Users user = repo.findByEmail(email);
		String db_pass = user.getPassword();
		if(password.equals(db_pass)) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String getRole(String email) {
		Users user = repo.findByEmail(email);
		return user.getRole();
	}
	@Override
	public Users getUser(String email) {
		return repo.findByEmail(email);
	}
	@Override
	public void updateUser(Users user) {
		repo.save(user);
	}
	@Override
	public boolean updatePassword(String email, String password) {
		// TODO Auto-generated method stub
		Users user = repo.findByEmail(email);
		if(user==null) {
			return false;
		}else {
			user.setPassword(password);
			repo.save(user);
			return true;
		}
		
	}


}