package datastructure.list;

/*
 *
 * @author Alexander
 * 12 feb 2026
 */
public class List<E> {

	// The reference to the last element in the list
	private Node<E> last;
	// The reference to the first element of the list
	private Node<E> first;

	public void add(Node<E> node) throws Exception {
		//1. check the parameter if it is valid
		if(node == null) {
			throw new Exception("You can not pass a null node to the list");
			
		}
		//2. add the node to the tail of the list
		//2.1 Check first if the head element is null
		// in the case of null, it means the list is empty
		if(first == null) {//if the list is empty
			// the list is empty
			last = node;
			first = node;
		}
		else {
			last.next = node;
			last = node;
			
		}
		
		

	}

	public Node<E> getLast() {
		return last;
	}

	public Node<E> getFirst() {
		return first;
	}

		
	public void printList() {
		
	}
	
}



class Node<E> {

	public Node(E e) {
		data = e;
	}
	// The data stored in a node of the list
	private E data;
	// Each node needs to pint to the next node, we use this variable to do it
	protected Node<E> next;

}
