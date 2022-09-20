package check;
import java.io.*;
/**
 * ��дtxt�ļ�
 */
public class txtio {
     //�����ļ�����·�������ļ�����ת��ΪString�ַ������
    public static String readtxt(String txtPath) {
        String str = "";
        String strLine;
        //��txt�ļ����ж���str��
        File file = new File(txtPath);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            //�ַ���ƴ��
            while ((strLine = bufferedReader.readLine()) != null) {
                str += strLine;
            }
            //�ر���Դ
            inputStreamReader.close();
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    //�������ݡ��ļ�ȫ·������������д���ļ�������
    public static void writetxt(double txtElem,String txtPath){
        String str = Double.toString(txtElem);
        File file = new File(txtPath);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(str, 0, (str.length() > 3 ? 4 : str.length()));
            fileWriter.write("\r\n");
            //�ر���Դ
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}