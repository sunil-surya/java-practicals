package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import utility.Student;
import utility.StudentDatabase;

public class StreamExample {

	public static void main(String[] args) {
		
		//Student name and activities in the map
		
		Predicate<Student> studentPredicate = student -> student.getGradelvel() > 2;
		Map<String, List<String>> studentMap = StudentDatabase.getAllStudents().stream()
				.filter(studentPredicate )
				.collect(Collectors.toMap(Student::getName,Student::getActivities));
		
			studentMap.forEach((name,activities)-> {
				System.out.println(name + " : "+activities);
			});
	}
}
