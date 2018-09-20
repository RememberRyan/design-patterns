package ee.sda.patterns.structural.facade.dao;

import ee.sda.patterns.structural.facade.model.Book;

import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

public class BookDao {
    private List<Book> authors = asList(
            new Book("Clean Code", "10.12.1955", "Robert C. Martin"),
            new Book ("TDD by Example", "23.10.1934", "Kent Beck"),
            new Book("C Programming Language", "2342342525463", "Dennis Ritchie")
    );


    // Google the usage of 'Optional' on line22
    // get an Author by its name
    public Optional<Book> findByName(String bookName) {
        return authors.stream()
                .filter(author -> author.getName().equalsIgnoreCase(bookName))
                .findFirst();
    }
}
