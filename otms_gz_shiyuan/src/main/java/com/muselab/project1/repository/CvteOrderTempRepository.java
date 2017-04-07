package com.muselab.project1.repository;



import org.springframework.data.repository.Repository;


import com.muselab.project1.domain.CvteOrderTemp;


public interface CvteOrderTempRepository extends Repository<CvteOrderTemp, String> {
    
	public void save(CvteOrderTemp cvteOrderTemp);
	
	
	
	public void delete(String otmsCode);
	
}
