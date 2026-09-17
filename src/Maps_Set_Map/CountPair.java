package Maps_Set_Map;

import java.util.HashMap;

public class CountPair {
    public static long count(int[]arr,int n,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:arr){
          int x=ele%k;
          map.put(x,map.getOrDefault(x,0)+1);
        }
        long pair=0;
        long count = map.getOrDefault(0,0);
        pair+=count*(count+1)/2;
        map.remove(0);

        if(k%2==0&& map.containsKey(k/2)){
            long halfcount = map.get(k / 2);
            pair+=halfcount*(halfcount+1)/2;
            map.remove(k/2);
        }
        pair*=2;
        for(int key:map.keySet() ){
            int rem=k-key;
            if(map.containsKey(rem))
                pair+=(map.get(key)*map.get(rem));
        }
        pair/=2;
        return pair;
    }
}
