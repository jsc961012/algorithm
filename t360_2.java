import java.util.Scanner;

public class t360_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] re = new int[n];
        for(int i = 0;i < n;i++){
            int a = input.nextInt();
            int key = input.nextInt();
            int rang = input.nextInt();
            int max = 0;
            for(int j = 0;j < rang;j++){
                int aaa = transform(j+1,a,a-1);
                if(max < aaa){
                    re[i] = j+1;
                    //System.out.println(j+1);
                    max = aaa;
                }
            }
        }

        for(int i = 0;i < n;i++){
            System.out.println(re[i]);
        }
    }
    public static int transform(int num,int n,int key){
        //参数num为输入的十进制数，参数n为要转换的进制
        int array[]=new int[100];
        int location=0;
        while(num!=0){//当输入的数不为0时循环执行求余和赋值
            int remainder=num%n;
            num=num/n;
            array[location]=remainder;//将结果加入到数组中去
            location++;
        }
        return show(array,location-1,key);

    }
    private static int show(int[] arr,int n,int key){
        int num = 0;
        for(int i=n;i>=0;i--){
            if(arr[i]>9){
                //System.out.print((char)(arr[i]+55));
                if(arr[i] == key)
                    num++;
            }
            else{
                //System.out.print(arr[i]+"");
                if(arr[i] == key)
                    num++;
            }
        }
        //System.out.println(key+"    "+num);
        return num;
    }
}
