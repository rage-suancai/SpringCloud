package com.cloud.controller;

import com.cloud.dto.UserBorrowDetail;
import com.cloud.service.BorrowService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;

@RestController
public class BorrowController {

    @Resource
    private BorrowService borrowService;


    @GetMapping("/api/borrow/{uid}")
    public UserBorrowDetail getUserBorrowDetailByUid(@PathVariable("uid") Integer uid) {
        return borrowService.getUserBorrowDetailByUid(uid);
    }

    /*@HystrixCommand(fallbackMethod = "onError")
    @GetMapping("/api/borrow/{uid}")
    public UserBorrowDetail getUserBorrowDetailByUid(@PathVariable("uid") Integer uid) {

        System.err.println("开始向其它服务获取信息");
        return borrowService.getUserBorrowDetailByUid(uid);

    }
    private UserBorrowDetail onError(Integer uid) {

        System.err.println("服务错误 进入备选方案");
        return new UserBorrowDetail(null, Collections.emptyList());

    }*/

}
