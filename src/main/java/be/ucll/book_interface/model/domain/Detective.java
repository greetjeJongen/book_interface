package be.ucll.book_interface.model.domain;

import javax.persistence.Entity;

@Entity
public class Detective extends Book {
    private int numberOfMurders;

    public int getNumberOfMurders() {
        return numberOfMurders;
    }

    public void setNumberOfMurders(int numberOfMurders) {
        this.numberOfMurders = numberOfMurders;
    }

    @Override
    public String getCode() {
        return super.getCode() + getNumberOfMurders();
    }
}
