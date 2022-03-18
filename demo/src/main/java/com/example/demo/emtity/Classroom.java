package com.example.demo.emtity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "classroom")
public class Classroom implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "classroom_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int classroom_id;

	@Column(name = "name")	
	private String name;

	@Column(name = "is_availible")

	private boolean is_availible;

	public Classroom(int classroom_id, String name, boolean is_availible) {
		super();
		this.classroom_id = classroom_id;
		this.name = name;
		this.is_availible = is_availible;
	}

	public Classroom() {
		super();
	}

	public int getClassroom_id() {
		return classroom_id;
	}

	public void setClassroom_id(int classroom_id) {
		this.classroom_id = classroom_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIs_availible() {
		return is_availible;
	}

	public void setIs_availible(boolean is_availible) {
		this.is_availible = is_availible;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Classroom(String name, boolean is_availible) {
		super();
		this.name = name;
		this.is_availible = is_availible;
	}

//	@OneToMany(fetch = FetchType.LAZY)	
//	@JoinColumn(name = "classroom_id")
//	Set<Student> list = new HashSet<>();
	
	

	

}
