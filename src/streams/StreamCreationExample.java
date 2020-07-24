package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample {
	
	public static void main(String[] args) {
		
		Employee[] arayOfEmps = {
				new Employee(1,"Suni",10000.0),
				new Employee(2,"Manu",20000.0),
				new Employee(3,"Sidda",80088.0)
		};
		
		//get a stream from an existing array
		
		Stream.of(arayOfEmps).forEach((employee)->System.out.println(employee.getName()));
		
		//get stream from existing list
		
		  List<Employee> empList = Arrays.asList(arayOfEmps);
		  
		  empList.stream().map(employee->employee.getName()).forEach(System.out::println);
		  
		  //get stream from individual objects 
		  
		  Stream.of(arayOfEmps[0],arayOfEmps[1]).forEach(System.out::println);
		  
		  //get Stream from builder 
		  
		  
		
	}

}
