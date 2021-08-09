public class empwage {
    public static void main (String[]args){
    int IS_EMP_PRESENT= 1;
    double empcheck = Math.floor((Math.random()* 10) %2 );
    if(empcheck==IS_EMP_PRESENT){
     System.out.println("employee is present");
	}
    else{
     System.out.println("employee is absent");
	}
  }
}