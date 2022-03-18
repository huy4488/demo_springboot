package com.example.demo.emtity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "student")
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;
	
//	@ForeignKey(name = "classroom_id")
//	@Column(name = "classroom_id")
//	private String classroom_id;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "classroom_id")
	private Classroom classroom;	

	

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int student_id, String name, String address) {
		super();
		this.id = student_id;
		this.name = name;
		this.address = address;
	}

	public int getStudent_id() {
		return id;
	}

	public void setStudent_id(int student_id) {
		this.id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
