package test;
import org.junit.Test;
import check.*; 
public class hammingtest {
	@Test
		public void testhamming() {
		String str0 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig.txt");
		String str1 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig_0.8_add.txt");
		int distance = hamming.gethammingdistance(simhash.getsimhash(str0),simhash.getsimhash(str1));
		System.out.println("海明距离" + distance);
		double similarity = hamming.getsimilarity(simhash.getsimhash(str0), simhash.getsimhash(str1));
		System.out.println("相似度" + similarity);
	}
	@Test 
		public void errortest() {
		//测试simhash值位数不同时的情况
		String str0 = "1011101111111111";
		String str1 = "101101111111111";
		System.out.println(hamming.gethammingdistance(str0,str1));
	}
}