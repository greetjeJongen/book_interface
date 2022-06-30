package be.ucll.book_interface.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.ucll.book_interface.model.domain.Book;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public BookService() {
    }

    public List<Book> getBooks() {
        return bookRepo.findAll();
    }

    public double getTotalValueOfCollection() {
        double result = 0;
        for (Book book : getBooks()) {
            result += book.getPrice();
        }
        return result;
    }

    public Book getBookWithTitle(String title) {
        return bookRepo.findByTitleContainingIgnoreCase(title);
    }

    public Book getMostExpensiveBook() {
        if (this.getBooks().size() == 0)
            return null;
        return bookRepo.findFirstByOrderByPriceDesc();
    }

    public List<Book> getBooksWithPriceMoreThen(double price) {
        return bookRepo.findByPriceGreaterThan(price);
    }

    public List<Book> getBooksInColor() {
        return bookRepo.findByInColorIs(true);
    }

    public List<Book> getBooksWithClassification(char c) {
        return bookRepo.findByClassificationIs(c);
    }

    public boolean addBook(Book book) {
        if (book == null)
            return false;
        if (getBookWithTitle(book.getTitle()) != null)
            return false;
        bookRepo.save(book);
        return true;
    }

    public Book removeBook(Book book) {
        if (book == null || this.getBookWithTitle(book.getTitle()) == null)
            return null;
        bookRepo.delete(book);
        return book;
    }

    public Book removeBook(String title) {
        Book book = this.getBookWithTitle(title);
        return this.removeBook(book);
    }
}
