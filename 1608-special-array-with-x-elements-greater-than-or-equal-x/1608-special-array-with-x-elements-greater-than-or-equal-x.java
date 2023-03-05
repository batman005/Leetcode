class Solution {
    public int specialArray(int[] nums) {
		//Optional: sorting:
		//Arrays.sort(nums);
        //The least value can be 0 as the numbers are all 0 
        int start=0;
        //The maximum value can be the length as all numbers are greater than the 
        //Length of the array and the value is inclusive
        int end=nums.length;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int curr=count(nums,mid);
            //The count of ele >=mid and the mid are equal thus;
            if(curr==mid)
            {
                return mid;
            }
            //If the count of >=mid is less than the mid
            else if(curr<mid)
            {
                //decrease it;
                end=mid-1;
            }
            else if(curr>mid)
            {
                //Increase it;as the value count>mid and we need to reduce the count of values ">=" the mid
                start=mid+1;
            }
        }
        return -1;
    }
    public static int count(int[]arr,int t)
    {
        int c=0;
        for(int i:arr)
        {
            if(i>=t)
            {
                c++;
            }
        }
        return c;
    }
}