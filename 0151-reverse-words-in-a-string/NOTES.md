s.split() in java help us to detect space between words in sentence
and convert into individual element and array
hello world
​
["hello","world"]
​
s= s.trim(); this help us to delete first and last space of sentence
​
```
class Solution {
public String reverseWords(String s) {
s= s.trim();
List<String> wordList= Arrays.asList(s.split("\\s+"));
System.out.println(wordList);
return "";
}
}
```
​
​
​
​
​
​
​