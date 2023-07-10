package com.cloud.service.client;

import com.cloud.service.client.remedy.BookFallbackClient;
import com.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "bookservice", fallback = BookFallbackClient.class)
public interface BookClient {

    @GetMapping("/api/book/{bid}")
    Book findBookById(@PathVariable("bid") Integer bid);

}
