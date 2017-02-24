package algorithm_list;

/**
 * 対象要素を検索
 */
public class SearchElem {

	private static final int X = 4;

	public static CreateList.Link search(CreateList.Link p) {
		while (X != p.getData()) {
			if (p.getNext() == null) {
				return null;
			} else {
				p = p.getNext();
			}
		}
		return p;
	}
}
