package com.muselab.project1.service;

import com.muselab.project1.domain.MessageLog;

public interface LogMessageService {
	
	/**
	 * 写入请求报文
	 */
    public void logMessage(MessageLog messageLog);
}
