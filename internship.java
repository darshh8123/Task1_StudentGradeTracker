package intern;
//Necessary libraries
	import java.util.ArrayList;
	import java.util.Scanner;
//TASK-1	
//A SIMPLE STUDENT GRADE TRACKER PROGRAM(Using switch statements)	
	public class internship {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<String> studentNames = new ArrayList<>();
	        ArrayList<Double> studentGrades = new ArrayList<>();
	        
	        System.out.println("Student Grade Tracker System");

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add student and grade");
	            System.out.println("2. Calculate average grade");
	            System.out.println("3. Find highest grade");
	            System.out.println("4. Find lowest grade");
	            System.out.println("5. Display all students and grades");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice>>> ");
	            
	            int choice = scanner.nextInt();
	            scanner.nextLine(); 
	            
	            switch (choice) {
	                case 1: //case1 for adding student and their garde
	                    System.out.print("Enter student name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter student grade: ");
	                    double grade = scanner.nextDouble();
	                    
	                    studentNames.add(name);
	                    studentGrades.add(grade);
	                    System.out.println("Student added successfully");
	                    break;
	                    
	                case 2: //for getting average of grades
	                    if (studentGrades.isEmpty()) {
	                        System.out.println("No grades entered yet.");
	                    } else {
	                        double sum = 0;
	                        for (double num: studentGrades) {
	                            sum += num;
	                        }
	                        double average = sum / studentGrades.size();
	                        System.out.printf("Average grade: %.2f\n", average);
	                    }
	                    break;
	                    
	                case 3://for retrieving highest grade in the record
	                    if (studentGrades.isEmpty()) {
	                        System.out.println("No grades entered yet.");
	                    } else {
	                        double max = studentGrades.get(0);
	                        for (double num : studentGrades) {
	                            if (num > max) {
	                                max = num;
	                            }
	                        }
	                        System.out.printf("Highest grade: %.2f\n", max);
	                    }
	                    break;
	                    
	                case 4://for retrieving lowest grade
	                    if (studentGrades.isEmpty()) {
	                        System.out.println("No grades entered yet.");
	                    } else {
	                        double min = studentGrades.get(0);
	                        for (double num : studentGrades) {
	                            if (num < min) {
	                                min = num;
	                            }
	                        }
	                        System.out.printf("Lowest grade: %.2f\n", min);
	                    }
	                    break;
	                    
	                case 5://to dispaly all the records
	                    if (studentNames.isEmpty()) {
	                        System.out.println("No students entered yet.");
	                    } else {
	                        System.out.println("\nStudent Grades Recorded:");
	                        System.out.println("--------------");
	                        for (int i = 0; i < studentNames.size(); i++) {
	                            System.out.printf("%s: %.2f\n", studentNames.get(i), studentGrades.get(i));
	                        }
	                    }
	                    break;
	                    
	                case 6://to exit from the program
	                    System.out.println("Exiting program...");
	                    scanner.close();
	                    System.exit(0);
	                    break;
	                    
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}

