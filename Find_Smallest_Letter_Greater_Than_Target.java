class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        int mid = 0;
        char t= letters[0];
        while(start<=end){
            mid = (start + end)/2;
            
            if(letters[mid]>target){
                t = letters[mid];
                end = mid-1;
            }
            if(letters[mid]<=target){
                start = mid+1;
            }
        }
        return t;


    }
}