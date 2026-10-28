int[] count=new int[26];
for(int i=0;i<s.length();i++){
  count[s.charAt(i)- 'a']++;
  count[t.chartAt(i) - 'a']--;
}
for(int i=0;i<26;i++){
  if(count[i]!=0){
    return false;
  }
}
return true;
 }
}
          
