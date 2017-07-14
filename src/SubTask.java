import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class SubTask implements Runnable {
		  public SubTask(InputStream istream)
		  {
		    if (istream == null){
		      iReader = new BufferedReader(new InputStreamReader(System.in));}
		    else
		      iReader = new BufferedReader(new InputStreamReader(istream));
		  }
		  public void run()
		  {
		    try {
		      String input = iReader.readLine();
		      while (input != null)
		      {
		        //若需執行結果可將input傳出
		        System.out.println(input);
		        input = iReader.readLine();
		      }
		    }
		    catch (IOException ioe) {
		    }
		  }
		  private BufferedReader iReader;
		}