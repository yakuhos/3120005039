package test;
import org.junit.Test;
import check.*; 
public class hammingtest {
	@Test
		public void testhamming() {
		String str0 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig.txt");
		String str1 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig_0.8_add.txt");
		int distance = hamming.gethammingdistance(simhash.getsimhash(str0),simhash.getsimhash(str1));
		System.out.println("��������" + distance);
		double similarity = hamming.getsimilarity(simhash.getsimhash(str0), simhash.getsimhash(str1));
		System.out.println("���ƶ�" + similarity);
	}
	@Test 
		public void errortest() {
		//����simhashֵλ����ͬʱ�����
		String str0 = "1011101111111111";
		String str1 = "101101111111111";
		System.out.println(hamming.gethammingdistance(str0,str1));
	}
}