package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ElectronicDevice {

    /**
     *
     */
    private long id;
    /**
     *
     */
    private Person p;
    /**
     *
     */
    private int watts;


    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }
}
