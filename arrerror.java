class arrerror{
public static void main(String[] args){
int arr[] = {10,20,30,40,50};
try{
int index =7;
System.out.println("Value:"+arr[index]);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Invalid Index Access");
}
finally{
System.out.println("Exception handled");
}
}
}