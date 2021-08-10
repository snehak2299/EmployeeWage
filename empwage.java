public class empwage {
    public static final int IS_FULL_TIME= 2;
    public static final int IS_HALF_TIME =1;
    public static final int WAGE_PER_HR =20;
    public static void main (String[]args){
    int empHrs = 0;
    int empcheck =(int) Math.floor((Math.random()* 10) %3 );
    switch(empcheck){
     case IS_FULL_TIME:
     empHrs=8;
     break;
     case IS_HALF_TIME:
     empHrs=4;
     break;
	}
    int EmployeeWage = empHrs * WAGE_PER_HR;
    System.out.println("employee wage is:"+ EmployeeWage);
  }
}