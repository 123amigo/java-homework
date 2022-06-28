/*卡拉OK歌手打分程序
        设计一接口，为卡拉ok歌手打分。设计两种实现，实现两种打分方法：

        (1) 九个评委，以百分制打分，去掉一个最高分与一个最低分。计算出的平均分保留一位小数。

        (2) 九个评委，以百分制打分，计算出的平均分保留一位小数。

        (3) 九个评委，分段打分，级别为A+, A,B+,B,C+,C,D+,D去掉一个最高分与一个最低分。折算出的平均分为上述8个级别。
*/
import java.util.Scanner;
interface Average{
    void ave(double []x);
}
class Kind1 implements Average{
    @Override
    public void ave(double[] x) {
        double aver=0,temp;
        int i,j,flag;
        for(i=0;i<x.length;i++){
            flag=1;
            for(j=0;j<x.length-i-1;j++){
                if(x[j]>x[j+1]){
                    temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                    flag=0;
                }
            }
            if(flag==1)
                break;
        }
        for(i=1;i<x.length-1;i++){
            aver=aver+x[i];
        }
        aver=aver/(x.length-2);
        System.out.println("最终得分：");
        System.out.printf("%.1f%n",aver);
    }
}
class Kind2 implements Average{
    @Override
    public void ave(double[] x) {
        double aver=0;
        int i;
        for(i=0;i<x.length;i++){
            aver+=x[i];
        }
        aver=aver/x.length;
        System.out.println("最终得分：");
        System.out.printf("%.1f%n",aver);
    }
}
class Kind3 implements Average{
    @Override
    public void ave(double[] x) {
        double aver=0;
        int i;
        int ans;
        String tag="A";
        for(i=0;i<x.length;i++){
            aver+=x[i];
        }
        ans=(int)aver/x.length;
        switch (ans){
            case 24:
                tag="A+";
                break;
            case 16:
                tag="A";
                break;
            case 8:
                tag="B+";
            case 0:
                tag="B";
            case -8:
                tag="C+";
            case -16:
                tag="C";
            case -24:
                tag="D+";
            case -32:
                tag="D";
            default:
                break;
        }
        System.out.println("最终等级："+tag);
    }
}
public class shiyan4 {
    public static void main(String args[]){
        double []singers=new double[9];
        int i;
        String gra;
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入分数：");
        for(i=0;i<singers.length;i++){
            singers[i]= reader.nextDouble();
        }
        Average myKind1=new Kind1();
        myKind1.ave(singers);
        Average myKind2=new Kind2();
        myKind2.ave(singers);
        System.out.println("请输入等级：");
        for(i=0;i<singers.length;i++){
            gra=reader.next();
            switch(gra){
                case "A+":
                    singers[i]=24;
                case "A":
                    singers[i]=16;
                case "B+":
                    singers[i]=8;
                case "B":
                    singers[i]=0;
                case "C+":
                    singers[i]=-8;
                case "C":
                    singers[i]=-16;
                case "D+":
                    singers[i]=-24;
                case "D":
                    singers[i]=-32;
                default:
                    break;
            }
        }
        Average myKind3=new Kind3();
        myKind3.ave(singers);
    }
}
