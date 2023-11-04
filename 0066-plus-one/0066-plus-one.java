class Solution {
    public int[] plusOne(int[] digits) {
        
       for(int i=digits.length-1;i>=0;i--){

           if(digits[i]<9){
               digits[i]+=1;
               return digits;
           }

           digits[i]=0;
       }

       digits=new int[digits.length+1];
       digits[0]=1; //if all digits in digits array is 9 then we put 0s and then created a +1 bigger array and in that 0th position we put 1

       return digits;
    }
}