package test;
import check.*;
import org.junit.Test;
public class txtiotest {
	@Test
		public void txtintest() {
		//·�����ڣ�����������ȡ
		String str = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig.txt");
		String[] strings = str.split(" ");
        for (String string : strings) 
        {
            System.out.println(string);
        }
	}
	@Test
		public void txtouttest() {
		//·�����ڣ���������д��
		 double[] elem = {11, 22, 33, 44, 55, 0.23, 0.55};
	        for (int i = 0; i < elem.length; i++) {
	        	txtio.writetxt(elem[i], "D:/eclipse/eclipse-workspace/check/file/test/txtiotest.txt");
	        }
	}
	@Test 
		public void inerrortest() {
		//·�������ڣ�����������ȡ
		String str = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/error.txt");
		String[] strings = str.split(" ");
        for (String string : strings) 
        {
            System.out.println(string);
        }
	}
	@Test
		public void outerrortest() {
		//·�������ڣ���������д��
		double[] elem = {11, 22, 33, 44, 55, 0.23, 0.55};
        for (int i = 0; i < elem.length; i++) {
        	txtio.writetxt(elem[i], "S:/eclipse/eclipse-workspace/check/file/test/txtiotest.txt");
        }
	}
}