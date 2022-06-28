package be.ucll.book_interface.model.domain;

/**
 * A Book class
 */
public class Book {
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

}
