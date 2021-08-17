public class ComputeWage{
	public static final int IS_FULL_TIME= 2;
    public static final int IS_HALF_TIME =1;
    public static String companyName;
    public static int WAGE_PER_HR;
    public static int DAY_IN_MONTH;
    public static int MAX_HRS;
    static int totalempwage;
    

    ComputeWage(String companyName, int WAGE_PER_HR, int DAY_IN_MONTH, int MAX_HRS) {
        this.companyName = companyName;
        this. WAGE_PER_HR = WAGE_PER_HR;
        this. DAY_IN_MONTH = DAY_IN_MONTH;
        this.MAX_HRS = MAX_HRS;
    }

    public static void calculate(){
      int empHrs = 0;
      int totalHrs = 0;
      int totalWorkingDays=0;
      
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
        System.out.println("day :"+totalWorkingDays+" total hrs:"+totalHrs);
      }
       totalempwage=totalHrs*WAGE_PER_HR;
	}
    

    public String toString() {
    return (" total employee wage for "+companyName+" is "+ totalempwage);
    }
}