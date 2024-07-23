package com.tap.bit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.bit.entities.Playlist;
import com.tap.bit.repositories.PlaylistRepository;

@Service
public class PlaylistServiceImplementation implements PlaylistService{
	@Autowired
	PlaylistRepository repo;
	@Override
	public void addPlaylist(Playlist playlist) {
		repo.save(playlist);
	}
	@Override
	public List<Playlist> fetchAllPlaylists() {
		return repo.findAll();
	}

}
