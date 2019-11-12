package org.college;

public class College {
	public static void main(String[] args) {
		College college=new College();
		college.CollegeName();
		college.CollegeCode();
		college.CollegeRank();
	
		Student stu=new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		
		Hostel host=new Hostel();
		host.hostelName();
		
		Department Dept=new Department();
		Dept.deptName();
	}
	
		public void CollegeName(){
			System.out.println("CollegeName");
		}
		public void CollegeCode(){
			System.out.println("CollegeCode");
		}
		public void CollegeRank(){
			
		System.out.println("CollegeRank");

		}
		
	}


