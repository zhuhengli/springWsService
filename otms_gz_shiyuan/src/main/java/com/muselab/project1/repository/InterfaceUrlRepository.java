package com.muselab.project1.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.muselab.project1.domain.InterfaceUrl;

public interface InterfaceUrlRepository extends JpaRepository<InterfaceUrl,String> {

	  @Query(value = "select * from table_interfaceurl where code=?1 ", nativeQuery = true)
	  public  List<InterfaceUrl> findurlByparam(String param);
	  
	  @Query(value = "select * from table_interfaceurl where code=?1 ", nativeQuery = true)
	  public InterfaceUrl findOne(String param);
	
	
}
