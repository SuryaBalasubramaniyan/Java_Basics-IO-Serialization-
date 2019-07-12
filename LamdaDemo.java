import java.io.*;

interface I{
	public void abc();
}


public class LamdaDemo{
		public static void main(String[] args){
			I i1= new I(){
				public void abc(){
					System.out.println("From anonymous class");
					}
				};
			i1.abc();
		}


}