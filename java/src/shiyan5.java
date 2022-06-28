/*上机实验五
题目：编写一异常处理程序，模拟地铁、机场进行危险品与违禁物品检查。程序循环接受输入字符串，
检查字符串。若其中含有'b''o''m''b'四个字母（字母顺序无关）就抛出发现危险品异常，提示有危险品炸弹；
若其中含有'h'’e’’r’’o’’i’’n'六个字母则抛出发现违禁品异常。如果没有异常，程序循环接受输入字符串。
 */
import java.util.Scanner;
class Dangerexception extends Exception{
    String message = "有危险品炸弹";
    public String warnMess(){
        return message;
    }
}
class Banexception extends Exception{
    String message = "有违禁物品";
    public String warnMess() {
        return message;
    }
}
class Input {
        public void set1(String thing) throws Dangerexception{
            if(thing.indexOf("b")>=0 && thing.lastIndexOf("b")>=0 && thing.indexOf("b")!=thing.lastIndexOf("b")
                    && thing.contains("o") && thing.contains("m")){
                throw new Dangerexception();
            }

        }
        public void set2(String thing) throws Banexception{
            if(thing.contains("h") && thing.contains("e") && thing.contains("r") && thing.contains("o") && thing.contains("i") && thing.contains("n")){
                throw new Banexception();
            }
            else
                System.out.println("物品正常");
        }

}
public class shiyan5{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        String thing;
        Input cc = new Input();
        while(true){
            thing = reader.next();
            try{
                cc.set1(thing);
                cc.set2(thing);
            }
            catch(Dangerexception e){
                System.out.println(e.warnMess());
            }
             catch(Banexception e){
                System.out.println(e.warnMess());
            }

        }
    }
}
