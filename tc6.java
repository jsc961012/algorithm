import java.util.*;
public class tc6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        char[][] c = new char[a][b];
        char[][] d = new char[a][b];
        for(int i=0;i<a;i++)
            for(int j=0;j<b;j++)
                c[i][j] = 'X';
        for(int i=0;i<a;i++)
            for(int j=0;j<b;j++)
                d[i][j] = input.next().charAt(0);
        System.out.println(d[2][2]);
    }
}