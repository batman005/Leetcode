Ex 1: - 1 , 2  2, 3 , 3 , 4                                 interval[0] < prev[1]
interval
prev
​
if we skip the interval increase by 1.
interval will become new previous
​
1, 3 is the overlapping interval
compare one interval with next interval
They need to be sorted
​
interval scheduling problem are always kind of greedy
if greedy does not work
try apply dp + binary search
To know for greedy to work -> Just take 2 intervals and then try every posibility for them
end and start is same we will call its overlapping