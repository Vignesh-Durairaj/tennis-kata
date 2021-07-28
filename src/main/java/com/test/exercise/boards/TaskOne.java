package com.test.exercise.boards;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.test.model.Department;

public class TaskOne {

	List<Department> departments = new ArrayList<Department>();
	
	Map<Long, Department> departMentByID = departments
			.stream().collect(Collectors.toMap(Department::getId,Function.identity()));
			
}
