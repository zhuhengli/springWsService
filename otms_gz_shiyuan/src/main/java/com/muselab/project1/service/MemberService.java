package com.muselab.project1.service;

import com.muselab.project1.domain.Member;
import com.muselab.project1.domain.Team;
import com.muselab.project1.repository.MemberRepository;
import com.muselab.project1.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 1002428 on 16. 1. 3..
 */
@Service
@Transactional
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TeamRepository teamRepository;

    public List<Member> findByName(String name) {
        return memberRepository.findByName(name);
        //return memberRepository.findByLikeName(name);
    }
    
    
    public List<Member> findAll() {
        return memberRepository.findAll();
        //return memberRepository.findByLikeName(name);
    }

    public Long save(Member member) {
//        Team team = new Team("team1","ocb개발팀");
//        member.setTeam(team);
        memberRepository.save(member);
        return member.getId();
    }

    public void save(Team team) {
        System.out.println(team.getTeamCode());
        System.out.println(team.getTeamName());
        teamRepository.save(team);
    }

    public List<Team> findByTeamName(String teamName) {
        return teamRepository.findByTeamName(teamName);
    }

    public Team findOneTeam(String teamCode) {
        return teamRepository.findOne(teamCode);
    }

}
