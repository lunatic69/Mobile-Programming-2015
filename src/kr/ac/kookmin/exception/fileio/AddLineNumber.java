package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
   public static void main(String[] args)
   {
       String path = AddLineNumber.class.getResource("").getPath();
       

      try
      {
         BufferedReader br = 
               new BufferedReader(new FileReader(path+"original.txt"));
         PrintWriter pw = 
                 new PrintWriter(new FileOutputStream("/Users/yeong-gijo/git/javalab4/src/kr/ac/kookmin/exception/fileio/numbered.txt"));
          /**
           구현하시오. 
          **/
        int count=0;
        String str;
        while((str = br.readLine())!=null){
        	pw.println(count+" "+str);
        	count++;
        }
         br.close();
         pw.close( );
      }
       
     catch(FileNotFoundException e) 
     {
         e.printStackTrace();
     }
     catch(IOException e) 
     {
         e.printStackTrace();
     }
   }
}