package com.project;

import com.project.domain.Member;
import com.project.domain.Team;
import com.project.repository.MemberRepository;
import com.project.repository.TeamRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QuerySelectTest {

    @Autowired private MemberRepository memberRepository;
    @Autowired private TeamRepository teamRepository;

    @Test
    void testMember() {
        Member member = memberRepository.findMemberByName("TESTc0fca718-f879-11ed-957a-005056c00001");
        System.out.println(member.getName());
        System.out.println(member.getId());
    }

    @Test
    void testTeam() {
        Team team = teamRepository.findByName("A팀");
        System.out.println(team.getName());
    }
}
