nums == null or length == 0
​
int insertPos = 0;
​
for(int num: nums){
if(num != 0) nums[insertPos++] = num;
}
​
while(insertPos < nums.length){
nums[insertPos++] = 0;
}