package com.tap.bit.services;

import java.util.List;

import com.tap.bit.entities.Trending;

public interface TrendingSong {
	public void addTrendingSong(Trending song);
	public List<Trending> findSongs();
	public List<Trending> fetchAllSongs();
	public void addSong(Trending song);

}