package check;


public class check {
	public static void main(String[] args) {
        //�������������·������ȡ��Ӧ���ļ������ļ�������ת��Ϊ��Ӧ���ַ���
        String str0 = txtio.readtxt(args[0]);
        String str1 = txtio.readtxt(args[1]);
        String result = args[2];
        //���ַ����ó���Ӧ�� simhashֵ
        String simhash0 = simhash.getsimhash(str0);
        String simhash1 = simhash.getsimhash(str1);
        //��simhashֵ������ƶ�
        double similarity = hamming.getsimilarity(simhash0, simhash1);
        //�����ƶ�д�����Ľ���ļ���
        txtio.writetxt(similarity, result);
        //�˳�����
        System.exit(0);
    }
    
    
}
