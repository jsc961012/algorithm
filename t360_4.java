import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class t360_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++)
            a[i] = input.nextInt();
        int num = input.nextInt();
        int[] re = new int[num];
        for(int i = 0;i <num;i++ ){
            int sta = input.nextInt();
            int end = input.nextInt();
            ArrayList<Integer> res = getMethod_4(a,sta-1,end);
            re[i] = res.size();
        }
        for (int i= 0 ;i<num;i++)
            System.out.println(re[i]);
    }
    public static void getres(int[] a,int sta,int end){
        ArrayList<Integer> res = new ArrayList<Integer>();
        int count = 0;
        for(int i = sta;i< end ;i++){
            for(int j=0;j<res.size();j++){
                if(res.get(j) == a[i])
                    break;
            }
        }
    }

    public static ArrayList<Integer> getMethod_4(int[] array,int sta,int end){
        ArrayList<Integer> res = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<>();
        if(array == null || array.length < 1)
            return res;
        for(int i=sta;i<end;i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            }else{
                map.put(array[i], 1);
            }
        }
        for(Integer key : map.keySet()){
                res.add(key);
        }
        return res;
    }

}
