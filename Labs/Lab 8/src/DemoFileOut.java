import java.io.*;

public class DemoFileOut {

    public static void main(String[] args) throws IOException {
	    File outFile = new File("outputFile.txt");
	    PrintStream fileWriter = new PrintStream(outFile);
				
		for (int i = 0; i < 10; i++) {
			fileWriter.println("Writing line "+i);
		}
	   	
    }

}
