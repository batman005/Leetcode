Let's find the math behind  bulb switcher
their are n bulb initially off , 1 turn on, 2nd turn off every second bulb, 3rd round toggle every third bulb. for the ith  round you toggel every i bulb. for the nth round, you only toggle the last bulb
if the factors are even it is off in end, if the factors are odd it is on  in end.
Approach 1 return the number of which has odd number of factors; (O n * f)
Approach 2 lets visualize what are numbers can have odd numberof factors;
Prime numbers always have even factors is 1 & number itself.
Every number has a factor in pair except perfect square numbers. 9 = 1,9,3, 3
As 9 is perfect square is root 9 = 3 thus 3 * 3   thus factor repeated same thhus odd factors
Conclusion ,
**Return count of numbers all the numbers that are perfect square uptill n**
**Number of perfect sqare uptill n are Root (N)
TC.(logn) SC(O(1))**
​