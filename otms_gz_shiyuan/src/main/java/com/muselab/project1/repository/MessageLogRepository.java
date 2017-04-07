package com.muselab.project1.repository;

import org.springframework.data.repository.Repository;

import com.muselab.project1.domain.MessageLog;



public interface MessageLogRepository extends Repository<MessageLog,Long>{
	
	public void save(MessageLog messageLog);

}
