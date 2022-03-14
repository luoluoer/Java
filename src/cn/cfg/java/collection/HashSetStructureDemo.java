
package cn.cfg.java.collection;

/**
* 模拟一个HashSet的底层(HashMap的底层结构     )
* @author 柴方贵
* @version 创建时间：2022年3月10日 下午9:37:19
*/
public class HashSetStructureDemo {
	public static void main(String[] args) {
		//1.创建有一个数组,数据类型是Node[]
		NodeDemo[] table = new NodeDemo[16];//2.有些人直接讲Node数组,称为table
		//3,创建节点
		NodeDemo john = new NodeDemo("john",null);
		table[2] = john;//将John放到数组table的索引是2的位置
		NodeDemo jack = new NodeDemo("jack",null);
		john.next = jack;//将Jack节点,挂到John
		
		NodeDemo rose = new NodeDemo("rose",null);
		jack.next = rose;//将rose节点,挂到jack
		NodeDemo lucy = new NodeDemo("lucy",null);
		table[3] = lucy;//将lucy放到数组table的索引是3的位置
		//以上这段代码, 其实就是在table数组的下标为2的位置添加了一个链表
		//链表的元素依次是 john  jack  rose
		//在table数组的下标为3的位置添加了一个链表
		//链表的元素是 lucy
	}
}


//以上代码只是为了更好的说明HashSet(HashMap)
/*1.HashSet的底层是HashMap
 * 2.添加一个元素时,先得到hash值,然后转成索引值
 * 3.找到存储数据表table,看这个索引位置是否已经存放元素
 * 4.如果没有直接加入
 * 5.如果有,调用equals方法比较,如果 相同,放弃添加,如果不同,则添加到最后
 * 6.Java8中,如果一条链表的袁术个数到达 TREEIFY_THRESHOLD(默认8),并且table的大小>=MIN_TREEIFYY_CAPPACITY(摸摸人64),就会进行树化
 * */


class NodeDemo{//节点,存储数据,可以指向下一个节点,从而形成链表
	Object item ;//存放数据
	NodeDemo next;//指向下一个节点
	
	/**
	 * 
	 */
	public NodeDemo(Object item,NodeDemo next) {
		// TODO Auto-generated constructor stub
		this.item = item;
		this.next = next;
	}
	
}