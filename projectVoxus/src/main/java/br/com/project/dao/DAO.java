package br.com.project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import br.com.project.model.Post;
import br.com.project.util.JPAUtil;

public class DAO<T> {
	
	private Class<T> classs;
	
	public DAO(Class<T> classs) {
		this.classs = classs;
	}
	
	private EntityManager manager = JPAUtil.getEntityManager();

	public void save(T t) {
		manager.getTransaction().begin();
		manager.persist(t);
		manager.getTransaction().commit();
		manager.close();
	}

	public List<T> getAll() {
		CriteriaQuery<T> query = manager.getCriteriaBuilder().createQuery(classs);
		query.select(query.from(classs));
		TypedQuery<T> createQuery = manager.createQuery(query);
		List<T> resultList = createQuery.getResultList();
		return resultList;
	}

	public T findById(Long id) {
		return manager.find(classs, id);
	}

	public void update(Post post) {
		manager.getTransaction().begin();
		manager.merge(post);
		manager.flush();
		manager.getTransaction().commit();
	}
	
	public void deleteById(Long id) {
		T t = findById(id);
		manager.getTransaction().begin();
		manager.remove(t);
		manager.flush();
		manager.getTransaction().commit();
	}
		
}


