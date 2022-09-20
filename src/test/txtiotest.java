package test;
import check.*;
import org.junit.Test;
public class txtiotest {
	@Test
		public void txtintest() {
		//路径存在，可以正常读取
		String str = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig.txt");
		String[] strings = str.split(" ");
        for (String string : strings) 
        {
            System.out.println(string);
        }
	}
	@Test
		public void txtouttest() {
		//路径存在，可以正常写入
		 double[] elem = {11, 22, 33, 44, 55, 0.23, 0.55};
	        for (int i = 0; i < elem.length; i++) {
	        	txtio.writetxt(elem[i], "D:/eclipse/eclipse-workspace/check/file/test/txtiotest.txt");
	        }
	}
	@Test 
		public void inerrortest() {
		//路径不存在，不能正常读取
		String str = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/error.txt");
		String[] strings = str.split(" ");
        for (String string : strings) 
        {
            System.out.println(string);
        }
	}
	@Test
		public void outerrortest() {
		//路径不存在，不能正常写入
		double[] elem = {11, 22, 33, 44, 55, 0.23, 0.55};
        for (int i = 0; i < elem.length; i++) {
        	txtio.writetxt(elem[i], "S:/eclipse/eclipse-workspace/check/file/test/txtiotest.txt");
        }
	}
}