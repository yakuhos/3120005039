package check;
import java.util.Locale;
import java.util.Scanner;
public class check {
	public static void main(String[] args) {
        	//从命令行输入的路径名读取对应的文件，将文件的内容转化为对应的字符串		
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
      	String A = sc.next();
        String B = sc.next();
       	String C = sc.next();
       	String str0 = txtio.readtxt(A);
       	String str1 = txtio.readtxt(B);
        String result = C;
      	//由字符串得出对应的 simhash值
        String simhash0 = simhash.getsimhash(str0);
        String simhash1 = simhash.getsimhash(str1);
        //由simHash值求出相似度
        double similarity = hamming.getsimilarity(simhash0, simhash1);
       	//把相似度写入最后的结果文件中
       	txtio.writetxt(similarity, result);
        //退出程序
        System.exit(0);
    	}
}