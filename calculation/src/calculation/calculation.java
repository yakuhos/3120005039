package calculation;

import java.util.ArrayList;

public class calculation {
	//整数加法
	public static int add(int A,int B) {
		return A+B;
	}
	//分数加法
	public static String addfen(int A,int B,int C,int D) {
		int addzi = B*C+A*D;
		int addmu = A*C;
		int other = 0;
		int yue = yuefen(addmu, addzi);
		//分数约分
		addzi = addzi / yue;
		addmu = addmu / yue;
		if(addzi > addmu)
		{
			other = addzi / addmu;
			addzi = addzi % addmu;
		}
		if(addzi%addmu==0)
		{
			int num = addzi/addmu;
			String a=String.valueOf(num);
			return a;
		}
		if(other == 0)
		return addzi+"/"+addmu;
		else 
			return other+"’"+addzi+"/"+addmu;
	}
	//整数减法
	public static int reduce(int A,int B) {
		return A-B;
	}
	//分数减法
	public static String reducefen(int A,int B,int C,int D) {
		int reducezi = B*C-A*D;
		int reducemu = A*C;
		int yue = calculation.yuefen(reducemu, reducezi);
		reducezi = reducezi / yue;
		reducemu = reducemu / yue;
		return reducezi+"/"+reducemu;
	}
	//整数乘法
	public static int multiply(int A,int B) {
		return A*B;
	}
	//分数乘法
	public static String multiplyfen(int A,int B,int C,int D) {
		int multiplyzi = D*B;
		int multiplymu = A*C;
		int other = 0;
		int yue = calculation.yuefen(multiplyzi, multiplymu);
		//约分
		multiplyzi = multiplyzi / yue;
		multiplymu = multiplymu / yue;
		if(multiplyzi > multiplymu)
		{
			other = multiplyzi / multiplymu;
			multiplyzi = multiplyzi % multiplymu;
		}
		//结果为整数
		if(multiplyzi%multiplymu==0)
		{
			int num = multiplyzi/multiplymu;
			String m=String.valueOf(num);
			return m;
		}
		if(other == 0)
			return multiplyzi+"/"+multiplymu;
			else 
				return other+"’"+multiplyzi+"/"+multiplymu;
	}
	//整数除法
	public static int divide1(int A,int B) {
		return A/B;
	}
	//不整除方法
	public static String divide2(int A,int B) {
		int m = yuefen(A,B);
		A=A/m;
		B=B/m;
		if(A>B)
		{
			int n = A/B;
			A=A%B;
			return n+"’"+A+"/"+B;
		}
		else return A+"/"+B;
	}
	//分数除法
	public static String dividefen(int A,int B,int C,int D) {
		int other = 0;
		int dividezi = B*C;
		int dividemu = A*D;
		int yue = calculation.yuefen(dividezi, dividemu);
		//约分
		dividezi = dividezi / yue;
		dividemu = dividemu / yue;
		if(dividezi > dividemu)
		{
			other = dividezi / dividemu;
			dividezi = dividezi % dividemu;
		} 
		//结果为整数
		if(dividezi%dividemu==0)
		{
			int num = dividezi/dividemu;
			String d=String.valueOf(num);
			return d;
		}
		if(other == 0)
			return dividezi+"/"+dividemu;
			else 
				{
					dividezi=dividezi%dividemu;
					return other+"’"+dividezi+"/"+dividemu;
				}
	}
	
	public static int yuefen(int A,int B) {
		if(A>B)
			{
				int s = B;
				B = A;
				A = s;
			}
		int m=1;
		for(int i=A;i>1;i--)
		{
			if((B%i==0)&&(A%i==0))
				{
					m=i;		
					break;
				}
		}
		return m;
	}
	//查重
	public static boolean check(String path,String str1) {
		ArrayList<String[]> s = new ArrayList<>();
		s = txtio.read(path);
		if(s == null)
			return false;
		String[] str2 = null;
		str2 = str1.split(" ");
		//有重复则返回true，否则返回false
		for(int i = 0; i<s.size()-1;i++)
		{
			if(str2[3].equals(s.get(i)[3]))
				if(((str2[4].equals(s.get(i)[4])) && (str2[2].equals(s.get(i)[2]))) || ((str2[2].equals(s.get(i)[4])) && (str2[4].equals(s.get(i)[2]))))
					return true;		
		}
		return false;
	}
	//对比
	public static boolean compare(String[] A,String[] B) {
		int[] num = new int[4];
		String coms = null;
		int comi = 0;
		if((A[2].contains("/"))&&(A[4].contains("/")))
		{
			String[] str1 = A[2].split("/");
			String[] str2 = A[4].split("/");
			num[0] = Integer.parseInt(str1[0]);
			num[1] = Integer.parseInt(str1[1]);
			num[2] = Integer.parseInt(str2[0]);
			num[3] = Integer.parseInt(str2[1]);
		}
		if(num[1]!=0)
		{
			if(A[3].equals("+"))
				coms = addfen(num[1],num[0],num[3],num[2]);
			if(A[3].equals("-"))
				coms = reducefen(num[1],num[0],num[3],num[2]);
			if(A[3].equals("×"))
				coms = multiplyfen(num[1],num[0],num[3],num[2]);
			if(A[3].equals("÷"))
				coms = dividefen(num[1],num[0],num[3],num[2]);
			if(coms.equals(B[2]))
				return true;
			else 
				return false;
		}else {
			int a = Integer.parseInt(A[2]);
			int b = Integer.parseInt(A[4]);
			if(A[3].equals("+"))
				{
					comi = add(a,b);
					coms = String.valueOf(comi);
				}
			if(A[3].equals("-"))
				{
					comi = reduce(a,b);
					coms = String.valueOf(comi);
				}
			if(A[3].equals("×"))
				{
					comi = multiply(a,b);
					coms = String.valueOf(comi);
				}
			if(A[3].equals("÷"))
				if(a%b==0){
					comi = calculation.divide1(a, b);
					coms = String.valueOf(comi);
				}
				else {
					coms = calculation.divide2(a,b);
				}
			if(coms.equals(B[2]))
				return true;
			else 
				return false;
		}
	}
	
}
