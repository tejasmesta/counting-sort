class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
        StringBuilder res=new StringBuilder();
        
        int[] count=new int[26];
        
        for(int i=0;i<arr.length();i++){
            count[arr.charAt(i)-97]++;
        }
        
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                res.append((char)(i+97)+"");
                count[i]--;
            }
        }
        
        return res.toString();
        
    }
}
