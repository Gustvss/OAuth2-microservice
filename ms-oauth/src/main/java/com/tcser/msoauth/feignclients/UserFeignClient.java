package com.tcser.msoauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.tcser.msoauth.entities.User;

@Component
@FeignClient(name = "ms-user")
public interface UserFeignClient {
    @GetMapping(value = "/users/search")
    ResponseEntity<User> findByEmail(@RequestParam String email);
}

