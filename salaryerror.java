class salaryerror{
public static void main(String[] args){
int salary = 30000;
int day = 0;
try{
int spday = salary/day;
System.out.println("Salary per Day:"+spday);
}
catch(ArithmeticException e){
System.out.println("Arithmetic error - Divide by Zero");
}
finally{
System.out.println("Program ended");
}
}
}