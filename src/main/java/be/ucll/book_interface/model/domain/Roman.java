package be.ucll.book_interface.model.domain;

import javax.persistence.Entity;

@Entity
public class Roman extends Book {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getCode() {
        return super.getCode() + getLocation();
    }

}
