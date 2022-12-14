package com.ex;

import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
@Repository
public class StudentDao extends JdbcDaoSupport{
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	void intialize() {
		setDataSource(dataSource);
		
	}
	
	public void insert(Student st) {
		getJdbcTemplate().execute("insert into student values("+st.getSid()+" ,"+st.getMarks()+" ,"+st.getName()+"')");
	}
	
	public void select() {
		List li=getJdbcTemplate().queryForList("select * from student");
		Iterator i=li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}