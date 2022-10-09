package com.ex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

	@Modifying
	@Transactional
	@Query("update Student s set s.marks=?1 where s.id=?2")
	void updateMarks(int marks,int id);
}
