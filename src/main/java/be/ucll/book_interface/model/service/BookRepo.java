package be.ucll.book_interface.model.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.ucll.book_interface.model.domain.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    Book findByTitleContainingIgnoreCase(String title);

    Book findFirstByOrderByPriceDesc();

    List<Book> findByPriceGreaterThan(double price);

    List<Book> findByInColorIs(boolean inColor);

    List<Book> findByClassificationIs(char c);

}
