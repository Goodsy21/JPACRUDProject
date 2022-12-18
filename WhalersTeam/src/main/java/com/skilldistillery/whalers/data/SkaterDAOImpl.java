package com.skilldistillery.whalers.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.whalers.entities.Skater;

@Service
@Transactional
public class SkaterDAOImpl implements SkaterDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Skater findById(int skaterId) {
		return em.find(Skater.class, skaterId);
	}

	@Override
	@RequestMapping
	public List<Skater> findAll() {
		String jpql = "Select s from Skater s";
		return em.createQuery(jpql, Skater.class).getResultList();
	}

	@Override
	public Skater create(Skater skater) {
		String jpql = "INSERT into Skater (s.firstName, s.lastName, s.number, s. position, s.hometown) VALUES (?,?,?,?,?)";
		return em.createQuery(jpql, Skater.class).getSingleResult();
	}

	@Override
	public Skater update(int skaterId, Skater skater) {
		Skater s = em.find(Skater.class, skaterId);
		if (s != null) {
			
		}
		return s;
	}

	@Override
	public boolean delete(int skaterId) {
		boolean deletedSkater = false;
		Skater s = em.find(Skater.class, skaterId);
		if(s != null) {
			em.remove(s);
			deletedSkater = true;
		}
		return deletedSkater;
	}

}
