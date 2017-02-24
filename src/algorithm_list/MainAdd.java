package algorithm_list;

import java.util.List;

/**
 * 対象要素の挿入
 */
public class MainAdd {
	public static void main(String[] args) {
		CreateList createList = new CreateList();
		List<CreateList.Link> l1 = createList.makeList(1);
		List<CreateList.Link> l2 = createList.makeList(2);
		List<CreateList.Link> l3 = createList.makeList(3);
		List<CreateList.Link> l4 = createList.makeList(4);
		List<CreateList.Link> l5 = createList.makeList(5);

		System.out.println("===== start =====");
		System.out.println("l1 : " + "p = " + l1.get(1) + ", data = " + l1.get(1).getData() + ", next = " + l1.get(1).getNext());
		System.out.println("l2 : " + "p = " + l2.get(1) + ", data = " + l2.get(1).getData() + ", next = " + l2.get(1).getNext());
		System.out.println("l3 : " + "p = " + l3.get(1) + ", data = " + l3.get(1).getData() + ", next = " + l3.get(1).getNext());
		System.out.println("l4 : " + "p = " + l4.get(1) + ", data = " + l4.get(1).getData() + ", next = " + l4.get(1).getNext());
		System.out.println("l5 : " + "p = " + l5.get(1) + ", data = " + l5.get(1).getData() + ", next = " + l5.get(1).getNext());

		CreateList.Link head = l5.get(0);
		CreateList.Link p = head;
		UpdateElem.update(4, 100, p);

		System.out.println();
		System.out.println("===== updated =====");
		System.out.println("l1 : " + "p = " + l1.get(1) + ", data = " + l1.get(1).getData() + ", next = " + l1.get(1).getNext());
		System.out.println("l2 : " + "p = " + l2.get(1) + ", data = " + l2.get(1).getData() + ", next = " + l2.get(1).getNext());
		System.out.println("l3 : " + "p = " + l3.get(1) + ", data = " + l3.get(1).getData() + ", next = " + l3.get(1).getNext());
		System.out.println("l4 : " + "p = " + l4.get(1) + ", data = " + l4.get(1).getData() + ", next = " + l4.get(1).getNext());
		System.out.println("l5 : " + "p = " + l5.get(1) + ", data = " + l5.get(1).getData() + ", next = " + l5.get(1).getNext());
	}
}
