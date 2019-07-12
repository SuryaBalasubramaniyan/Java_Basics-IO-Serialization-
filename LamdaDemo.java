import java.io.*;

interface I{
	public void abc();
}

interface J{
	public void xyz(String msg);
}
interface K{
	public int add(int a,int b);
}
public class LamdaDemo{
		public static void main(String[] args){
			/*I i1= new I(){
				public void abc(){
					System.out.println("From anonymous class");
					}
				};*/
			I i1=()->System.out.println("From Lambda function");
			i1.abc();

			J j1=(msg)->System.out.println("Got the message :"+msg);
			j1.xyz("Hi");

			K k1=(a,b)->a+b; 
			int res=k1.add(1,4);
 			System.out.println("Result :"+res);
		}


}