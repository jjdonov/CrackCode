package chap02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.jjdonov.datastructures.list.SinglyLinkedList;

public class LinkedListsQuestions {
	/**
	 * 2.1
	 * @param list
	 * @return
	 */
	public static SinglyLinkedList<String> removeDuplicates(SinglyLinkedList<String> list) {
		Map<String,String> set = new HashMap<String,String>();
		Iterator<String> i = list.iterator();
		while(i.hasNext()){
			String aString = i.next();
			if(set.containsKey(aString)){
				i.remove();
			} else {
				set.put(aString, aString);
			}
				
		}
		return list;
	}
	
	/**
	 * 2.2
	 * implement an algorithm to find the Nth to last
	 * element in a list
	 * @return 
	 */
	public static <E> E findNthToLastElement(SinglyLinkedList<E> list, int n) {
		int size = list.size();
		if(n > size - 1)
			/* we have the - 1 because :
			 * for example, take list size 5. An element 5 away from the last 
			 * cannot exist. 0 away from the last would return tail.
			 * size - 1 would return the head.
			 */
			throw new IndexOutOfBoundsException();
		Iterator<E> iter = list.iterator();
		int i = 0;
		E element = null;
		while(iter.hasNext()) {
			if(i == size - n - 1)
				element = iter.next();
			else
				iter.next();
			i++;
		}
		return element;
	}
	
	/**
	 * 2.3
	 * Implement an algorithm to delete a node in the middle of a single 
	 * linked list, given only access to that node.
	 * 
	 * @param node Cannot be the tail. Removal will fill in this case.
	 */
	public static <E> boolean removeNode(SinglyLinkedList.Node<E> node) {
		if(node == null || node.getNext() == null) {
			return false;
		}
		SinglyLinkedList.Node<E> next = node.getNext();
		node.setElement(next.getElement());
		node.setNext(next.getNext());
		return true;
	}
	
	/**
	 * 2.4
	 * 
	 * You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1Õs digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.
	 * EXAMPLE
	 * Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
	 * Output: 8 -> 0 -> 8
	 * 
	 * Ideally we would create a new class to guarantee one digit
	 */
	public static SinglyLinkedList<Integer> addLists(SinglyLinkedList<Integer> list1, SinglyLinkedList<Integer> list2) {
		if(list1.size() != list2.size()) {
			throw new IllegalArgumentException("Lists must be same size");
		}
		SinglyLinkedList<Integer> result = new SinglyLinkedList<Integer>();
		Iterator<Integer> i1 = list1.iterator();
		Iterator<Integer> i2 = list2.iterator();
		Integer carryValue = 0;
		Integer valOne, valTwo, tmp;
		while(i1.hasNext() && i2.hasNext()) {
			valOne = i1.next();
			valTwo = i2.next();
			tmp = valOne + valTwo + carryValue;
			if(tmp > 9) {
				carryValue = tmp / 10;
				tmp = tmp % 10;
			} else {
				carryValue = 0;
			}
			result.insert(tmp);
		}
		return result;
	}
	
	
	
}
