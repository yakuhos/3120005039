package check;
import java.io.*;
/**
 * 读写txt文件
 */
public class txtio {
     //传入文件绝对路径，将文件内容转化为String字符串输出
    public static String readtxt(String txtPath) {
        String str = "";
        String strLine;
        //将txt文件按行读入str中
        File file = new File(txtPath);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            //字符串拼接
            while ((strLine = bufferedReader.readLine()) != null) {
                str += strLine;
            }
            //关闭资源
            inputStreamReader.close();
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    //传入内容、文件全路径名，将内容写入文件并换行
    public static void writetxt(double txtElem,String txtPath){
        String str = Double.toString(txtElem);
        File file = new File(txtPath);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(str, 0, (str.length() > 3 ? 4 : str.length()));
            fileWriter.write("\r\n");
            //关闭资源
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}