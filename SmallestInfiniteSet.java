import java.util.TreeSet;

class SmallestInfiniteSet {
    TreeSet<Integer> set;

    public SmallestInfiniteSet() {
        set=new TreeSet<>();
        for(int i=1;i<=1000;i++)
            set.add(i);
    }
    
    public int popSmallest() {
        return set.pollFirst();
        
    }
    
    public void addBack(int num) {
        if (!set.contains(num))
        set.add(num);
        
    }
}
