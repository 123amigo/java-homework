import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入第一个矩阵行数：");
        int row1 = reader.nextInt();
        System.out.print("请输入第一个矩阵列数：");
        int list1 = reader.nextInt();
        int[][] a = new int[row1][list1];
        for(int[] a1:a){
            for(int i:a1){
                        i = reader.nextInt();
            }
        }
        for(int[] a2:a){
            for(int j:a2){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
