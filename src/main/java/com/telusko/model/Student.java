package com.telusko.model;

/*import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;*/
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="StudentTable")
/*
 * @Cacheable
 * 
 * @Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
 */
public class Student {
	
	@Id
	@Column(name="SID")
	private Integer Id;
	
	@Column(name="SNAME")
	private String sname;
	
	@Column(name="SCITY")
	private String scity;
	
	public Student() {
	
		System.out.println("Zero param COnstructor for Hibernate");
		
	}
	
	

	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", sname=" + sname + ", scity=" + scity + "]";
	}
	
	

	
}
