package com.vipul.springframework.spring5web.dataservice;

import com.vipul.springframework.spring5web.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorService extends CrudRepository<Author, Long> {
}
