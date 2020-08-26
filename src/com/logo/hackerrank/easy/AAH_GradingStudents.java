package com.logo.hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class AAH_GradingStudents {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> result = new ArrayList<>();

		for (Integer grade : grades) {
			if (grade >= 38) {
				int unitGrade = grade % 10;
				if (unitGrade > 5) {
					unitGrade = unitGrade - 5;
				}
				int difference = 5 - unitGrade;

				if (difference > 0 && difference < 3) {
					grade = grade + difference;
				}
			}
			result.add(grade);
		}

		return result;
	}

	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);

		List<Integer> result = gradingStudents(grades);
		System.out.println(result);
	}

}
