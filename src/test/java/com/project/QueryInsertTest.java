package com.project;

import com.project.domain.Member;
import com.project.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QueryInsertTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void test() {
        Member member = new Member("test10294035");
        memberRepository.save(member);
    }
}
