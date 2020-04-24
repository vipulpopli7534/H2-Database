package com.vipul.springframework.spring5web.dataservice;

import com.vipul.springframework.spring5web.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookService extends CrudRepository<Book, Long> {
}
