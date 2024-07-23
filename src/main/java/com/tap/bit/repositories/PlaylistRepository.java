package com.tap.bit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.bit.entities.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist,Integer>{

}
