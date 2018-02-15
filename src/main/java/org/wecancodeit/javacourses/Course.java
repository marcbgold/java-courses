package org.wecancodeit.javacourses;

public class Course {

	private String id;
	private String name;
	private String description;
	private String instructor;

	public Course(String id, String name, String instructor, String description) {
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getInstructor() {
		return instructor;
	}

}
