class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         return add(l1,l2,0);
    }
    public ListNode add(ListNode l1,ListNode l2,int sum){
      if(l1==null&&l2==null&&sum==0){
        return null;
      }
      int index=sum;
      if(l1!=null){
        index+=l1.val;
        l1=l1.next;
      }
      if(l2!=null){
        index+=l2.val;
        l2=l2.next;
      }
        ListNode node=new ListNode(index%10);
        node.next=add(l1,l2,index/10);
        return node;
    }
}
