package com.cloud.service.client.remedy;

import com.cloud.service.client.BookClient;
import com.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookFallbackClient implements BookClient {

    @Override
    public Book findBookById(Integer bid) {
        return new Book();
    }

}
