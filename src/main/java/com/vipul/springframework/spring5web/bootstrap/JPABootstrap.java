package com.vipul.springframework.spring5web.bootstrap;

import com.vipul.springframework.spring5web.dataservice.AuthorService;
import com.vipul.springframework.spring5web.dataservice.BookService;
import com.vipul.springframework.spring5web.model.Author;
import com.vipul.springframework.spring5web.model.Book;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class JPABootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final AuthorService authorService;
    private final BookService bookService;

    public JPABootstrap(AuthorService authorService, BookService bookService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initializeData();
    }

    private void initializeData() {
        Author eric = new Author("vipul", "popli");
        Book  ddd = new Book("Domain Driven Design", "1234", "Harper Collins");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorService.save(eric);
        bookService.save(ddd);


        //Rod
        Author rod = new Author("kanika", "popli");
        Book noEJB = new Book("J2EE Development without EJB", "23444", "Wrox" );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorService.save(rod);
        bookService.save(noEJB);
    }
}
