import java.util.*;

class Main {
    public static void main(String[] args) {
        char seperator = '.';
      List<String> nums=Arrays.asList("i'm.not.your.dad","why.don't",".go.away.");
       String sentence =String.join(" ", splitString(nums, seperator));
System.out.println(sentence);

}
    public static List<String>splitString(List<String>nums,char seperator){
        List<String> result = new ArrayList<>();
        int n = nums.size();
        for(int i=0; i<n; i++){
            String arr[]=nums.get(i).split("["+seperator+"]");
            for(int j=0;j<arr.length;j++){
            if(arr[j].length()>0){
                result.add(arr[j]); }
            }
        }
        return result;
    }
}
