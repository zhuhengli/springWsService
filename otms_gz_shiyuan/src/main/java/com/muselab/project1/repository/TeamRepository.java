package com.muselab.project1.repository;

import com.muselab.project1.domain.Team;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by 1002428 on 16. 1. 6..
 */
public interface TeamRepository extends Repository<Team,String> {

    public void save(Team team);

    public List<Team> findByTeamName(String teamName);

    public Team findOne(String teamCode);
}
