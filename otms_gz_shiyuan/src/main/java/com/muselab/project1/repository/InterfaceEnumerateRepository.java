package com.muselab.project1.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.muselab.project1.domain.InterfaceEnumerate;

public interface InterfaceEnumerateRepository extends JpaRepository<InterfaceEnumerate,String>{

	  @Query(value = "select * from table_enumerate where key_word=?1 and interface_name=?2 ", nativeQuery = true)
	  public  List<InterfaceEnumerate> findEnumerateByParam(String param1,String param2);
	  
	  @Query(value = "select * from table_enumerate where key_word=?1 and interface_name=?2 ", nativeQuery = true)
	  public  InterfaceEnumerate findEnumerateByParamOne(String param1,String param2);
	
}
