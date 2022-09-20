package test;
import check.*;
import org.junit.Test;
public class simhashtest {
	@Test
	public void gethashtest() {
		String[] strings = {"一位\",\"真正\",\"的\",\"作家\",\"永远\",\"只为\",\"内心\",\"写作"};
		for (String string : strings) {
            String stringhash = simhash.gethash(string);
            System.out.println(stringhash.length());
            System.out.println(stringhash);
        }
	}
	@Test
	public void getsimhashtest() {
		String str0 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig.txt");
		String str1 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig_0.8_add.txt");
		System.out.println(simhash.getsimhash(str0));
		System.out.println(simhash.getsimhash(str1));
	}
}