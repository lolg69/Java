import java.io.*;
class ReadingLines{
	public static void main(String[] args){
		Reader reader = null;
		BufferedReader br = null;
		
		try{
		reader = new FileReader("hellothere.txt");
		
		br = new BufferedReader(reader);
		while(br.ready()){
			System.out.println("Whatewe" + br.readLine());
		}
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}	
}