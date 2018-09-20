package ee.sda.patterns.structural.facade.dao;

import ee.sda.patterns.structural.facade.model.Author;

import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

public class AuthorDao {

    // we dont have a Database so we shall create and save list of authors in memory
    private List<Author> authors = asList(
            new Author("Robert C. Martin", "10.12.1955"),
            new Author ("Kent Beck", "23.10.1934"),
            new Author ("Dennis Ritchie", "01.10.1924")
    );


    // Google the usage of 'Optional' on line22
    // get an Author by its name
    public Optional <Author> findByName(String authorName) {
        return authors.stream()
                .filter(author -> author.getName().equalsIgnoreCase(authorName))
                .findFirst();
    }
}
