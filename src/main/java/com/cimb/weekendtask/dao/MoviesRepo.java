package com.cimb.weekendtask.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cimb.weekendtask.entity.Movies;

public interface MoviesRepo extends JpaRepository<Movies, Integer> {
	public Movies findByNama(String nama);
}
