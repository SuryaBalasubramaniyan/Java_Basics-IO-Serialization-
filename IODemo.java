import java.io.*;
public class IODemo{
	public static void main(String[] args){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));			
			System.out.print("Enter file name:");
			String fname=br.readLine();
			File f=new File(fname);
			if(f.exists()){
				BufferedReader fr=new BufferedReader(new FileReader(fname));
				String line=null;
				while((line=fr.readLine())!=null){
				System.out.println(line);
				}
				fr.close();
			}
			else{
				System.out.println("File doesn't exit");
			}
		br.close();
		}
		catch(Exception e){
 			System.out.println(e);
		}

	}
}