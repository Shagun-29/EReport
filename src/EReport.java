import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class EReport {

	public static void main(String[] args) throws IOException {
		
		String path = "./employees.dat";
		FileInputStream fis = new FileInputStream(path);
		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
		String s = null;
		while ((s = in.readLine())!=null)
	    {
			System.out.println(s);
	    }
	}

}
