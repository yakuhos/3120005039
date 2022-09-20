
package test;
import org.junit.Test;
import check.*; 
public class exceptiontest {
	@Test
		public void shortexceptiontest() {
		//测试文本过短的情况
		System.out.println(simhash.getsimhash("论文"));
	}
}