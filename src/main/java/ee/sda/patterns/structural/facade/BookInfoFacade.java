package ee.sda.patterns.structural.facade;

import ee.sda.patterns.structural.facade.dao.AuthorDao;
import ee.sda.patterns.structural.facade.dao.BookDao;
import ee.sda.patterns.structural.facade.model.Author;
import ee.sda.patterns.structural.facade.model.Book;
import ee.sda.patterns.structural.facade.model.BookInfo;

import java.util.Optional;

public class BookInfoFacade {

    /*
     how do we get the dao objects from here?
     For our example we'll just use a constructor
    */


    private AuthorDao authorDao;
    private BookDao bookDao;

    public BookInfoFacade(AuthorDao authorDao, BookDao bookDao) {
        this.authorDao = authorDao;
        this.bookDao = bookDao;
    }

    public Optional<BookInfo> getByName(String bookName) {
        Optional<Book> book = bookDao.findByName(bookName);
        if (book.isPresent()) {
            Book foundBook = book.get();
            Optional<Author> author = authorDao.findByName(foundBook.getAuthorName());
            if (author.isPresent()) {
                Author foundAuthor = author.get();
                return Optional.of(new BookInfo(foundBook, foundAuthor));
            } else {
                return Optional.empty();
            }
        } else {
            return Optional.empty(); // 'empty()' is factory method
        }
    }
}