package com.portfolio.shoppingmall_api;

import com.portfolio.shoppingmall_api.dto.MemberTest;
import com.portfolio.shoppingmall_api.mapper.MemberTestMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final MemberTestMapper mapper;

    public Controller(MemberTestMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/")
    public String home() {
        return "Api Server is running";
    }

    @GetMapping("/api/members-test")
    public List<MemberTest> membersTest() {
        return mapper.findAll();
    }
}