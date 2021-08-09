public class empwage {
    public static void main (String[]args){
    int IS_EMP_PRESENT= 1;
    int WAGE_PER_HR =20;
    int empHrs = 0;
    double empcheck = Math.floor((Math.random()* 10) %2 );
    if(empcheck==IS_EMP_PRESENT){
     System.out.println("employee is present");
     empHrs=8;
	}
    else{
     System.out.println("employee is absent");
	}
    int EmployeeWage = empHrs * WAGE_PER_HR;
    System.out.println("employee wage is:"+ EmployeeWage);
  }
}