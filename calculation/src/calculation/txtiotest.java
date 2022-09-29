package calculation;

import java.util.ArrayList;

import org.junit.Test;

public class txtiotest {
	 @Test
	    public void test1() {
	            String str ="txtio";
	            txtio.write(str, "D:/Test/test01.txt");
	    }
	 @Test
	    public void test3() {
	            String str ="txtio";
	            txtio.write(str, "D:/Test/test10.txt");
	    }
	 @Test
	 public void test4()
	 {
		 
		 ArrayList<String[]> s = new ArrayList<>();
		 s = txtio.read("D:/Test/test01.txt");
		 System.out.println(s);
	 }

}
