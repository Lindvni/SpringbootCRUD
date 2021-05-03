package Service;

import Model.Book;

import java.util.List;

public interface BookService {

    public void addBook(Book book);

    public void updateBook(Book book);

    public void saveOrUpdate(Book book);

    public Book getBooksById(Long Id);

    public void deleteBook(Long Id);

    public List<Book> getAllBook();
}
