package jpa;

import java.io.Serializable;

public interface GenericDAO<T, PK extends Serializable> {
    /**
     *
     * @param t
     * @return
     */
    void create(T t);

    /**
     *
     * @param id
     * @return
     */
    T read(PK id);

    /**
     *
     * @param t
     * @return
     */
    T update(T t);

    /**
     *
     * @param t
     */
    void delete(T t);
}
