import java.util.Scanner;
class loginerror{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String id = "abc";
String pass = "123";
System.out.println("Enter Login Id:");
String log = sc.nextLine();
System.out.println("Enter Password:");
String pa = sc.nextLine();
try{
if(!id.equals(log)||!pass.equals(pa)){
throw new Exception(); 
}
System.out.println("Login Succesfull");
}
catch(Exception e){
System.out.println("Invalid Login Id or Password");
}
finally{
System.out.println("Continue here");
}
}
}