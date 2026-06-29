class sixerror{
public static void main(String[] args){
try{
int res = 10/0;}
catch(ArithmeticException e){
System.out.println("Exception Handled");}
finally{
System.out.println("Finally block executed");
}
}
}