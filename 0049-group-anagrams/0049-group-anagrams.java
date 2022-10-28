class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
	//Map to store all the strings
       Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
		 //sorting the string
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            
			//putting sorted char which are not present in the group
            if(!map.containsKey(sorted)){
                map.put(sorted, new LinkedList<String>());
            }
			//adding it to the bucket of string which are anagrams
            map.get(sorted).add(s);
        }
        return new LinkedList<>(map.values());
    }
}