import java.io.*;
public class IODemo3{
	public static void main(String[] args){
		try{
			//PrintWriter pw=new PrintWriter(System.out);
			/*PrintWriter pw=new PrintWriter(new FileOutputStream("abc.txt",true));
			pw.write("Hello everybody");
			pw.flush();
			pw.close();*/

			File dir1=new File("abc");
			dir1.mkdir();
			File dir2=new File(dir1,"xyz");
			dir2.mkdir();
			File f=new File(dir2,"atoz.txt");
			f.createNewFile();

			PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
			pw.println("Written from the program");
			pw.flush();
			pw.close();


		}
		catch(Exception e){
 			System.out.println(e);
		}

	}
}