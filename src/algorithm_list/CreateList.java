package algorithm_list;

import java.util.Arrays;
import java.util.List;

/**
 * リストを作成するクラス
 */
public class CreateList {

	private Link head = null;

	public List<Link> makeList(int data) {
		Link p = new Link(data);
		p.next = head;
		head = p;

		return Arrays.asList(head, p);
	}

	public Link generateLink(int data) {
		return new Link(data);
	}

	public class Link {
		private int data;

		private Link next;

		public Link(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Link getNext() {
			return next;
		}

		public void setNext(Link next) {
			this.next = next;
		}
	}
}
