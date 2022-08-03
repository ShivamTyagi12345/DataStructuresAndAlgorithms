import java.util.ArrayList;
import java.util.List;

public class gooddays {

    public static void main(String[] args) {
        int security[] = { 5, 3, 3, 3, 5, 6, 2 }, time = 2;
        System.out.println(goodDaysToRobBank(security, time));

    }

    // public static List<Integer> goodDaysToRobBank(int[] security, int time) {
    //     int l = security.length - 1;
    //     List<Integer> ans = new ArrayList<>();
    //     if (l < time)
    //         return ans;
    //     for (int i = time; i < security.length-time; i++) {
    //         if(check(security,i,time)){
    //             ans.add(i);
    //         }

    //     }
    //     return ans;

    // }

    // private static boolean check(int[] security, int i, int time) {
    //     boolean left=true,right=true;
    //     for(int l=0;l<time;l++){
    //         if(security[i-l]>security[i-l-1])
    //         left=false;

    //     }
    //     for (int j = 0; j < time; j++) {
    //         if(security[i+j]>security[i+j+1])
    //         right= false;
            
    //     }

    //     return left&&right;
    // }

    public static List<Integer> goodDaysToRobBank(int[] security, int time) 
    {
        int n=security.length;
        List<Integer> ans=new ArrayList<>();
        
        int increasing[]=new int[n];
        ascending(increasing,security);
        
        int decreasing[]=new int[n];
        descending(decreasing,security);
        
        for(int i=0;i<n;i++)
        {
            if(decreasing[i]>=time && increasing[i]>=time)
            ans.add(i);
        }
        
        return ans;
    }
    
    public static void descending(int decreasing[],int a[])
    {
        decreasing[0]=0;
        
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<=a[i-1])
            decreasing[i]=decreasing[i-1]+1;
        }
    }
    
    public static void ascending(int increasing[],int a[])
    {
        int n=a.length;
        
        increasing[n-1]=0;
        
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]<=a[i+1])
            increasing[i]=increasing[i+1]+1;
        }
    }

}
