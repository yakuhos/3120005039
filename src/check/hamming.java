
package check;

/**
 * @author yhy
 */
public class hamming {
	//输入两个simhash1、2值，计算它们的海明距离
	 public static int gethammingdistance(String simhash1, String simhash2) {
		 int distance = 0;
	     if (simhash1.length() != simhash2.length()) {
	    	 // 出错，返回-1
	         distance = -1;
	      } else {
	    	  for (int i = 0; i < simhash1.length(); i++) {
	    		  // 每一位进行比较
	              if (simhash1.charAt(i) != simhash2.charAt(i)) {
	            	  distance++;
	              }
	          }
	      }
	      return distance;
	  }
	 //输入simhash1、2的海明距离，计算它们的相似度	
	    public static double getsimilarity(String simhash1, String simhash2) {
	        int distance = gethammingdistance(simhash1, simhash2);
	        return 0.01 * (100 - distance * 100 / 128);
	    }

}
