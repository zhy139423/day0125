package com.zhy.entity;

import java.util.List;

public class Classes {
	private int id;
	private String name;
	private List<Student> students;
	private String aaa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Classes() {

	}

	public Classes(int id, String name, List<Student> students) {
		this.id = id;
		this.name = name;
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Classes{" +
				"id=" + id +
				", name='" + name + '\'' +
				", students=" + students +
				'}';
	}
}