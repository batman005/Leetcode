s.split() in java help us to detect space between words in sentence
and convert into individual element and array
hello world
​
["hello","world"]
​
//trailing spaces
s= s.trim(); this help us to delete first and last space of sentence
​
```
class Solution {
public String reverseWords(String s) {
s= s.trim();
//split => divides the stringand puts elements into array based on the
//delimiter condition ("\\s+") it help us to check the space
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