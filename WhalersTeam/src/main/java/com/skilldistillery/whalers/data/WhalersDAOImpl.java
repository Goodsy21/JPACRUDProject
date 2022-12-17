package com.skilldistillery.whalers.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.whalers.entities.Skater;

@Service
@Transactional
public class WhalersDAOImpl implements WhalersDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Skater findById(int skaterId) {
		return em.find(Skater.class, skaterId);
	}

	@Override
	public List<Skater> findAll() {
		String jpql = "Select s from Skater s";
		return em.createQuery(jpql, Skater.class).getResultList();
	}

	@Override
	public Skater create(Skater skater) {
		String jpql = "";
		return skater;
	}

	@Override
	public Skater update(int skaterId, Skater skater) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skater delete(int skaterId, Skater skater) {
		// TODO Auto-generated method stub
		return null;
	}

}
