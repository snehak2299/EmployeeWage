public class empwage {
    public static void main (String[]args){
    int IS_FULL_TIME= 2;
    int IS_HALF_TIME =1;
    int WAGE_PER_HR =20;
    int empHrs = 0;
    double empcheck = Math.floor((Math.random()* 10) %3 );
    if(empcheck==IS_FULL_TIME){
     System.out.println("employee is present");
     empHrs=8;
	}
    else if(empcheck==IS_HALF_TIME){
     empHrs=4;
	}
    int EmployeeWage = empHrs * WAGE_PER_HR;
    System.out.println("employee wage is:"+ EmployeeWage);
  }
}