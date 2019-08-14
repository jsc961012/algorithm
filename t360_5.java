import java.util.*;

public class t360_5{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            long[] a = new long[n];
            ArrayList<Long> res = new ArrayList<>();
            int count = 0;
            int flag = 0;
            for(int i = 0;i <n ;i++){
                long s = input.nextLong();
                if(i==0)
                    res.add(s);
                else{
                    for(int j = 0;j<res.size();j++){
                        if(res.get(j) == s)
                            break;
                        else
                            res.add(s);
                    }
                }
            }
            for(int i = 0;i <res.size() ;i++)
                System.out.println(res.get(i));
        }

}
