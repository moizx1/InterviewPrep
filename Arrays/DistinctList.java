package Arrays;
import java.util.*;
public class DistinctList {
//    public static List<Integer> getDistinctList(List<Integer> list){
//        List<Integer> dupl_element = new ArrayList<Integer>();
////        int[] dupl_element;
//        for (int i=0; i<list.size(); i++){
//            int element = list.get(i);
//            for(int j=i+1; j<list.size(); j++){
//                if(element==list.get(j) && !dupl_element.contains(element)){
//                    dupl_element.add(element);
//                    break;
//                }
//            }
//        }
//        return dupl_element;
//    }
    public static Map getDistinctList(List<Integer> list){
        Map<Integer, Integer> count= new HashMap<>();
        int duplicate_count=0;
        for(int elem : list){
            count.put(elem, count.getOrDefault(elem, 0)+1);
            if(count.get(elem)==2){
                duplicate_count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        List<Integer> duplicate_elements = new ArrayList<Integer>(Arrays.asList(1,-1,2,-3,4,4,4,4,2,3,6,10,-9,9));
        Map result = getDistinctList(duplicate_elements);
        System.out.println(result.keySet());
    }
}
