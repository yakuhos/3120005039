package test;
import org.junit.Test;
import check.*; 
public class main {
	@Test
	  public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig.txt");
        str[1] = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig_0.8_add.txt");
        str[2] = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig_0.8_del.txt");
        str[3] = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig_0.8_dis_1.txt");
        str[4] = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig_0.8_dis_10.txt");
        str[5] = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig_0.8_dis_15.txt");
        String ansFileName = "D:/eclipse/eclipse-workspace/check/file/alltest.txt";
        for(int i = 0; i <= 5; i++){
            double ans = hamming.getsimilarity(simhash.getsimhash(str[0]), simhash.getsimhash(str[i]));
            txtio.writetxt(ans, ansFileName);
        }
    }

    @Test
    public void origAndOrigTest(){
        String str0 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig.txt");
        String str1 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig.txt");
        String ansFileName = "D:/eclipse/eclipse-workspace/check/file/origtest.txt";
        double ans = hamming.getsimilarity(simhash.getsimhash(str0), simhash.getsimhash(str1));
        txtio.writetxt(ans, ansFileName);
    }

    @Test
    public void origAndAddTest(){
        String str0 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig.txt");
        String str1 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig_0.8_add.txt");
        String ansFileName = "D:/eclipse/eclipse-workspace/check/file/orig_0.8_addtest.txt";
        double ans = hamming.getsimilarity(simhash.getsimhash(str0), simhash.getsimhash(str1));
        txtio.writetxt(ans, ansFileName);
    }

    @Test
    public void origAndDelTest(){
        String str0 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig.txt");
        String str1 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig_0.8_del.txt");
        String ansFileName = "D:/eclipse/eclipse-workspace/check/file/orig_0.8_deltest.txt";
        double ans = hamming.getsimilarity(simhash.getsimhash(str0), simhash.getsimhash(str1));
        txtio.writetxt(ans, ansFileName);
    }

    @Test
    public void origAndDis1Test(){
        String str0 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig.txt");
        String str1 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig_0.8_dis_1.txt");
        String ansFileName = "D:/eclipse/eclipse-workspace/check/file/orig_0.8_dis_1test.txt";
        double ans = hamming.getsimilarity(simhash.getsimhash(str0), simhash.getsimhash(str1));
        txtio.writetxt(ans, ansFileName);
    }

    @Test
    public void origAndDis10Test(){
        String str0 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig.txt");
        String str1 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig_0.8_dis_10.txt");
        String ansFileName = "D:/eclipse/eclipse-workspace/check/file/orig_0.8_dis_10test.txt";
        double ans = hamming.getsimilarity(simhash.getsimhash(str0), simhash.getsimhash(str1));
        txtio.writetxt(ans, ansFileName);
    }

    @Test
    public void origAndDis15Test(){
        String str0 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig.txt");
        String str1 = txtio.readtxt("D:/eclipse/eclipse-workspace/check/file/orig_0.8_dis_15.txt");
        String ansFileName = "D:/eclipse/eclipse-workspace/check/file/orig_0.8_dis_15test.txt";
        double ans = hamming.getsimilarity(simhash.getsimhash(str0), simhash.getsimhash(str1));
        txtio.writetxt(ans,ansFileName);
    }

}