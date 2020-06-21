package com.cimb.weekendtask.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nama;
	private int tahun;
	private String description;
	private String moviesPict;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getTahun() {
		return tahun;
	}

	public void setTahun(int tahun) {
		this.tahun = tahun;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMoviesPict() {
		return moviesPict;
	}

	public void setMoviesPict(String moviesPict) {
		this.moviesPict = moviesPict;
	}

	@Override
	public String toString() {
		return "Movies [id=" + id + ", nama=" + nama + ", tahun=" + tahun + ", description=" + description
				+ ", moviesPict=" + moviesPict + "]";
	}

}
