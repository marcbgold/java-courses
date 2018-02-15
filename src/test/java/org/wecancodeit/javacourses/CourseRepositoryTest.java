package org.wecancodeit.javacourses;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CourseRepositoryTest {

	@Test
	public void shouldFindCourseByID() {
		CourseRepository underTest = new CourseRepository();
		Course found = underTest.getCourseByID("00001");

		assertThat(found.getName(), is("Core Java"));
	}

}
