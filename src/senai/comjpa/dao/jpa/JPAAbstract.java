package senai.comjpa.dao.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


public abstract class JPAAbstract<T> extends JPAConnection implements DAOFactory {
	public void incluir(T o) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		em.close();
	}
	
	public T buscarPorId(int id) {
		String jpql = "select c from " + getEntityName() + " c where c.id = " +id;
		Query query = super.getQuery(jpql);
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<T> list = query.getResultList();
		for (T object : list) {
			return object;
		}
		return null;
	}
	
	
	
	public abstract String getEntityName();

}
