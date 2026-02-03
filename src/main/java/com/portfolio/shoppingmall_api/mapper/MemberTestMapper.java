package com.portfolio.shoppingmall_api.mapper;

import com.portfolio.shoppingmall_api.dto.MemberTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberTestMapper {
    @Select("""
        SELECT ID, NAME, CREATED_AT
        FROM MEMBER_TEST
        ORDER BY ID
    """)
    List<MemberTest> findAll();
}
