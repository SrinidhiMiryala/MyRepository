package com.jnit;
import javax.persistence.*;

@Entity
@Table(name="wipro")
public class wipro {
        @Id
        @Column(name="eid")
        private int eid;
        @Column(name="name")
        private String name;
        @Column(name="salary")
        private int salary;
        @Column(name="branch")
        private String branch;
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
        
}
