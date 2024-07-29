package com.tap.bit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.bit.entities.Trending;

public interface TrendingSongRepository extends JpaRepository<Trending, Integer> {

}