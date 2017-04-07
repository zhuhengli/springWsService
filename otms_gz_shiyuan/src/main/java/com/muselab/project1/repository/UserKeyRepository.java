package com.muselab.project1.repository;

import java.util.List;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.muselab.project1.domain.UserKey;

public interface UserKeyRepository extends JpaRepository<UserKey,String>{
	
	
   @Query(value = "select * from userKey where code=?1 ", nativeQuery = true)
   public  List<UserKey> findKeyByParam(String param);
   
}
