package com.skilldistillery.whalers.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WhalersTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Skater skater;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAWhalers");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		skater = em.find(Skater.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		skater = null;
	}

	@Test
	void test_Whalers_entity_mapping() {
		assertNotNull(skater);
		assertEquals("Ryan", skater.getFirstName());
	}

}
