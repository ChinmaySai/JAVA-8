package com.stream.operations;
import java.util.*;
import java.util.stream.*;

public class StreamOperations {
	
	public static void main(String[] args) {
		
		List<Employee> employees=getEmployee();
		List<String> empNames=new ArrayList<String>();
		//Prior to Java 8
		for(Employee emp:employees)
		{
			empNames.add(emp.getName());
		}
		empNames.forEach(n->System.out.println(n));
		
		//In Java8
		Stream<Employee> streamEmployee=employees.stream();
		List<String> empString=streamEmployee.map(emp->emp.getName()).collect(Collectors.toList());
		System.out.println(empString);
		
		
		System.out.println("\nEmployees with Age > 30 ");
		//Filter the Employees with Age >30
		List<String> emplist=employees.stream().filter(emp->emp.getAge()>30).map(emp->emp.getName()).collect(Collectors.toList());
		emplist.forEach(System.out::println);
		
		System.out.println("\nCity Names of the Employees");
		//Print all the City Names of the Employees
		employees.stream().map(e->e.getCity()).distinct().forEach(System.out::println); 
		
		//Get the Employees count whose salary is greater than 600000
		long empcount=employees.stream().filter(emp->emp.getSalary()>60000).count();
		System.out.println(empcount);
		
		//Get the First 3 elements of the Stream
		List<Employee> empList=employees.stream().limit(3).collect(Collectors.toList());
		empList.forEach(System.out::println);
		
		System.out.println("\nEmployees records after skipping first 3 employees");
		//Skip the First 3 elements
		employees.stream()
		.skip(3).forEach(System.out::println );
		
		//anyMatch()
		//Verify any Employee age is < 18
		boolean ageLess=employees.stream().anyMatch(emp -> emp.getAge()<30);
		System.out.println("\nThere were Employees with Age < 30 "+ageLess);
		
		//allMatch()
		//If all satisfies the condition then only we will get true
		boolean allEmpJoined=employees.stream().allMatch(emp->emp.getYearofJoining() <2013);
	     System.out.println("\nWere all the Employees joined before 2013 "+allEmpJoined);
		
	     //noneMatch()
			//If all stream objects doesn't satisfy the condition then only we will get true
	     boolean allEmpSalary=employees.stream().allMatch(emp->emp.getSalary() <100000);
	     System.out.println("\nWere all the Employees Salary less than 100000 "+allEmpSalary);
		
	     //findAny()
	     //get any One value from out of All Values
	     Employee emp=employees.stream().findAny()
	    		 .get(); //On Optional we can apply get method 
	     System.out.println(emp);
	     
	     //findFirst()
	     //It always returns the First element of the Stream
	    Employee emp1=employees.stream().findFirst().get();
	    System.out.println(emp1);
	    
	    //sorted()
	    //Get the Employees id's in sorted order
	   List<Integer> sortedEmpids= employees.stream().map(emp5->emp5.getId()).sorted().collect(Collectors.toList());
			   System.out.println("Sorted Empid's "+sortedEmpids);
			   
			   //Sorting the Employee Objects using Employee id's
			    //Get the Employees details in Descending  order based on the id 
			   List<Employee> sortedEmpids1= employees.stream().sorted((i1,i2)->{return i2.getId()-i1.getId();}).collect(Collectors.toList());
					   System.out.println("Sorted Empid's "+sortedEmpids1);
			
					    //Get the Employees details in Descending  order based on the id 
					   List<Employee> sortedEmpids2= employees.stream().sorted((i1,i2)->{return i1.getId()-i2.getId();}).collect(Collectors.toList());
							   System.out.println("\nSorted Empid's "+sortedEmpids2);
				 
							   
	         //Minimum Salary Employee Details
         Employee empint= employees.stream().min((i1,i2) -> {return (int) (i1.getSalary()-i2.getSalary());}).get();	 
         System.out.println("Minimum salaried Employee"+empint);
         
         //Maximum Salary Employee details
         Employee empint2= employees.stream().max((i1,i2) -> {return (int) (i1.getSalary()-i2.getSalary());}).get();	 
         System.out.println("Minimum salaried Employee"+empint);
         
                                                                    
         //Average salary of Employee
       double avgSalary =  employees.stream().mapToDouble(emp5->emp5.getSalary()).average().getAsDouble();
         System.out.println("Average Salary "+avgSalary); 
         
         //Average Age of Employees
         int avgAge=(int)employees.stream().mapToInt(emp3->emp3.getAge()).average().getAsDouble();
         System.out.println("Average Age of Employees "+avgAge);
         
         //peek()
         System.out.println("**********Peek Method**********");
         List<Employee> employeest=employees.stream().filter(emp5-> emp5.getYearofJoining()>2015).peek(System.out::println).collect(Collectors.toList());
         
         System.out.println("\n"+employeest);
         
         System.out.println("Employee Names whose age is greater than 25");
         //Collect all the Employee names as list whose age is greater than 30
         employees.stream().
                      filter(employee->employee.getAge() >30).
                      map(emp10->emp10.getName()).
                      collect(Collectors.toList()).
                      forEach(e->System.out.println(e));
         
         //Get the Unique Department Names
         System.out.println("\nGet the Unique Department Names");
         employees.stream().map(e->e.getDepartment()).distinct().collect(Collectors.toList()).forEach(i->System.out.println(i));
         
         Set<String> departlist=employees.stream().map(e->e.getDepartment()).collect(Collectors.toSet());
         System.out.println(departlist);
         
         //Collect Employee Names and Salary 
         Map<String,Double> namesSalary=employees.stream().collect(Collectors.toMap(Employee::getName,Employee::getSalary));
        Set s=namesSalary.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
       
        Map<String,Integer> val=employees.stream().collect(Collectors.toMap(emp10->emp10.getName(), emp11->emp11.getName().length()));
        TreeMap tm=new TreeMap();
        tm.putAll(val);
        //System.out.println(tm);
       Set st= tm.entrySet();
        Iterator itr1 =st.iterator();
        while(itr1.hasNext())
        {
        	System.out.println(itr1.next());
        	break;
        }
        
        //groupingby
        //Average Salary of Each Department
        System.out.println("Average of Each department\n");
       Map<String,Double> avgDept= employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.averagingDouble(e->e.getSalary())));
        System.out.println(avgDept);
        
        //Get the Count of Employees in Each department
        System.out.println("\nCount oe Employees in Each Department");
        Map<String,Long> countDepart=employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting()));
        System.out.println(countDepart);
        
        //Sum of salary of all Employees
        System.out.println("Sum of the Salary of All Employees "+employees.stream().collect(Collectors.summingDouble(emp6->emp6.getSalary())));
        //Summarizing the Salary of All Employees
        System.out.println("Sum of the Salary of All Employees "+employees.stream().collect(Collectors.summarizingDouble(emp6->emp6.getSalary())));

        //maxBy
        //Employee details with highest Age 
        Employee empl=employees.stream().collect(Collectors.maxBy((e1,e2)->e1.getAge()-e2.getAge())).get();
	    System.out.println(empl);
	    
	    //joining
	    //All Departments names with Delimiters as :::
	   String depat= employees.stream().map(e->e.getDepartment()).distinct().collect(Collectors.joining(":::"));
	   System.out.println(depat);
	}
	
	public static List<Employee> getEmployee()
	{
		//int id, String name, String city, int age, String gender, String department, int yearofJoining,
		//double salary
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee(101, "Alice Johnson", "New York", 28, "Female", "HR", 2019, 60000));
        employeeList.add(new Employee(102, "Bob Smith", "San Francisco", 32, "Male", "Engineering", 2017, 95000));
        employeeList.add(new Employee(103, "Carol Danvers", "Los Angeles", 30, "Female", "Marketing", 2020, 72000));
        employeeList.add(new Employee(104, "David Lee", "Chicago", 35, "Male", "Finance", 2015, 85000));
        employeeList.add(new Employee(105, "Eva Green", "Seattle", 26, "Female", "Engineering", 2021, 68000));
        employeeList.add(new Employee(106, "Frank Turner", "Boston", 29, "Male", "Sales", 2018, 62000));
        employeeList.add(new Employee(107, "Grace Kim", "Austin", 31, "Female", "HR", 2016, 59000));
        employeeList.add(new Employee(108, "Henry Walker", "Denver", 33, "Male", "IT", 2014, 98000));
        employeeList.add(new Employee(109, "Isabel Torres", "Atlanta", 27, "Female", "Support", 2022, 50000));
        employeeList.add(new Employee(110, "Jack Reed", "Miami", 36, "Male", "Legal", 2013, 88000));

		return employeeList;
	
	}

}
