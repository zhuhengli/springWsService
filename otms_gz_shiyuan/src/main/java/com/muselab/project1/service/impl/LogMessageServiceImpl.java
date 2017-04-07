package com.muselab.project1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.muselab.project1.domain.MessageLog;
import com.muselab.project1.repository.MessageLogRepository;
import com.muselab.project1.service.LogMessageService;

@Service
@Transactional
public class LogMessageServiceImpl implements LogMessageService{
    
	@Autowired
	private MessageLogRepository messageLogRepository;
	
	@Override
	public void logMessage(MessageLog messageLog) {
		// TODO Auto-generated method stub
		//messageLog.setId(null);
		this.messageLogRepository.save(messageLog);
	}

}
