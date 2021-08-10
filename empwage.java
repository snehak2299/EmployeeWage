public class empwage {
    public static final int IS_FULL_TIME= 2;
    public static final int IS_HALF_TIME =1;
    public static final int WAGE_PER_HR =20;
    public static final int DAY_IN_MONTH = 2;
    public static void main (String[]args){
    int empHrs = 0;
    int totalempwage=0;
    for (int days=0; days < DAY_IN_MONTH;days++){
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
     totalempwage+= EmployeeWage;
     System.out.println("employee wage is:"+ EmployeeWage);
    }
    System.out.println(" total employee wage is:"+ totalempwage);
  }
}