class Father{
    int money;
    int weight;
    static int f=0;
    static int all=0;
    Father(){
        ++f;
        ++all;
    }
    Father(int m,int w){
        money=m;
        weight=w;
        ++f;
        ++all;
    }
    int getWeight(){
        return weight;
    }
    protected void setWeight(int w){
        weight=w;
    }
    int getF(){
        return f;
    }
    int getAll(){
        return all;
    }
}
class Son extends Father{
    String hand;
    static int s=0;
    Son(String h){
        hand=h;
        ++s;
        --f;
    }
    Son(){
        --f;
        ++s;
    }
    public void setHand(String hand){
        this.hand=hand;
    }
    int getS(){
        return s;
    }
}
class Grandson extends Son{
    String foot;
    static int g=0;
    Grandson(){
        ++g;
        --s;
    }
    Grandson(String foot){
        this.foot=foot;
        ++g;
        --s;
    }
    public void setFoot(String foot){
        this.foot=foot;
    }
    String getFoot(){
        return foot;
    }
    int getG(){
        return g;
    }
}
public class Example5 {
    public static void main(String args[]){
        Father father1=new Father();
        Son son1=new Son();
        Grandson grandson1=new Grandson();
        Father father2=new Father(4,5);
        Son son2=new Son("一双小手");
        Grandson grandson2=new Grandson("一双小脚");
        System.out.println("家族所有对象个数："+father1.getAll());
        System.out.println("Father 类对象个数："+father1.getF() );
        System.out.println("Son类对象个数："+son1.getS());
        System.out.println("Grandson类对象个数："+grandson1.getG());
    }
}
