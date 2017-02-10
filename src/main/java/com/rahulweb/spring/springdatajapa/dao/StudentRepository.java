package com.rahulweb.spring.springdatajapa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rahulweb.spring.springdatajapa.model.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer>{
	
	  
	  @Query(value = "SELECT distinct s.studentname "
			  		+"FROM StudentEntity s, MarksEntity m "
		  			+"WHERE     s.courseid = m.courseid "
			        +"AND s.studentid = m.studentid "
			        +"AND m.courseid  in (select c.courseid from CourseEntity c where c.coursename = ?1) "
			        +"AND NOT EXISTS (SELECT 1 FROM MarksEntity  m1 where  s.courseid = m1.courseid "
			        +"AND s.studentid = m1.studentid "
			        +"AND m1.marks <= 50)")
	  List<String> passsedInCourse(String coursename);
	  
	  @Query(value = "SELECT s.studentname "
			  		+"FROM StudentEntity s, CourseEntity c "
		  			+"WHERE     s.courseid = c.courseid "
		  			+"AND s.courseid IN (SELECT c.courseid "
                    +"FROM CourseEntity c "
                    +"WHERE c.coursename = ?1)")
	  List<String> nameByCourse(String coursename);
	  
	  @Query(value = "select a.studentname from (SELECT s.studentname ,s.courseid ,AVG(m.marks),RANK() OVER (PARTITION BY s.courseid ORDER BY AVG(m.marks) desc) val "
			  		+"FROM Student s, Marks m "
		  			+"WHERE     s.courseid = m.courseid "
		  			+"AND s.studentid = m.studentid "
		  			/*+"AND m.courseid  in (select c.courseid from CourseEntity c where c.coursename = ?1)"*/
		  			+"group by s.studentname,s.courseid)a where val = 1", nativeQuery = true)	  
	  List<String> topInCourse();
	  

	  
	  @Query(value = "SELECT s.studentname,m.subjectname "
			  		+"FROM StudentEntity s, MarksEntity m "
			  		+"WHERE  s.courseid = m.courseid "
			  		+"AND s.studentid = m.studentid "
			  		+"and m.marks <50")
	  List<Object[]> failedInSub();
	  
	  
	  @Query(value = "select s.studentname,a.city,a.state from StudentEntity s , AddressEntity a where s.studentid = a.studentid ")
	  List<Object[]> studentByState();
	  
	  @Query(value = "select s.studentname from StudentEntity s where s.age > 20")
	  List<String> ageGreaterThan();
	  
}
