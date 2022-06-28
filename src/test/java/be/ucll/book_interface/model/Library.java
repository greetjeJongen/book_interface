package be.ucll.book_interface.model;

import be.ucll.book_interface.model.domain.Book;

public class Library {
    public static Book aBookTheHobbit() {
        Book book_hobbit_inColor = new Book("The Hobbit", 1, 25.5);
        book_hobbit_inColor.setInColor(true);
        book_hobbit_inColor.setPublisher("George Allen & Unwin");
        book_hobbit_inColor.setClassification(('a'));
        return book_hobbit_inColor;
    }

    public static Book aBookHarryPotter() {
        Book book_harryPotter_notInColor = new Book("Harry Potter", 5, 20.07);
        book_harryPotter_notInColor.setPublisher("Bloomsbury Publisher");
        book_harryPotter_notInColor.setClassification('y');
        return book_harryPotter_notInColor;
    }

    public static Book aBookDonQuichot() {
        Book book_donQuichotte = new Book("Don Quichotte", 3, 20.7);
        book_donQuichotte.setPublisher("Good Press");
        book_donQuichotte.setClassification('a');
        book_donQuichotte.setInColor(true);
        return book_donQuichotte;
    }

    public static Book aBookToKillAMockingbird() {
        return new Book("To kill a Mockingbird", 1, 35.03);
    }

    public static Book aBookJaneEyre() {
        return new Book("Jane Eyre", 4, 33.02);
    }

    public static Book anExtraBook() {
        return new Book("The Extra", 3, 22.00);
    }

}
