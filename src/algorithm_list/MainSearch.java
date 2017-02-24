package algorithm_list;

import java.util.List;

/**
 * 対象要素を検索
 */
public class MainSearch {
	public static void main(String[] args) {
		CreateList createList = new CreateList();
		List<CreateList.Link> l1 = createList.makeList(1);
		List<CreateList.Link> l2 = createList.makeList(2);
		List<CreateList.Link> l3 = createList.makeList(3);
		List<CreateList.Link> l4 = createList.makeList(4);
		List<CreateList.Link> l5 = createList.makeList(5);

		System.out.println("l1 = " + l1.get(1).getData());
		System.out.println("l2 = " + l2.get(1).getData());
		System.out.println("l3 = " + l3.get(1).getData());
		System.out.println("l4 = " + l4.get(1).getData());
		System.out.println("l5 = " + l5.get(1).getData());

		CreateList.Link head = l5.get(0);
		CreateList.Link p = head;
		CreateList.Link ans = SearchElem.search(p);

		System.out.println(ans == null ? ans : ans.getData());
	}
}
