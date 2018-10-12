package General;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class executeViaCommandPrompt {
	
/*	public static void main(String[] args) {
		
		try {
			
			String[] command = { "netstat", "-r" };
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec("cmd.exe /c start netstat -r");
			//Process proc = rt.exec(command);
		
            // For error
			StreamGobbler(proc.getErrorStream(), "[ErrorStream]");

            // For output
            StreamGobbler(proc.getInputStream(), "[InputStream]");

        } catch (Throwable t) {
            t.printStackTrace();
        } 
 
   }
*/
    public static void StreamGobbler(InputStream is, String type) {
    	
    	String myOutput = "";
    	
    	try {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null) {
                myOutput = (myOutput + line + "\n");
                
                System.out.println(type + line);
                
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {

        try {
            String ss = null;
            Process p = Runtime.getRuntime().exec("cmd.exe /c start ping google.com ");
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((r.readLine()) != null) {
                System.out.println(r.readLine());
            }
            BufferedWriter writeer = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
            writeer.write("dir");
            writeer.flush();
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            System.out.println("Here is the standard output of the command:\n");
            
            while ((stdInput.readLine()) != null) {
                System.out.println(stdInput.readLine());
            }
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((stdError.readLine()) != null) {
                System.out.println(stdInput.readLine());
            }

        } catch (IOException e) {
            System.out.println("FROM CATCH" + e.toString());
        }

    }

}
