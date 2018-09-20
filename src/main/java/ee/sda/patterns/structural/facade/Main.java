package ee.sda.patterns.structural.facade;
import ee.sda.patterns.structural.facade.dao.AuthorDao;
import ee.sda.patterns.structural.facade.dao.BookDao;
import ee.sda.patterns.structural.facade.model.BookInfo;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        BookInfoFacade bookInfoFacade = new BookInfoFacade(
                new AuthorDao(),
                new BookDao()
        );
        Optional<BookInfo> bookInfo = bookInfoFacade.getByName("Clean Code");
        if (bookInfo.isPresent()) {
            System.out.println(bookInfo);
        } else {
            System.out.println("No book was found");
        }
    }
}