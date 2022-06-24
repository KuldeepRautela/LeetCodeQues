package questions

/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 */

class IsomorphicString {

    fun isIsomorphic(s: String, t: String): Boolean {
        if(s.length!=t.length)
            return false
        var temp1=""
        var temp2=""
     for(i in s.indices){
         if(temp1.contains(s[i])){
               if(!verifyChar(i,s,t,temp1,temp2))
                   return false
         }else{
             if(temp2.contains(t[i]))
                 return false
             temp1+=s[i]
             temp2+=t[i]
         }
     }
     return true
    }

    private fun verifyChar(i:Int, s:String, t:String, temp1:String,temp2:String):Boolean{
        for(j in temp1.indices){
            if(temp1[j]==s[i]){
                if(t[i]!=temp2[j]) {
                    return false
                }
            }
        }
        return true
    }
}