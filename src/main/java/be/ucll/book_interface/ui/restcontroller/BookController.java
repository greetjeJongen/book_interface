package be.ucll.book_interface.ui.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import be.ucll.book_interface.model.domain.Book;
import be.ucll.book_interface.model.service.BookService;

@RestController
@RequestMapping("api/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add")
    private boolean add(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/all")
    private List<Book> all() {
        return bookService.getBooks();
    }

    @GetMapping("/mostExpensive")
    private Book mostExpensive() {
        return bookService.getMostExpensiveBook();
    }

    @GetMapping("/booksWithPriceMoreThen")
    private List<Book> booksWithPriceMoreThen(@RequestParam double price) {
        return bookService.getBooksWithPriceMoreThen(price);
    }

    @GetMapping("/bookWithTitle/{title}")
    private Book bookWithTitle(@PathVariable String title) {
        return bookService.getBookWithTitle(title);
    }

    @GetMapping("/totalValue")
    private double totalValue() {
        return bookService.getTotalValueOfCollection();
    }

    @GetMapping("/booksInColor")
    private List<Book> booksInColor() {
        return bookService.getBooksInColor();
    }

    @GetMapping("/booksWithClassification")
    private List<Book> booksWithClassification(@RequestParam char c) {
        return bookService.getBooksWithClassification(c);
    }

}
