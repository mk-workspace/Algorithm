/*
2. 两数相加

给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。

请你将两个数相加，并以相同形式返回一个表示和的链表。

你可以假设除了数字 0 之外，这两个数都不会以 0 开头。

 

示例 1：

输入：l1 = [2,4,3], l2 = [5,6,4]
输出：[7,0,8]
解释：342 + 465 = 807.

示例 2：

输入：l1 = [0], l2 = [0]
输出：[0]

示例 3：

输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
输出：[8,9,9,9,0,0,0,1]


提示：

    每个链表中的节点数在范围 [1, 100] 内
    0 <= Node.val <= 9
    题目数据保证列表表示的数字不含前导零
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Sum = 0;
        int l2Sum = 0;

        int i = 1;
        int j = 1;

        int m = 10;
        int n = 0;

        int l3Sum = 0;

        ListNode l3 = new ListNode();
        int value = 0;

        //Sum l1
        while(l1 != null){
            l1Sum += l1.val*i;
            l1 = l1.next;
            i=i*10;
        }

        //Sum l2
        while(l2 != null){
            l2Sum += l2.val*j;
            l2 = l2.next;
            j=j*10;
        }
        l3Sum = l1Sum + l2Sum;

        System.out.println("Sum l1: " + l1Sum);
        System.out.println("Sum l2: " + l2Sum);
        System.out.println("Sum l3: " + l3Sum);
        // System.out.println("(l3Sum % 10) : " + l3Sum % 10);
        // System.out.println("Result (m=100) : " + l3Sum % 100);
        // System.out.println("Result (value) : " + (l3Sum % 100) / 10);
        System.out.println();

        //ListNode Result l3
        //Situation: 0
        while((l3Sum / m) != 0){
            System.out.println("l3Sum: " + l3Sum);
            System.out.println("(l3Sum / m): " + (l3Sum / m));
            System.out.println("m: " + m);
            System.out.println("n: " + n);
            if(m > 10){
                value = (l3Sum % m) / n;
            } else {
                value = l3Sum % m;
            }
            n = m;
            m = m * 10;
            System.out.println("value: " + value);
            System.out.println();
            // ListNode newNode = new ListNode(value);
            // l3 = l3.next;
        }

        //Last Node
        // value = (l3Sum / m);
        System.out.println("m: " + m);
        System.out.println("LastNode: " + (l3Sum / (m/10)));

        return null;
    }
}