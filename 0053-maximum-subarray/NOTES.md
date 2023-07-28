-2, -3, 4, -1, -2, 1,5, -3
kadanes algo
max = nums[0];  // -2
sum = 0;
for(i-> 0 to n)
sum += nums[i];// -2 , -3, 4, 3,1,2,7
if(sum > maximum)
maximum = sum;// 4 -> 7
if(sum < 0)
sum = 0;
return maximum // 7