/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    // O(n)
    // O(1)
    if(s.length != t.length){
        return false;
    }
    
    let mp = {};
    for(let i = 0; i < s.length; i++){
        let curr = s[i];
        if(mp[curr]){
            mp[curr]++;
        } else{
            mp[curr] = 1;
        }
    }
    for(let i = 0; i < t.length; i++){
        let curr= t[i];
        if(mp[curr]){
            mp[curr]--;
            if(mp[curr] == 0) delete mp[curr];
        } else {
            return false        
        }
    }
    return Object.keys(mp).length == 0;
};