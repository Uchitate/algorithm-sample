package algorithm_list;

/**
 * 対象要素を挿入
 */
public class AddElem {

	public static CreateList.Link add(int target, CreateList.Link p) {
		CreateList link = new CreateList();
		CreateList.Link pp = link.generateLink(100);
		while (target != p.getData()) {
			if (p.getNext() == null) {
				return null;
			} else {
				p = p.getNext();
			}
		}
		pp.setNext(p.getNext());
		p.setNext(pp);
		return p;
	}
}
