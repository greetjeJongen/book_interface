package be.ucll.book_interface.model.service;

import java.util.ArrayList;
import java.util.List;

import be.ucll.book_interface.model.domain.Book;

public class BookService {
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

}
