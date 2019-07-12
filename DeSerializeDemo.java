import java.io.*;

public class DeSerializeDemo{
		public static void main(String[] args){
			try{
				
				ObjectInputStream out=new  ObjectInputStream(new FileInputStream("person.ser"));
				Person p=(Person)out.readObject();
				out.close();

				System.out.println("Age :"+p.age+"Name:"+p.name);
				System.out.println("DeSerialized successfully");

				

			}
			catch(Exception e){
				System.out.println(e);
			}
		}
}