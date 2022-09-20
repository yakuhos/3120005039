
package check;

/**
 * @author yhy
 */
public class hamming {
	//��������simhash1��2ֵ���������ǵĺ�������
	 public static int gethammingdistance(String simhash1, String simhash2) {
		 int distance = 0;
	     if (simhash1.length() != simhash2.length()) {
	    	 // ��������-1
	         distance = -1;
	      } else {
	    	  for (int i = 0; i < simhash1.length(); i++) {
	    		  // ÿһλ���бȽ�
	              if (simhash1.charAt(i) != simhash2.charAt(i)) {
	            	  distance++;
	              }
	          }
	      }
	      return distance;
	  }
	 //����simhash1��2�ĺ������룬�������ǵ����ƶ�	
	    public static double getsimilarity(String simhash1, String simhash2) {
	        int distance = gethammingdistance(simhash1, simhash2);
	        return 0.01 * (100 - distance * 100 / 128);
	    }

}
