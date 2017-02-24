package algorithm_list;

/**
 * 対象要素を更新
 */
public class UpdateElem {

	public static CreateList.Link update(int target, int updateData, CreateList.Link p) {
		while (target != p.getData()) {
			if (p.getNext() == null) {
				return null;
			} else {
				p = p.getNext();
			}
		}
		p.setData(updateData);
		return p;
	}
}
