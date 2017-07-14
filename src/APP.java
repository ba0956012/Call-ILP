import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Runtime;

import ilog.concert.*;
import ilog.cplex.*;



public class APP {
	
	public static void main(String args[]) throws IOException, InterruptedException {

	    for(int j=100;j<=1000;j=j+100){
	    	double count=0;
			for(int i=1;i<=100;i++){ 
			     Process process = Runtime.getRuntime().exec(
			    		"C:/Program Files/IBM/ILOG/CPLEX_Studio_Community127/opl/bin/x64_win64/oplrun.exe "
			    		 +"C:/Users/sclab/opl/SCP/SCP.mod "+"C:/"+j+"/"+i+".dat");
			     
			     BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			     String line;
			     while ((line = reader.readLine()) != null) {
			     	if(line.contains("OBJECTIVE"))
			     	{
			     	 String	str = line.replaceAll("\\D+",""); 
			     	  count = count + Integer.parseInt(str);
			    	      
			     	}
			     }
			    process.waitFor();
		    }
			System.out.println(count/100);
	   }
	}		
	
}
