public class empwage {
    public static final int IS_FULL_TIME= 2;
    public static final int IS_HALF_TIME =1;
    public static final int WAGE_PER_HR =20;
    public static final int DAY_IN_MONTH = 20;
    public static final int MAX_HRS = 100;
    public static void main (String[]args){
    int empHrs = 0;
    int totalHrs = 0;
    int totalWorkingDays=0;
    int totalempwage=0;
    while (totalHrs<MAX_HRS && totalWorkingDays<DAY_IN_MONTH){
     totalWorkingDays+=1;
     int empcheck =(int) Math.floor((Math.random()* 10) %3 );
     switch(empcheck){
     case IS_FULL_TIME:
      empHrs=8;
     break;
     case IS_HALF_TIME:
      empHrs=4;
     break;
     default:
	  empHrs = 0;
	  break;
	 }
     totalHrs+=empHrs;
     //totalWorkingDays+=totalWorkingDays;
     System.out.println("total day:"+totalWorkingDays+"total hrs:"+totalHrs);
     
    }
    totalempwage=totalHrs*WAGE_PER_HR;
    System.out.println(" total employee wage is:"+ totalempwage);
  }
}