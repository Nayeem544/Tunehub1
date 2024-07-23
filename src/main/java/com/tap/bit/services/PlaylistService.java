package com.tap.bit.services;

import java.util.List;

import com.tap.bit.entities.Playlist;

public interface PlaylistService {

	public void addPlaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();

}
