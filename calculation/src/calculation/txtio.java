package calculation;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class txtio {
	//��ȡ�ļ� 
	public static ArrayList<String[]> read(String path) {
		ArrayList<String[]> str = new ArrayList<>();
		String[] str1 = new String[10];
		try {
        	Scanner scanner = new Scanner(new File(path));
        	while(scanner.hasNextLine())
        		{
        			str1 = scanner.nextLine().split(" ");
        			str.add(str1);
        		}
            //�ر���Դ
            scanner.close();
            return str;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	//д���ļ�
	public static void write(String s, String path) {
		File file = new File(path);
		FileWriter filewriter = null;
		try {
			filewriter = new FileWriter(file,true);
			filewriter.write(s);
			filewriter.write("\r\n");
			//�ر���Դ
			filewriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
