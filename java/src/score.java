import java.util.Scanner;

class ChengJi {
     String name;
     double chinese,math,english,sum;
    ChengJi(String n,double c,double m,double e){
        name=n;
        chinese=c;
        math=m;
        english=e;
        sum=c+m+e;
    }
    double getSum(){
        return sum;
    }
    double getChinese(){
        return chinese;
    }
    double getMath(){
        return math;
    }
    double getEnglish(){
        return english;
    }
    String getName(){
        return name;
    }
}
public class score{
    public static void main(String []args){
        Scanner reader = new Scanner(System.in);
        int i,j,n,flag=0;
        double ave=0;
        System.out.print("请输入学生数目：");
        n=reader.nextInt();
        int []no=new int[n];
        for(i=0;i<n;i++)
            no[i]=0;
        ChengJi []a=new ChengJi[n];
        for(i=0;i<n;i++){
            String name=reader.next();
            double chinese=reader.nextDouble();
            double math=reader.nextDouble();
            double english=reader.nextDouble();
            ChengJi stu=new ChengJi(name,chinese,math,english);
            a[i]=stu;
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j].getSum()<a[j+1].getSum()){
                    ChengJi tag=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tag;
                }
                else if(a[j].getSum()==a[j+1].getSum() && a[j].getChinese()<a[j+1].getChinese()){
                    ChengJi tag=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tag;
                }
                else if(a[j].getSum()==a[j+1].getSum() && a[j].getChinese()==a[j+1].getChinese() && a[j].getMath()<a[j+1].getMath()){
                    ChengJi tag=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tag;
                }
                else if(a[j].getSum()==a[j+1].getSum() && a[j].getChinese()==a[j+1].getChinese() && a[j].getMath()==a[j+1].getMath() && a[j].getEnglish()<a[j+1].getEnglish()){
                    ChengJi tag=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tag;
                }
            }
        }
        no[0]=1;
    for(i=1;i<n;i++){
        if(a[i].getSum()<a[i-1].getSum()){
            no[i]=no[i-1]+flag+1;
            flag=0;
        }
        else{
            no[i]=no[i-1];
            flag++;
        }
    }
    for(i=0;i<15;i++){
        ave+=a[i].getSum();
    }
    ave=ave/n;
        System.out.println("姓名"+"\t"+"\t"+"语文"+"\t"+"\t"+"数学"+"\t"+"\t"+"英语"+"\t"+"\t"+"名次");
    for(i=0;i<n;i++){
        System.out.println(a[i].getName()+"\t"+a[i].getChinese()+"\t"+a[i].getMath()+"\t"+a[i].getEnglish()+"\t"+no[i]);
    }
    System.out.println("平均成绩："+ave);
    }
}