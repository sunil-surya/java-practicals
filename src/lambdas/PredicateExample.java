package lambdas;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import utility.Student;
import utility.StudentDatabase;

public class PredicateExample {

	public static void main(String[] args) {

		/*
		 * Its takes one argument, do some operations and return boolean
		 * 
		 * interface Predicate<T>{ boolean test(T t); default Predicate<T>
		 * and(Predicate<T> other) default Predicate<T> or(Predicate<T> other) default
		 * Predicate<T> negate(Predicate<T> other); static isEquals(Object obj)
		 */

		// Check whether the number is even or not

		Predicate<Integer> p1 = n -> n % 2 == 0;

		// Check whether the number is even and also divided by 5

		Predicate<Integer> p2 = n -> n % 5 == 0;

		int i = 10;

		if (p1.and(p2).test(i)) {
			System.out.println("Number is even and number is divisable by 5");
		} else if (p1.or(p2).test(i)) {
			System.out.println("Number is even or  divisable by 5");
		} else {
			System.out.println("Number is not even nor divisable by 5");
		}

		System.out.println(p1.or(p2).negate().test(i));

		List<Student> studentsList = StudentDatabase.getAllStudents();

		
		 Predicate<Student> p4 = student -> student.getGradelvel() > 3;
		 
		 Predicate<Student> p5 = student -> student.getGpa() >= 3.0;
		

		BiConsumer<Integer, Double> b1 = (grade, gpa) -> {
			System.out.println(grade + " : " + gpa);
		};

		Consumer<Student> c1 = student -> {
			/*
			 * if(p4.or(p5).test(student)) { System.out.println(student.getName()+
			 * " : "+student.getGradelvel()+" : "+student.getGpa()); }
			 */

			if (p4.and(p5).test(student)) {
				b1.accept(student.getGradelvel(), student.getGpa());
			}
		};

		studentsList.forEach(c1);

	}

}
