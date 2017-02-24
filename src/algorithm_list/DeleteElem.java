package algorithm_list;

import java.util.HashMap;
import java.util.Map;

/**
 * 対象要素を削除
 */
public class DeleteElem {

	public static Map<String, CreateList.Link> delete(int target, CreateList.Link p, CreateList.Link q) {
		while (target != p.getData()) {
			if (p.getNext() == null) {
				return null;
			} else {
				q = p;
				p = p.getNext();
			}
		}
		q.setNext(p.getNext());

		Map<String, CreateList.Link> map = new HashMap();
		map.put("p", p);
		map.put("q", q);
		return map;
	}
}
