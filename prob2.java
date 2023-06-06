import java.util.List;
import java.util.ArrayList;

public class prob2 {
    public static  List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans = new ArrayList<>(numRows);
        if(numRows <= 0) return ans;
        List<Integer>prev = new ArrayList<>();
        prev.add(1);
        ans.add(prev);
        for(int i = 2;i <= numRows;i++){
             List<Integer>curr = new ArrayList<>();
            curr.add(1);
            for(int j = 0;j < prev.size()-1;j++)
               curr.add(prev.get(j)+prev.get(j+1));
            
            curr.add(1);
            ans.add(curr);
            prev = curr;

        }
       return ans;
    }

    public static void main(String[] args) {
        generate(6);
    }
}
