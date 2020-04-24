package com.vipul.springframework.spring5web.dataservice;

import com.vipul.springframework.spring5web.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherService  extends CrudRepository<Publisher, Long> {
}
