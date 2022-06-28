package be.ucll.book_interface.model.service;

import java.util.ArrayList;
import java.util.List;

import be.ucll.book_interface.model.domain.Book;

public class BookService {
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public double getTotalValueOfCollection() {
        double result = 0;
        for (Book book : books) {
            result += book.getPrice();
        }
        return result;
    }

    public Book getBookWithTitle(String title) {
        for (Book book : getBooks()) {
            if (book.getTitle().equals(title))
                return book;
        }
        return null;
    }

    public Book getMostExpensiveBook() {
        if (this.getBooks().size() == 0)
            return null;
        Book result = getBooks().get(0);
        for (Book book : books) {
            if (book.getPrice() > result.getPrice())
                result = book;
        }
        return result;
    }

    public List<Book> getBooksWithPriceMoreThen(double price) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPrice() > price)
                result.add(book);
        }
        return result;
    }

    public List<Book> getBooksInColor() {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.isInColor())
                result.add(book);
        }
        return result;
    }

    public List<Book> getBooksWithClassification(char c) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getClassification() == c)
                result.add(book);
        }
        return result;
    }

    public boolean addBook(Book book) {
        if (book == null)
            return false;
        if (getBookWithTitle(book.getTitle()) != null)
            return false;
        this.books.add(book);
        return true;
    }

    public Book removeBook(Book book) {
        if (books.remove(book))
            return book;
        return null;
    }

    public Book removeBook(String title) {
        Book book = this.getBookWithTitle(title);
        if (book != null) {
            books.remove(book);
            return book;
        }
        return null;
    }
}
