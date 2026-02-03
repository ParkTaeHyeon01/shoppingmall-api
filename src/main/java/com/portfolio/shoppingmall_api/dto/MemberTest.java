package com.portfolio.shoppingmall_api.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class MemberTest {
    private Long id;
    private String name;
    private LocalDateTime createdAt;
}
