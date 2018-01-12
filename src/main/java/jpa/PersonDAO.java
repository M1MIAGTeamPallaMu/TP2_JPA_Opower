package jpa;

import javax.persistence.EntityManager;
import java.io.Serializable;


public class PersonDAO implements GenericDAO {
    private EntityManager entityManager;

    /**
     *
     * @param entityManager
     */
    public PersonDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    /**
     * @param o
     * @return
     */
    public void create(Object o) {
        int numPerson = this.entityManager.createQuery("Select p from Person ", o.getClass()).getResultList().size();
        if(numPerson < 0){
            this.entityManager.persist(o);
        }
    }

    /**
     * @param id
     * @return
     */
    public Object read(Serializable id) {
        return null;
    }

    /**
     * @param o
     * @return
     */
    public Object update(Object o) {
        return null;
    }

    /**
     * @param o
     */
    public void delete(Object o) {

    }
}
