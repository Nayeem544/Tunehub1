package com.tap.bit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.bit.entities.Users;

public interface UsersRepository extends JpaRepository<Users,Integer> {
	

	public Users findByEmail(String email);
}
