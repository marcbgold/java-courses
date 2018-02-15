package org.wecancodeit.javacourses;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {

	@Resource
	CourseRepository repository;

	@RequestMapping("/course")
	public String showCourse(@RequestParam(value = "courseId", required = true) String id, Model model) {
		model.addAttribute("currentCourse", repository.getCourseByID(id));
		return "course";
	}

	@RequestMapping("/course-listing")
	public String showAllCourses(Model model) {
		model.addAttribute("courseListing", repository.getAllCourses());
		return "courses";

	}
}
