import java.io.*;

class A{
	public void abc()throws IOException,NullPointerException,ArithmeticException,UserException{
		int a=50;
		for(int i=1;i<=20;i++){
		System.out.println(i);
		int res=a/(a-i);
		if(i==150)
			throw new NullPointerException();
		if(i==120)
			throw new IOException();
		if(i==100)
			return;
		if(i==8)
			throw new UserException("i is 8");
		if(i==70)
			throw new UserException();
		
		
		}	

	}

	public void xyz()throws IOException,NullPointerException,ArithmeticException,UserException{
		abc();
	}
}

public class ExceptionDemo
{ 
	public static void main(String[] args){

	try{
		A a1=new A();
		a1.xyz();
	}
	catch(IOException e){
		System.out.println("IOException Handler");
	}

	catch(NullPointerException e){
		System.out.println("NullPointerException");
	}
	
	catch(UserException e){
		System.out.println(e);
		e.printStackTrace();
		e.display();
	}

	catch(Exception e){
		System.out.println("Default Exception handler");
	}
	
	finally{
		System.out.println("Thanks");
	}
	System.out.println("program continues");
	}

	


}

class UserException extends Exception{

	public UserException(){

	}

	public UserException(String msg){
		super(msg);
	}
	public void display(){
			
		System.out.println("Custom ExceptionHandler");
	}
}



