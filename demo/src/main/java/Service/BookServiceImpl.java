package Service;

import Model.Book;
import Repository.BookRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class BookServiceImpl implements BookService  {


    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBook() {
        ArrayList<Book> book = new ArrayList<>();
        bookRepository.findAll().forEach(allBooks -> book.add(allBooks));
        return book;
    }


    @Override
    public void addBook(Book book) {

    }

    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void saveOrUpdate(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book getBooksById(Long Id) {
        return bookRepository.findById(Id).get();
    }

    @Override
    public void deleteBook(Long Id) {
        bookRepository.deleteById(Id);
    }


}
