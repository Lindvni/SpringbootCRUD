package Controllers;

import Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import Model.Book;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBook() {
        return bookService.getAllBook();
    }

    @GetMapping("/book/{Id}")
    public Book getBookDetails(@PathVariable("bookid") Long Id) {
        return bookService.getBooksById(Id);
    }

    @PostMapping("/book")
    public Long saveBook(@RequestBody Book book) {
        bookService.saveOrUpdate(book);
        return book.getId();
    }

    @DeleteMapping("/book/{Id}")
    public void deleteBook(@PathVariable("Id") Long Id) {
        bookService.deleteBook(Id);
    }

    @PutMapping("/book")
    public Book updateBook(@RequestBody Book book) {
        bookService.saveOrUpdate(book);
        return book;
    }

}
