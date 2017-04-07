package com.muselab.project1.repository;

import com.muselab.project1.domain.Member;
import com.muselab.project1.domain.Team;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by 1002428 on 16. 1. 3..
 */
//@EnableJpaRepositories
public interface MemberRepository extends Repository<Member,Long> {

    public List<Member> findByName(String name);

    @Query(value ="select * from member1",nativeQuery = true)
    public List<Member> findAll();

    public void save(Member member);

//    public void save(Team team);
}
