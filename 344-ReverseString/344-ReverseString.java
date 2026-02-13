// Last updated: 2/13/2026, 11:23:40 AM
class Solution {
    public void reverseString(char[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp; 
        i++;
        j--;
        }
    }
}