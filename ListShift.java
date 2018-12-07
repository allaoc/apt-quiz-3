public class ListShift {
        public ListNode shift(ListNode start, int key) {
            ListNode firsthigh = null;
			ListNode firstlow = null;
			ListNode high = null;
			ListNode low = null;
			while (start != null) {
				if (start.info > key) {
					if (firsthigh == null) {
						firsthigh = new ListNode(start.info, null);
						high = firsthigh;
					}
					else {
						high.next = new ListNode(start.info,null);
						high = high.next;
					}
				}
				else {
					if (firstlow == null) {
						firstlow = new ListNode(start.info, null);
						low = firstlow;
					}
					else {
						low.next = new ListNode(start.info,null);
						low = low.next;
					}
				}
				start = start.next;
			}
			if (firsthigh == null) return firstlow;
			high.next = firstlow;
			return firsthigh;
        }
}