package check;
import java.util.Locale;
import java.util.Scanner;
public class check {
	public static void main(String[] args) {
        	//�������������·������ȡ��Ӧ���ļ������ļ�������ת��Ϊ��Ӧ���ַ���		
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
      	String A = sc.next();
        String B = sc.next();
       	String C = sc.next();
       	String str0 = txtio.readtxt(A);
       	String str1 = txtio.readtxt(B);
        String result = C;
      	//���ַ����ó���Ӧ�� simhashֵ
        String simhash0 = simhash.getsimhash(str0);
        String simhash1 = simhash.getsimhash(str1);
        //��simHashֵ������ƶ�
        double similarity = hamming.getsimilarity(simhash0, simhash1);
       	//�����ƶ�д�����Ľ���ļ���
       	txtio.writetxt(similarity, result);
        //�˳�����
        System.exit(0);
    	}
}