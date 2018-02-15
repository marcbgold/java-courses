package org.wecancodeit.javacourses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

	Map<String, Course> courseList = new HashMap<>();

	public CourseRepository() {
		courseList.put("00001", new Course("00001", "Core Java", "Bob Bobberson", "Covers core fundamentals of Java, so that you can write stuff."));
		courseList.put("00002", new Course("00002", "Spring", "Dude Guy Sr.", "Covers Spring framework, so that you can put your Java stuff on the interwebs."));
		courseList.put("00003", new Course("00003", "Javascript", "Dude Guy Jr.", "Covers Javascript, so that your interwebs stuff looks cooler."));
	}

	public Collection<Course> getAllCourses() {
		return courseList.values();
	}

	public Course getCourseByID(String id) {
		return courseList.get(id);
	}

}
