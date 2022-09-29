package calculation;

import java.util.ArrayList;

import org.junit.Test;
public class Alltest {
	@Test
	public void testforcheck()
	{
		ArrayList<String[]> a1 = new ArrayList<>();
		ArrayList<String[]> b1 = new ArrayList<>();
		a1 = txtio.read("D:/Test/test05.txt");
		b1 = txtio.read("D:/Test/test06.txt");
	
		int right = 0,error = 0;
		int[] r=new int[a1.size()];
		int[] e=new int[a1.size()];
		int[] n=new int[a1.size()];
		
		int k=0;
		
		for (int i=0;i<Math.min(a1.size(),b1.size());i++)
		{
			String[] str = new String[a1.get(i).length];
			for(int j=0;j<str.length;j++)
				str[j] = a1.get(i)[j];
			if(calculation.compare(str,b1.get(i))==false)
			{
				e[error]=Integer.parseInt(a1.get(i)[0]);
				error++;
				n[k]=i;
				k++;
			}
		}
		
		
		
		StringBuffer str1 = new StringBuffer("error:"+error+"(");
		 while(k!=0)
		 {
			 str1.append(n[k]);
			 k--;
			 if(k>0)
			 {
				 str1.append(",");
			 }
			
		 }
		 str1.append(")");

	        String ss =new String(str1);
		 txtio.write(ss, "D:/Test/Grade.txt");
	
	}

}
