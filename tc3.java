import java.util.*;
public class tc3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int number = 0;
        int i =0;
        double result =0;
        for(i = 0;i<M;i++){
            number += Math.pow(2,i);
            result = Math.pow(2,i);
            System.out.println(result);
        }
        //System.out.println(result);
        /*
        if(number == N)
            System.out.println(result);
        /*else if(number < N)
        {

        }*/
    }
}
