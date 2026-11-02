//package Maps_Set_Map;
//
//import java.util.HashMap;
//
//public class Maps_Stl {
//
//    public char getMaxOccuringChar(String s) {
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            if (map.containsKey(c)) {
//                int freq = map.get(c);
//                map.put(c, freq + 1);
//            }
//            else {
//                map.put(c, 1);
//            }
//        }
//
//        int maxFreq = 0;
//
//        for (char c : map.keySet()) {
//            int freq = map.get(c);
//
//            if (freq > maxFreq) {
//                maxFreq = freq;
//            }
//        }
//
//        char ans = 'z';
//
//        for (char c : map.keySet()) {
//            int freq = map.get(c);
//
//            if (freq == maxFreq && c <= ans) {
//                ans = c;
//            }
//        }
//
//        return ans;
//    }
//}