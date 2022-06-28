/*
购物小票统计
输入至少30份购物小票，信息如下：
年、月、日、时间 购物金额
例如：
2019-5-17 10：37：37 28.5
2019-3-21 20：20：20 100.8
对上述小票金额按从星期一到星期天进行统计，得出结果如下：
星期一 xxx元
星期二 xxx元
... ...
星期日 xxx元
 */
import java.util.*;
import static java.util.Calendar.*;
import java.util.Scanner;
import java.io.*;
public class shiyan7 {
    public static void main(String args[]) throws FileNotFoundException{
        float [][]a = new float[8][30];
        int i = 0;
        InputStream list = new FileInputStream("src/x.txt");
        Scanner reader = new Scanner(list);

        while(reader.hasNext()){
            String line = reader.nextLine();
            String[] tokens = line.split("[-: ]");
            Calendar calendar = getInstance();
            int year = Integer.parseInt(tokens[0]);
            int month = Integer.parseInt(tokens[1]);
            int day = Integer.parseInt(tokens[2]);
            int h = Integer.parseInt(tokens[3]);
            int m = Integer.parseInt(tokens[4]);
            int s = Integer.parseInt(tokens[5]);
            float money = Float.parseFloat(tokens[6]);
            calendar.set(year,month,day,h,m,s);
            int week = calendar.get(DAY_OF_WEEK);
            a[week][i++] = money;
        }
        for(int k=1;k<=7;k++){
            for(int j=0;j<a[k].length;j++){
                if(a[k][j]!=0)
                    a[k][0]+=a[k][j];
            }
        }
        for(int k=1;k<=7;k++)
           System.out.println(xingqi(k)+" "+a[k][0]);
        }
    static String xingqi(int n){
        switch(n){
            case 1:return "星期日";
            case 2:return "星期一";
            case 3:return "星期二";
            case 4:return "星期三";
            case 5:return "星期四";
            case 6:return "星期五";
            case 7:return "星期六";
            default:return "";
        }
    }
}
