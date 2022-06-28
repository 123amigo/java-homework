import java.util.Scanner;

public class cheng {
        public static void main(String[] args){
            Scanner reader = new Scanner(System.in);
            System.out.print("请输入第一个矩阵行数：");
            int row1 = reader.nextInt();
            System.out.print("请输入第一个矩阵列数：");
            int list1 = reader.nextInt();
            System.out.print("请输入第二个矩阵行数：");
            int row2 = reader.nextInt();
            System.out.print("请输入第二个矩阵列数：");
            int list2 = reader.nextInt();
            int[][] a = new int[row1][list1];
            int[][] b = new int[list2][row2];
            int[][] c = new int[row1][row2];
            System.out.println("第一个矩阵为：");
            for(int i=0;i<a.length;i++)
                for(int j=0;j<a[i].length;j++){
                    a[i][j] = reader.nextInt();
                }
            System.out.println("第二个矩阵为: ");
            for(int i=0;i<b.length;i++)
                for(int j=0;j<b[i].length;j++){
                    b[i][j] = reader.nextInt();
                }
            for(int i=0;i<c.length;i++)
                for(int j=0;j<c[i].length;j++)
                    for(int k=0;k<b.length;k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
            for(int[] c1 :c){
                for(int i:c1){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }


