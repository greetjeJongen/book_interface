package be.ucll.book_interface.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * A Book class
 */
@Entity
public abstract class Book implements Loanable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int numberInStock;
    private double price;
    private String publisher;
    private boolean inColor;
    private char classification;

    public Book() {
    }

    public Book(String title, int numberInStock, double price) {
        this.title = title;
        this.numberInStock = numberInStock;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInColor() {
        return inColor;
    }

    public void setInColor(boolean inColor) {
        this.inColor = inColor;
    }

    public char getClassification() {
        return classification;
    }

    public void setClassification(char classification) {
        this.classification = classification;
    }

    public int increaseStock(int number) {
        this.numberInStock += number;
        return numberInStock;
    }

    public double givePriceInDollar() {
        return this.getPrice() * 1.06;
    }

    public String toString() {
        String not = (isInColor()) ? "" : " not";
        return title + ", published by " + getPublisher()
                + " costs €" + getPrice() + ". There are " + getNumberInStock()
                + " items present. The book has classification "
                + getClassification() + " and is"
                + not + " in color.";

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !o.getClass().equals(this.getClass()))
            return false;
        Book other = (Book) o;
        return other.getTitle().equals(this.getTitle());
    }

    @Override
    public String getCode() {
        return getId() + "-" + this.getClass().getSimpleName() + "-";
    }

}
