import java.util.Scanner;
class gradeerror{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter marks:");
int mark = sc.nextInt();
try{
if(mark>100||mark<0){
throw new Exception(); 
}
char grade;
if(mark>=90){
grade = 'S';}
else if(mark>=80){
grade = 'A';}
else if(mark>=70){
grade = 'B';}
else if(mark>=60){
grade = 'C';}
else if(mark>=50){
grade = 'D';}
else{
grade = 'F';}
System.out.println("Grade for "+mark+" is "+grade);
}
catch(Exception e){
System.out.println("Invalid Marks");
}
finally{
System.out.println("Grade is Calculated");
}
}
}