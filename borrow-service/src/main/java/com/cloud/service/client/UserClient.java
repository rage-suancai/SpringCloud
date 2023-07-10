package com.cloud.service.client;

import com.cloud.service.client.remedy.UserFallbackClient;
import com.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// @FeignClient("userservice")
@FeignClient(value = "userservice", fallback = UserFallbackClient.class)
public interface UserClient {

    @GetMapping("/api/user/{uid}")
    User getUserById(@PathVariable("uid") Integer uid);

}
