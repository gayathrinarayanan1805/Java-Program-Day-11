class sevenerror { 
public static void main(String[] args) { 
int balance = 5000;
int withdraw = 7000; 
try { 
if(withdraw > balance) {
throw new InsufficientBalance(); 
}
} 
catch(InsufficientBalance e) { 
System.out.println("Insufficient Balance Error"); 
} 
finally { 
System.out.println("Cannot Withdraw Amount"); 
} 
} 
}
