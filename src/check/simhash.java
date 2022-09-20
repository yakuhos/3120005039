package check;
import com.hankcs.hanlp.HanLP;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
public class simhash {
	 /**
     * ����String�����������hashֵ�������ַ�����ʽ���
     * str�����Srting�����ַ���
     * ����str��hashֵ
     */
    public static String gethash(String str){
        try{
            //��MD5���hashֵ
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            return new BigInteger(1, messageDigest.digest(str.getBytes("UTF-8"))).toString(2);
        }catch(Exception e){
            e.printStackTrace();
            return str;
        }
}
    /**
     * ����String,���������simHashֵ�������ַ�����ʽ���
     * str �����Srting�����ַ���
     * ����str��simHashֵ
     */
    public static String getsimhash(String str){
        //�ı�����̫��ʱHanLp�޷�ȡ�ùؼ��ֵ����쳣
        try{
            if(str.length() < 200) throw new stringexception("�ı����̣�");
        }catch (stringexception e){
            e.printStackTrace();
            return null;
        }
     //�������ʾ��������,ȡ128λ,�� 0 1 2 λ��ʼ��ʾ�Ӹ�λ����λ
        int[] v = new int[128];
        //1���ִʣ���hankcs���ṩ�Ľӿڣ�
        List<String> keywordList = HanLP.extractKeyword(str, str.length());//ȡ�����йؼ���
        int size = keywordList.size();
        int i = 0;//��i�����ѭ��
        for(String keyword : keywordList){
            //2����ȡhashֵ
            String keywordHash = gethash(keyword);
            if (keywordHash.length() < 128) {
                //hashֵ��������128λ���ڵ�λ��0����
                int dif = 128 - keywordHash.length();
                for (int j = 0; j < dif; j++) {
                    keywordHash += "0";
                }
            }
            //3����Ȩ���ϲ�
            for (int j = 0; j < v.length; j++) {
                //��keywordHash��ÿһλ��'1'���бȽ�
                if (keywordHash.charAt(j) == '1') {
                    //Ȩ�ط�10�����ɴ�Ƶ�Ӹߵ��ͣ�ȡȨ��10~0
                    v[j] += (10 - (i / (size / 10)));
                } else {
                    v[j] -= (10 - (i / (size / 10)));
                }
            }
            i++;
        }
        // 4����ά
        String simhash = "";//���淵�ص�simHashֵ
        for (int j = 0; j < v.length; j++) {
            //�Ӹ�λ��������λ
            if (v[j] <= 0) {
                simhash += "0";
            } else {
                simhash += "1";
            }
        }
        return simhash;
   }
}
   