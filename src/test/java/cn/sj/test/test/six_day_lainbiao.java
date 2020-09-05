package test.java.cn.sj.test.test;
//1、单链表的创建和遍历
//2、求单链表中节点的个数
//3、查找单链表中的倒数第k个结点（剑指offer，题15）
//4、查找单链表中的中间结点
//5、合并两个有序的单链表，合并之后的链表依然有序【出现频率高】（剑指offer，题17）
//6、单链表的反转【出现频率最高】（剑指offer，题16）
//7、从尾到头打印单链表（剑指offer，题5）
//8、判断单链表是否有环
//9、取出有环链表中，环的长度
//10、单链表中，取出环的起始点（剑指offer，题56）。本题需利用上面的第8题和第9题。
//11、判断两个单链表相交的第一个交点（剑指offer，题37）

class fangfa{
    lianbiao head;
    lianbiao current;

    //添加数据
    public void add(int data){
        if (head == null){
            head = new lianbiao(data);
            current = head;
        }else {
            current.lb = new lianbiao(data);
            current = current.lb;
        }
    }

    public void add(lianbiao node) {
        if (node == null) {
            return;
        }
        if (head == null) {
            head = node;
            current = head;
        } else {
            current.lb = node;
            current = current.lb;
        }
    }

    //打印数据
    public void printlb(lianbiao lb){

        if(lb == null){
            return;
        }
        current = lb;
        while (current != null){
            System.out.println(current.data);
            current = current.lb;
        }
    }

    //求节点个数
    public int sum(lianbiao lb){
        if(lb == null){
            return 0;
        }

        int count = 0;
        current = lb;
        while (current != null){
            count++;
            current = current.lb;
        }
        return count;

    }

    //查找倒数第k个节点
    public int lastSelect(lianbiao lb,int a){
        int sum = sum(lb);
        if(lb == null){
            return -1;
        }

        if(sum<a){
            return -2;
        }
        int select = 0;
        current = lb;
        for(int i=0;i<(sum-a)+1;i++){
            select = current.data;
            current = current.lb;
        }
        return select;
    }

    //显示中间节点
    public int zhongSelect(lianbiao lb){
        if(lb == null){
            return -1;
        }
        int sum = sum(lb);
        int select =0;
        current = lb;
        for(int i=0;i<sum/2+1;i++){
            select = current.data;
            current = current.lb;
        }
        return select;
    }

    public void addlist(lianbiao list1) {
        this.current.lb =  list1;

    }

    //合并表格
    public  lianbiao sumlist(fangfa list, fangfa list1) {

        if(list.head == null && list1.head == null){
            return null;
        }
        if(list.head  == null){
            return list1.head;
        }
        if(list1.head == null){
            return list.head;
        }

        lianbiao head;
        lianbiao current;

        if(list.head.data<list1.head.data){
            head = list.head;
            current = list.head;
            list.head = list.head.lb;
        }else {
            head = list1.head;
            current = list1.head;
            list1.head = list1.head.lb;
        }

        while (list.head!= null && list1.head!= null){
            if(list.head.data < list1.head.data){
                current.lb = list.head;
                current = current.lb;
                list.head = list.head.lb;
            }else {
                current.lb = list1.head;
                current = current.lb;
                list1.head = list1.head.lb;
            }

            if (list.head != null){
                current.lb = list.head;
            }
            if(list1.head != null){
                current.lb = list1.head;
            }

        }
        return head;
    }

    //反转
    public lianbiao fanzhuan(lianbiao head) {
        if(head ==null || head.lb == null){
            return head;
        }

        lianbiao current = head;
        lianbiao lb = null;
        lianbiao relb = null;

        while (current != null){
            lb = current.lb;
            current.lb = relb;
            relb = current;

            current = lb;
        }


        return relb;
    }

    //链表倒过来打印
    public void relist(lianbiao list){
        if(list == null){
            return;
        }
        relist(list.lb);
        System.out.println(list.data);
    }

    //判断是否有环结构链表
    public boolean huan(lianbiao list){
        if(list == null){
            return false;
        }

        lianbiao first = list;
        lianbiao second = list;

        while (second != null){
            first = first.lb;
            second = second.lb.lb;

            if(first == second){
                return true;
            }
        }
        return false;
    }

    //取出有环链表中，环的长度
    public lianbiao huanLength(lianbiao list){
        if(list == null){
            return null;
        }

        lianbiao first = list;
        lianbiao second = list;

        while (second != null){
            first = first.lb;
            second = second.lb.lb;

            if(first == second){
                return first;
            }
        }
        return null;
    }

    public int getLength(lianbiao list){
        if(head == null){
            return 0;
        }

        lianbiao current = list;
        int length = 0;

        while (current != null){
            current = current.lb;
            length++;
            if(current == list){
                return length;
            }
        }

        return length;
    }

    //获取环的起点
    public lianbiao getCycle(lianbiao list,int length){
        if(list == null){
            return null;
        }

        lianbiao first = list;
        lianbiao secone = list;

        for(int i = 0;i<length;i++){
            secone = secone.lb;
        }

        while (first!=null&&secone!=null){
            first = first.lb;
            secone = secone.lb;
            if(first == secone){
                return first;
            }
        }



        return null;
    }
}
//=====================下面为对象类===================
class lianbiao{
    int data;
    lianbiao lb;
    public lianbiao(int data){
        this.data = data;
    }

}

public class six_day_lainbiao {
    //1、单链表的创建和遍历
    public static void main(String[] args) {
        fangfa list = new fangfa();
        fangfa list1 = new fangfa();
        lianbiao lianbiao1 = null;
        for(int i=0;i<10;i++){
            list.add(i);

            if (i==3){
                lianbiao1 =list.current;
            }
        }
        for(int i=1;i<30;i++){
            list1.add(i);
        }
//        list1.printlb(list1.head);
        //System.out.println("链表长度为:"+list.sum(list.head));
//        System.out.println("倒数第4个字节为："+list.lastSelect(list.head,4));
//        System.out.println("中间结点为："+list.lastSelect(list.head,4));
//        System.out.println("中间节点为:"+list.zhongSelect(list.head));

        //5、合并两个有序的单链表，合并之后的链表依然有序
//        list.addlist(list1.head);
//        fangfa list2 = new fangfa();
//        list2.printlb(list2.sumlist(list,list1));

        //6、单链表的反转【出现频率最高】（剑指offer，题16）
        //list.printlb(list.fanzhuan(list.head));

        //从尾到头打印单链表（剑指offer，题5）
//        list.relist(list.head);

        //判断单链表是否有环
//        System.out.println(list.huan(list.head));

        //取出有环链表中，环的长度
        list.add(lianbiao1);
        //list.printlb(list.head);
        //lianbiao lianbiao = list.huanLength(list.head);
        //System.out.println("环的长度为:"+list.getLength(lianbiao));

        //判断两个单链表相交的第一个交点
        lianbiao list3= list.huanLength(list.head);
        int length = list.getLength(list3);
        System.out.println("第一个交点为:"+list.getCycle(list.head,length).data);

    }


}
