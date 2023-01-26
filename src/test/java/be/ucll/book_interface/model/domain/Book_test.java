package be.ucll.book_interface.model.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Book_test {
    private Book book_hobbit_inColor;
    private Book book_harryPotter_notInColor;

    // @BeforeEach
    // public void setUp() {
    // book_hobbit_inColor = new Book("The Hobbit", 1, 25.5);
    // book_hobbit_inColor.setInColor(true);
    // book_hobbit_inColor.setPublisher("George Allen & Unwin");
    // book_hobbit_inColor.setClassification(('a'));

    // book_harryPotter_notInColor = new Book("Harry Potter", 5, 20.07);
    // book_harryPotter_notInColor.setPublisher("Bloomsbury Publisher");
    // book_harryPotter_notInColor.setClassification('y');

    // }

    // @Test
    // public void book_has_properties_when_constructorWithPropertiesIsCalled() {
    // String title = "The Hobbit";
    // int numberInStock = 1;
    // double price = 25.25;
    // Book book = new Book(title, numberInStock, price);
    // assertEquals(title, book.getTitle());
    // assertEquals(numberInStock, book.getNumberInStock());
    // assertEquals(price, book.getPrice());
    // assertFalse(book.isInColor());
    // assertNull(book.getPublisher());
    // assertEquals(book.getClassification(), '\u0000');
    // }

    // @Test
    // public void book_hobbit_has_all_properties_when_setup_called() {
    // assertTrue(book_hobbit_inColor.isInColor());
    // assertEquals("George Allen & Unwin", book_hobbit_inColor.getPublisher());
    // assertEquals('a', book_hobbit_inColor.getClassification());

    // }

    // @Test
    // public void givePriceInDollar_calculates_correct_price() {
    // assertEquals(25.5 * 1.06, book_hobbit_inColor.givePriceInDollar());
    // }

    // @Test
    // public void increaseStock_returns_new_value_when_stock_is_increased_with_2()
    // {
    // assertEquals(3, book_hobbit_inColor.increaseStock(2));
    // }

    // @Test
    // public void increaseStock_returns_new_value_when_stock_is_decreased_with_1()
    // {
    // assertEquals(0, book_hobbit_inColor.increaseStock(-1));
    // }

    // @Test
    // public void toString_returns_correct_value_when_book_in_color() {
    // String out = "The Hobbit, published by George Allen & Unwin costs €25.5.
    // There are 1 items present. The book has classification a and is in color.";
    // assertEquals(out, book_hobbit_inColor.toString());
    // }

    // @Test
    // public void toString_returns_correct_value_when_book_not_in_color() {
    // String out = "Harry Potter, published by Bloomsbury Publisher costs €20.07.
    // There are 5 items present. The book has classification y and is not in
    // color.";
    // assertEquals(out, book_harryPotter_notInColor.toString());
    // }

}
