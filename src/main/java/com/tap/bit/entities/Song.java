package com.tap.bit.entities;
import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Id;
@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String image;
	String name;
	String artist;
	String genre;
	String link;
	@ManyToMany
	List<Playlist> playlists;
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Song(int id, String image, String name, String artist, String genre, String link, List<Playlist> playlists) {
		super();
		this.id = id;
		this.image = image;
		this.name = name;
		this.artist = artist;
		this.genre = genre;
		this.link = link;
		this.playlists = playlists;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<Playlist> getPlaylists() {
		return playlists;
	}
	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}
	
}