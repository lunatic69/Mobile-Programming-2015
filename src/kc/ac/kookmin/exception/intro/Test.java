package kc.ac.kookmin.exception.intro;
import java.io.*;
class AAA {
public void readFile() {
	BufferedReader bReader;
	bReader = null;
	try{
		bReader = new BufferedReader(new FileReader("/Users/yeong-gijo/git/javalab4/src/kc/ac/kookmin/exception/intro/a.txt"));
		String difficult = bReader.readLine();
		System.out.println(difficult);
		
	}
	catch (IOException e){
		e.getMessage();
	}
	finally{
		try{bReader.close();}
		catch (IOException io){}
	
	}
}
	
}

public class Test {
	public static void main(String args[]) {
    	AAA a = new AAA();
    	a.readFile();
    }
} 