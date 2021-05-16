package br.com.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.project.model.Post;
import br.com.project.util.JPAUtil;

public class PostDAO {
	
	private EntityManager manager = JPAUtil.getEntityManager();

	public void save(Post post) {
		
		manager.getTransaction().begin();		
		manager.persist(post);
		manager.getTransaction().commit();
		manager.close();
	}

	public List<Post> getAll() {
		String jpql = "SELECT s FROM Post s";
		TypedQuery<Post> query = manager.createQuery(jpql, Post.class);
		List<Post> resultList =  query.getResultList();	
		return resultList;
		
		
	}

}
