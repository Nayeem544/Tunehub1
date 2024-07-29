package com.tap.bit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.bit.entities.Trending;
import com.tap.bit.repositories.TrendingSongRepository;
@Service
public class TrendingSongImplementation implements TrendingSong {
	@Autowired
	TrendingSongRepository repo;
	@Override
	public void addTrendingSong(Trending song) {
		// TODO Auto-generated method stub
		repo.save(song);

	}
	@Override
	public List<Trending> findSongs() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}
	@Override
	public List<Trending> fetchAllSongs() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}
	@Override
	public void addSong(Trending song) {
		// TODO Auto-generated method stub
		repo.save(song);
		
	}

}