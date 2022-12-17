package com.skilldistillery.whalers.data;

import java.util.List;

import com.skilldistillery.whalers.entities.Skater;

public interface WhalersDAO {
	Skater findById(int skaterId);
	List<Skater> findAll();
	Skater create(Skater skater);
	Skater update(int skaterId, Skater skater);
	boolean delete(int skaterId);
}
