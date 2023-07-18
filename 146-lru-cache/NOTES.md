LRU Cache
1. get(key) -> value
-> -1
2. put(key, value)
-> insert
-> remove the LRU item from cache and then we will insert
Dry run
size = 2
put (1, 1)    {1, 1}
put (2, 2)   {1,1} {2, 2}
get(1) -> 1    1 is used
put(3,3)   -> {1,1} {3,3}
get(2) -> - 1
put(4,4)  -> {4, 4}, {3, 3}
get(1) -> -1  , get(3) -> 3, get(4)
​