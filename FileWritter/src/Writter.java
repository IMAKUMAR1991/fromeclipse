import java.io.FileWriter;
import java.io.IOException;

public class Writter {

	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("abc.text");
		fw.write("durga");
		fw.write("soft");
		fw.flush();
		fw.close();

	}

}
