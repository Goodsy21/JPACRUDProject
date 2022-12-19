package com.skilldistillery.whalers.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
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
	public List<Skater> searchSkater(String searchBy, String searchInput) {
		List<Skater> allSkaters = findAll();
		List<Skater> matchingSkaters = new ArrayList<>();
		
		for (int i = 0; i < allSkaters.size(); i++) {
			switch (searchBy) {
			case "firstName":
				if (searchInput.equalsIgnoreCase(allSkaters.get(i).getFirstName())) {
					matchingSkaters.add(allSkaters.get(i));
				}			
				break;
			case "lastName":
				if (searchInput.equalsIgnoreCase(allSkaters.get(i).getFirstName())) {
					matchingSkaters.add(allSkaters.get(i));
				}			
				break;
			case "number":
				if (searchInput.equals(allSkaters.get(i).getNumber())) {
					matchingSkaters.add(allSkaters.get(i));
				}			
				break;
			case "position":
				if (searchInput.equalsIgnoreCase(allSkaters.get(i).getPosition())) {
					matchingSkaters.add(allSkaters.get(i));
				}			
				break;
			case "hometown":
				if (searchInput.equalsIgnoreCase(allSkaters.get(i).getHometown())) {
					matchingSkaters.add(allSkaters.get(i));
				}			
				break;
			default:
				break;
			}
		}
		return matchingSkaters;
	}

	@Override
	@RequestMapping
	public List<Skater> findAll() {
		String jpql = "Select s from Skater s";
		return em.createQuery(jpql, Skater.class).getResultList();
	}

	@Override
	public Skater create(Skater skater) {
		em.persist(skater);
		return skater;
	}

	@Override
	public Skater update(int skaterId, Skater skater) {
		Skater s = em.find(Skater.class, skaterId);
		if (s != null) {
			s.setFirstName(skater.getFirstName());
			s.setLastName(skater.getLastName());
			s.setNumber(skater.getNumber());
			s.setPosition(skater.getPosition());
			s.setHometown(skater.getHometown());
		}
		return skater;
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
