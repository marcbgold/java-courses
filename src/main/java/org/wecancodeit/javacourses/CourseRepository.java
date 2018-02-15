package org.wecancodeit.javacourses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {

	Map<Long, Course> courseList = new HashMap<>();

	public CourseRepository() {
		courseList.put(00001L, new Course(00001L, "Core Java", "Bob Bobberson", "Covers core fundamentals of Java, so that you can write stuff."));
		courseList.put(00002L, new Course(00002L, "Spring", "Dude Guy Sr.", "Covers Spring framework, so that you can put your Java stuff on the interwebs."));
		courseList.put(00003L, new Course(00003L, "Javascript", "Dude Guy Jr.", "Covers Javascript, so that your interwebs stuff looks cooler."));
	}

	public Collection<Course> getAllCourses() {
		return courseList.values();
	}

	public Course getCourseByID(Long id) {
		return courseList.get(id);
	}

}
