/* 2.You are asked to develop a software for a college. The system shall maintain information about students.
     This includes name, address, phone number, gender, date of birth, height, weight, degree pursued (e.g., B.Sc., B.A.),
     year of study, average CGPA, with/without tuition grant, is/is not a scholar. Each student is assigned a unique 8-digit number as id.
     You are required to identify the variables, assign a suitable name to each variable and choose an appropriate type. 
     Write the variable declaration statements as in the above example. */

//Ans==>

	import java.util.Scanner;

	class StudentDetails
		
		{

			public static void main(String[] args)
			
				{
					Scanner sc= new Scanner(System.in);

					System.out.println("Enter the Student's name :");
					String name =sc.nextLine();
					

					System.out.println("Enter the Student's address :");
					String address =sc.nextLine();
					

					System.out.println("Enter the Student's Phone no :");
					int Phoneno =sc.nextInt();
					

					System.out.println("Enter the Student's Gender :");
					char gender =sc.next().charAt(0);
					
					System.out.println("Enter the Student's Date of Birth :");
					String DOB=sc.next();
		
					System.out.println("Enter the Student's Height :");
					double height =sc.nextDouble();
			
					System.out.println("Enter the Student's weight :");
					int weight =sc.nextInt();
				
					System.out.println("Enter the Student's Degree Pursued :");
					String degree =sc.next();
				
					System.out.println("Enter the Student's Year Of Study :");
					int year =sc.nextInt();
			
					System.out.println("Enter the Student's Average CGPA :");
					double cgpa =sc.nextDouble();
					

					System.out.println("Enter the Student's with/without tuition grant :");
					String tg =sc.next();

					System.out.println("Enter the Student's is/is not a scholar :");
					String Sh =sc.next();
		
					System.out.println("Enter the Student's unique 8-digit number as id :");
					int id =sc.nextInt();
							
					//output
					System.out.println("\nStudent's name is:" +name);

					System.out.println("Student's address is:" +address);

					System.out.println("Student's Phone no is:" +Phoneno);

					System.out.println("Student's Gender is:" +gender);

					System.out.println("Student's Date Of Birth is:" +DOB);

					
					System.out.println("Student's height is:" +height);

					System.out.println("Student's weight is:" +weight);

					System.out.println("Student's degree is:" +degree);

					System.out.println("Student's Year Of Study is:" +year);

					System.out.println("Student's Average CGPA is:" +cgpa);

					System.out.println("Student with/without tuition grant ?:" +tg);

					System.out.println("Student is/is not a scholar ?:" +Sh);

					System.out.println("Student's unique 8-digit number as id is:" +id);				
					

				}	

		}