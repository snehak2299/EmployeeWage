public class empwage {
    
    public static void main (String[]args){
    
    ComputeWage company1= new ComputeWage("Dmart",20,20,100);
    company1.calculate();
    System.out.println(company1);

    ComputeWage company2= new ComputeWage("Relaince",20,22,200);
    company2.calculate();
    System.out.println(company2);

    ComputeWage company3 = new ComputeWage("TCS",10,32,600);
    company3.calculate();
    System.out.println(company3);
    }
}