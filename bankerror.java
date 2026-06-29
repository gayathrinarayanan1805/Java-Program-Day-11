import java.util.Scanner;
class bankerror{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int min = 1000;
System.out.println("Enter deposit amt:");
int dep = sc.nextInt();
try{
if(dep<min){
throw new ArithmeticException();
}
System.out.println("Amount Deposited:"+dep);
}
catch(ArithmeticException e){
System.out.println("Cannot Deposit | Minimum Deposit Amount -> 1000/-");
}
finally{
System.out.println("Amount Deposit in Bank Account");
}
}
}