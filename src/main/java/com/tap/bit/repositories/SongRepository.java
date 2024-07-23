package com.tap.bit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.bit.entities.Song;

public interface SongRepository extends JpaRepository<Song,Integer>{

	public Song findByName(String name);

}
