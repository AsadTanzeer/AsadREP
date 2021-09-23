package day6;

import java.io.FileReader;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CSVExample {
  @Test
  public void f() throws Exception
  {
	  CSVReader cs=new CSVReader(new FileReader("C:\\Users\\asadt\\OneDrive\\Desktop\\LTI training\\data.txt"));
	  List<String[]> allData=cs.readAll();
	  
	  for(int i=0;i<allData.size();i++)
	  {
		  String[] row=allData.get(i);
		  System.out.print(row[0]+" ");
		  System.out.println(row[1]);
	  }
  }
}
