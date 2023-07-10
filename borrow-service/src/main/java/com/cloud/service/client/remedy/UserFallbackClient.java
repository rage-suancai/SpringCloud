package com.cloud.service.client.remedy;

import com.cloud.service.client.UserClient;
import com.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserFallbackClient implements UserClient {

    @Override
    public User getUserById(Integer uid) {

        User user = new User(); user.setName("我是替代方案");
        return user;

    }

}
