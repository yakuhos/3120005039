package calculation;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("-n ��������������Ŀ�ĸ���\nʹ�� -r ����������Ŀ����ֵ\nʹ�� -e������������Ŀ�ļ�ʹ�� -a�������ļ������Դ�ͳ��");
		System.out.println("Ĭ����Ŀ����10������ֵ��10����");
		Scanner sc = new Scanner(System.in);
		String cs1 = sc.next();
		if(cs1.contains("r")||cs1.contains("n"))
		{
			int A = sc.nextInt();
			System.out.println("��������һ������");
			String cs2 = sc.next();
			int B = sc.nextInt();
			newc.init(cs1,A,cs2,B);
			newc.creat("D:/Test/Exercises.txt","D:/Test/Answers.txt");
			sc.close();
		}else//�ԱȲ���
		if(cs1.contains("e"))
		{
			String text = sc.next();
			cs1 = sc.next();
			String answer = null;
			if(cs1.contains("a"))
				answer = sc.next();
			ArrayList<String[]> s = new ArrayList<>();
			ArrayList<String[]> t = new ArrayList<>();
			t = txtio.read(text);
			s = txtio.read(answer);
			int error = 0;
			int[] r=new int[t.size()];
			int[] e=new int[t.size()];
     		int[] n=new int[t.size()];
			
			int k=0;
			
			for (int i=0;i<Math.min(s.size(),t.size());i++)
			{
				String[] str = new String[s.get(i).length];
				for(int j=0;j<str.length;j++)
					str[j] = t.get(i)[j];
				if(calculation.compare(str,s.get(i))==false)
				{
					e[error]=Integer.parseInt(t.get(i)[0]);
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
}
