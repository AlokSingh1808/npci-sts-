package com.example.ecommerce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.entity.Product;

@Repository
public class ProductRepositoryImplementation implements ProductRepository {
	
	@Autowired
	EntityManager entityManager;
	
	public List<Product> findAll() {
		
		Session currentSession  = entityManager.unwrap(Session.class);
		 
		Query<Product> query = currentSession.createQuery("select p from Product p",Product.class);
		
		List<Product> prodList = query.getResultList(); 
		return prodList;
	}

	@Override
	public Product findById(Integer id) {
		Session currentSession  = entityManager.unwrap(Session.class);
		return currentSession.get(Product.class, id);
	}

	@Transactional
	public void saveOrUpdate(Product prod) {
		Session currentSession  = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(prod);
	}

	@Transactional
	public void deleteById(int id) {
		Session currentSession  = entityManager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("delete from Product where id = :productId");
		query.setParameter("productId",id );
		query.executeUpdate();
	}
	
	

}
