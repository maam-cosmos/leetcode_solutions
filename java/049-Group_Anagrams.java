/** Find the sorted string value, then check in the map for the corresponding list. 
 *  If list found then add the value to the list, if not then create a new list and 
 *  then add the value 
 *
 * Run a forloop to iterate through the array.
 *
 *
 * 1. Create a map of "key = string" and "value = List<String>", like map<String , List<String>>
 *
 * 2. Convert the string to array, sort the array, convert the array to string.  By doing this, 
 *    we will find the sorted string, this will help in checking the anagram from the map.
 *
 * 3. Then take the value of sorted string and check in the map ("using getOrDefault()") for the 
 *    respective list. If corresponding value is found, then store the value in a list. Otherwise, 
 *    return the default value that is provided as parameter in the method. 
 *
 * 4. getOrDefalt() take two input. One is the key, and the other is the default value. 
 *    If value for the searched key is found, it return the value. Otherwise, it return 
 *    the default value. 
 *
 * 
 *  map.values() method returns an array of all the values present in a hashmap. It does not follow 
 *  any order. 
 *
 */


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> storeString = new HashMap();
        
        for(String s : strs){
            char [] createCharArray = s.toCharArray();
            Arrays.sort(createCharArray);
            String createString = String.valueOf(createCharArray);
            
            List<String> stringList = storeString.getOrDefault(createString, new ArrayList());
            stringList.add(s);
            
            storeString.put(createString, stringList);
        }
        
        return new ArrayList(storeString.values());
        
    }   
}