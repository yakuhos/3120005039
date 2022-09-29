package calculation;

public class newc {
	//默认数值
	static int number = 10;
	static int round = 10;
	static int sum = 1;
	public static void init(String data1,int num1,String data2,int num2) {
		try {
			if(data1.equals(data2)) throw new throwexception("输入相同参数！");
		} catch (Exception e) {
			e.printStackTrace();
			return ;
		}
		if(data1.contains("n"))
			number = num1;
		if(data1.contains("r"))
			round = num1;
		if(data2 != null)
			{
				if(data2.contains("n"))
					number = num2;
				if(data2.contains("r"))
					round = num2;
			}
		
	}
	//生成题目文件和答案文件
	public static void creat(String text,String answer) {
		//整数运算个数
		int n = (int)Math.round(Math.random()*number);
		String txtin = null;
		for(int i = 0;i < n;i++)
		{
			int A = (int)Math.round(Math.random()*round);
			int B = (int)Math.round(Math.random()*round);
			int C = (int)Math.round(Math.random()*4);
			switch (C) 
			{
				case 1 :{
					txtin = sum+" : "+A+" + "+B+" = ";
					if(i!=0)
						if(true == calculation.check(text,txtin))
						{
							--i;
							break;
						}
					txtio.write(txtin,text);
					int add = calculation.add(A, B);
					txtin = sum+" : "+String.valueOf(add);
					txtio.write(txtin,answer);
					break;
				}
				case 2 :{
					if(A>B)
						{
							txtin = sum+" : "+A+" - "+B+" = ";
							if(i!=0)
								if(true == calculation.check(text,txtin))
								{
									--i;
									break;
								}
							txtio.write(txtin,text);
							int reduce = calculation.reduce(A, B);
							txtin = sum+" : "+String.valueOf(reduce);
							txtio.write(txtin, answer);
						}
					//重新选择
					else --i;
					break;
				}
				case 3 :{
					txtin = sum+" : "+A+" × "+B+" = ";
					if(i!=0)
						if(true == calculation.check(text,txtin))
						{
							--i;
							break;
						}
					txtio.write(txtin,text);
					int multiply = calculation.multiply(A, B);
					txtin = sum+" : "+String.valueOf(multiply);
					txtio.write(txtin, answer);
					break;
				}
				default :{
					if(B==0)
					{
						--i;
						break;
					}
					txtin = sum+" : "+A+" ÷ "+B+" = ";
					if(i!=0)
						if(true == calculation.check(text,txtin))
						{
							--i;
							break;
						}
					txtio.write(txtin,text);
					int divide1 = 0;
					String divide2 = null;
					if(A%B==0){
						divide1 = calculation.divide1(A, B);
						txtin = String.valueOf(divide1);
					}
					else {
						divide2 = calculation.divide2(A, B);
						txtin = divide2;
					}
					txtin = sum+" : "+txtin;
					txtio.write(txtin, answer);
					break;
				}
				
			}
			sum=i+2;
		}
		//分数运算个数
		int fen = number-n;
		int sum1=sum;
		for(int i=0;i<fen;i++)
		{
			int A = (int)Math.round(Math.random()*round);
			int B = (int)Math.round(Math.random()*A);
			int C = (int)Math.round(Math.random()*round);
			int D = (int)Math.round(Math.random()*C);
			int E = (int)Math.round(Math.random()*4);
			//保证分数永远为真分数
			if(A<=1)
				A=2;
			if(C<=1)
				C=2;
			if(B==0)
				++B;
			if(B==A)
				--B;
			if(D==0)
				++D;
			if(D==C)
				--D;
			switch(E) {
			case 1 :{
				txtin = sum1+" : "+B+"/"+A+" + "+D+"/"+C+" = " ;
				if(i!=0)
					if(true == calculation.check(text,txtin))
					{
						--i;
						break;
					}
				txtio.write(txtin,text);
				String add = calculation.addfen(A, B, C, D);
				add = sum1+" : "+add;
				txtio.write(add, answer);
				break;
			}
			case 2 :{
				int reducezi = B*C-A*D;
				if(reducezi > 0)
				{
					txtin = (sum1+" : "+B+"/"+A+" - "+D+"/"+C+" = ");
					if(i!=0)
						if(true == calculation.check(text,txtin))
						{
							--i;
							break;
						}
					txtio.write(txtin,text);
					String reduce = calculation.reducefen(A, B, C, D);
					reduce = sum1+" : "+reduce;
					txtio.write(reduce, answer);
				}//重新选择
				else --i;
				break;
			}
			case 3 :{
				txtin = (sum1+" : "+B+"/"+A+" × "+D+"/"+C+" = ");
				if(i!=0)
					if(true == calculation.check(text,txtin))
					{
						--i;
						break;
					}
				txtio.write(txtin,text);
				String multiply = calculation.multiplyfen(A, B, C, D);
				multiply = sum1+" : "+multiply;
				txtio.write(multiply, answer);
				break;
			}
			default :{
				txtin = (sum1+" : "+B+"/"+A+" ÷ "+D+"/"+C+" = ");
				if(i!=0)
					if(true == calculation.check(text,txtin))
					{
						--i;
						break;
					}
				txtio.write(txtin,text);
				String divide = calculation.dividefen(A, B, C, D);
				divide= sum1+" : "+divide;
				txtio.write(divide, answer);
				break;
			}
			}
			sum1=sum+1+i;
		}
	}
}
