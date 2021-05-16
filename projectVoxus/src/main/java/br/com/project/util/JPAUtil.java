package br.com.project.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	public static EntityManager getEntityManager() {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("projectVoxus-persistence");
	return factory.createEntityManager();
	
	}
}
