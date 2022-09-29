package calculation;

import org.junit.Test;
import java.util.Random;

public class newctest {
	
	
	
	@Test
	public void test3()
	{
		for(int i=0;i<5;i++)
		{
		Random ran = new Random();
	    int ranNum = ran.nextInt(50);
	    int ranNum2=ran.nextInt(20);
	     
	    newc.init("n",ranNum,"r",ranNum2);
	    newc.creat("D:/Test/test20.txt","D:/Test/test21.txt");
		}
	}
	
	
	
	}