class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      //排序加哈希
    Map<String,List<String>> map=new HashMap<String,List<String>>();
    for(String str:strs){
      char[] ch=str.toCharArray();//将字符转换为字符数组
      Arrays.sort(ch);//排序字符数组
      String key=new String(ch);//将字符数组化为字符串
      //取出对应的list，若没有则创建一个空的list
      List<String> list=map.getOrDefault(key,new ArrayList<String>());
      //将str压入list中
      list.add(str);
      //更新完后放回mapzhon
      map.put(key,list);
    }
    //取出map中所有value的list集合（按key分好组的）->构建List<List>
    return new ArrayList<List<String>>(map.values());
    }
}
