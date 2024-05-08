import java.io.File;
import java.io.IOException;

class A01 {
	public static void main(String[] args)throws IOException
	{

		// File name specified
		File obj = new File("myfile.txt");
		System.out.println("File Created!");
        obj.createNewFile(); // Create a file named "
	}
}
