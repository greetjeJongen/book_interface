package be.ucll.book_interface.model.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import be.ucll.book_interface.model.Library;
import be.ucll.book_interface.model.domain.Book;

public class BookService_test {
    private BookService service, emptyService;
    private Book aBookDonQuichot = Library.aBookDonQuichot();
    private Book aBookHarryPotter = Library.aBookHarryPotter();
    private Book aBookJaneEyre = Library.aBookJaneEyre();
    private Book aBookTheHobbit = Library.aBookTheHobbit();
    private Book aBookToKillAMockingbird = Library.aBookToKillAMockingbird();
    private Book anExtraBook = Library.anExtraBook();

    @BeforeEach
    public void setUp() {
        emptyService = new BookService();

        service = new BookService();
        service.addBook(aBookDonQuichot);
        service.addBook(aBookHarryPotter);
        service.addBook(aBookJaneEyre);
        service.addBook(aBookTheHobbit);
        service.addBook(aBookToKillAMockingbird);
    }

    @Test
    public void getBooks_returns_list_with_all_books() {
        assertEquals(5, service.getBooks().size());
        assertTrue(service.getBooks().contains(aBookDonQuichot));
        assertTrue(service.getBooks().contains(aBookToKillAMockingbird));
    }

    @Test
    public void getTotalValueOfCollection_returns_correct_value() {
        assertEquals(134.32, service.getTotalValueOfCollection());
    }

    @Test
    public void getMostExpensiveBook_returns_most_expensive_when_service_contains_books() {
        assertEquals(aBookToKillAMockingbird, service.getMostExpensiveBook());
    }

    @Test
    public void getMostExpensiveBook_returns_null_when_no_books_in_service() {
        assertNull(emptyService.getMostExpensiveBook());
    }

    @Test
    public void getBooksWithPriceMoreThen_returns_list_when_price_positive_and_books_are_found() {
        List<Book> books = service.getBooksWithPriceMoreThen(30);
        assertEquals(2, books.size());
        assertTrue(books.contains(aBookJaneEyre));
        assertTrue(books.contains(aBookToKillAMockingbird));
    }

    @Test
    public void getBooksWithPriceMoreThen_returns_all_books_when_price_negative_and_books_in_list() {
        List<Book> books = service.getBooksWithPriceMoreThen(Integer.MIN_VALUE);
        assertEquals(service.getBooks().size(), books.size());
    }

    @Test
    public void getBooksWithPriceMoreThen_returns_empty_list_when_price_positive_and_no_books_are_found() {
        List<Book> books = service.getBooksWithPriceMoreThen(300);
        assertEquals(0, books.size());
    }

    @Test
    public void getBooksWithPriceMoreThen_returns_empty_list_when_service_is_empty() {
        List<Book> books = emptyService.getBooksWithPriceMoreThen(0);
        assertEquals(0, books.size());
    }

    @Test
    public void getBookWithTitle_returns_book_when_book_in_service() {
        assertEquals(aBookHarryPotter, service.getBookWithTitle(aBookHarryPotter.getTitle()));
        assertEquals(aBookJaneEyre, service.getBookWithTitle(aBookJaneEyre.getTitle()));
    }

    @Test
    public void getBookWithTitle_returns_null_when_book_not_in_service() {
        assertNull(service.getBookWithTitle("abc"));
    }

    @Test
    public void getBookWithTitle_returns_null_when_title_is_null() {
        assertNull(service.getBookWithTitle(null));
    }

    // todo
    // booksInColor
    // getBooksWithClassification

    @Test
    public void addBook_returns_true_when_valid_book_is_added() {
        assertEquals(5, service.getBooks().size());
        assertTrue(service.addBook(anExtraBook));
        assertEquals(6, service.getBooks().size());
        assertTrue(service.getBooks().contains(anExtraBook));
    }

    @Test
    public void addBook_returns_false_and_nothing_is_added_when_book_is_added_twice() {
        assertFalse(service.addBook(aBookDonQuichot));
        assertEquals(5, service.getBooks().size());
    }

    @Test
    public void addBook_returns_false_when_null_is_added() {
        assertFalse(service.addBook(null));
    }

    @Test
    public void removeBook_book_returns_deleted_book_when_present() {
        assertEquals(aBookHarryPotter, service.removeBook(aBookHarryPotter));
        assertEquals(4, service.getBooks().size());
        assertNull(service.getBookWithTitle(aBookHarryPotter.getTitle()));
    }

    @Test
    public void removeBook_book_returns_null_when_book_not_in_service() {
        assertNull(service.removeBook(anExtraBook));
        assertEquals(5, service.getBooks().size());
    }

    @Test
    public void removeBook_book_returns_null_when_empty_service() {
        assertNull(service.removeBook(anExtraBook));
    }

    @Test
    public void removeBook_title_returns_deleted_book_when_present() {
        assertEquals(aBookHarryPotter, service.removeBook(aBookHarryPotter.getTitle()));
        assertEquals(4, service.getBooks().size());
        assertNull(service.getBookWithTitle(aBookHarryPotter.getTitle()));
    }

    @Test
    public void removeBook_title_returns_null_when_book_not_in_service() {
        assertNull(service.removeBook(anExtraBook.getTitle()));
        assertEquals(5, service.getBooks().size());
    }

    @Test
    public void removeBook_title_returns_null_when_empty_service() {
        assertNull(service.removeBook(anExtraBook.getTitle()));
    }
}
