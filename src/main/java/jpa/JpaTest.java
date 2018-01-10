package jpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			

		Home m = new Home();
		Home h = new Home();
		m.setSize(4);
		h.setSize(10);


		Person p = new Person();
		p.setName("martin");
		p.setMail("salut@zut.fr");
		p.setHomes(Arrays.asList(m, h));
		m.setOwner(p);
		h.setOwner(p);
		manager.persist(m);
		manager.persist(h);
		manager.persist(p);

		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		String s = "SELECT e FROM Person as e where e.name=:name";
		
		Query q = manager.createQuery(s,Person.class);
		q.setParameter("name", "martin");
		List<Person> res = q.getResultList();
		
		System.err.println(res.size());
		System.err.println(res.get(0).getName());
		
		manager.close();
		factory.close();
	}

}
