package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static long getCountEmptyStringUsingJava7(List<String> list){
        long count = 0;
        for(String item:list){
            if (item.isEmpty()){
                count++;
            }
        }
    return count;}

    public static long getCountLength3UsingJava7(List<String> list){
        long count =0;

        for(String item:list){
            if (item.length() == 3){
                count++;
            }
        }
    return count;}

    public static List<String> deleteEmptyStringsUsingJava7(List<String> list){
            ArrayList<String> newList = new ArrayList<String>(list);
            int listSize = newList.size();
            for(int i=0;i<listSize;i++){
                if (newList.get(i).isEmpty()){
                    newList.remove(i);
                    i=i-1;
                    listSize=listSize-1;}
                }
                return newList;
    }
    public static String getMergedStringUsingJava7(List<String> list, String comma){
        String merged="#";
        ArrayList<String> newList = new ArrayList<>(list);
        int listSize = newList.size();
        for(int i=0;i<listSize;i++) {
            if (newList.get(i).isEmpty()) {
                newList.remove(i);
                i = i - 1;
                listSize = listSize - 1;
            }else{
                merged = merged.concat(newList.get(i)).concat(comma);
            }
        }
        merged = merged.substring(1,merged.length()-1);
        return merged;}

        public static List<Integer> getSquares(List<Integer> list){
            ArrayList<Integer> newList = new ArrayList<>();
            for(int i =0;i<list.size();i=i+2){
                newList.add((int)Math.pow(list.get(i),2));
            }
        return newList;}

        public static Integer getMax(List<Integer> list){
        Integer maxValue=0;
            for(Integer max:list){
                if(max>maxValue){
                    maxValue=max;
                }
            }
        return maxValue;}

    public static Integer getMin(List<Integer> list){
        Integer minValue=list.get(0);
        for(Integer min:list){
            if(min<minValue){
                minValue=min;
            }
        }
        return minValue;}

    public static Integer getSum(List<Integer> list)    {
        Integer sum=0;
        for(Integer val:list){
            sum = sum + val;
        }
    return sum;}

    public static Integer getAverage(List<Integer> list){
        Integer average=0;
        Integer sum=0;
        for(Integer val:list){
            sum = sum + val;
        }
        average = sum/list.size();

    return average;}
}
