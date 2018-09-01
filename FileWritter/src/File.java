import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {

	public static void main(String[] args) {
		  FileInputStream ins = null;
	      FileOutputStream outs = null;
	      try {
	         File infile =new File("‪C:\\Users\\Acer\\Desktop\\ja.txt");
	         File outfile =new File("‪C:\\Users\\Acer\\Desktop\\ja.txt");
	         ins = new FileInputStream(infile);
	         outs = new FileOutputStream(outfile);
	         byte[] buffer = new byte[1024];
	         int length;
	         // from my eclipse
		      // i made changes from git
		      // i m using fetch
		      // i m using fetch
	         
	         while ((length = ins.read(buffer)) > 0) {
	            outs.write(buffer, 0, length);
	         } 
	         ins.close();
	         outs.close();
	         System.out.println("File copied successfully!!");
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } 
	   }

	}

}
