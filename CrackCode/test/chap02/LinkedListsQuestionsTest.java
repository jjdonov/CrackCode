package chap02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jjdonov.datastructures.list.SinglyLinkedList;

public class LinkedListsQuestionsTest {

	private final String[] testData = { "John", "John", "Karl", "John", "Max" };
	private SinglyLinkedList<String> list;

	@Before
	public void setUp() throws Exception {
		list = new SinglyLinkedList<String>();
		list.insertAll(testData);
	}

	@Test
	public void testRemoveDuplicates() {
		list = LinkedListsQuestions.removeDuplicates(list);
		System.out.println(list.toString());
		assertEquals(3, list.size());
	}

	@Test
	public void testFindNthToLastElement() {
		String result = LinkedListsQuestions.findNthToLastElement(list, 3);
		assertEquals("John", result);
	}

	@Test 
	public void addListsTest() {
		Integer[] s1 = {1,0,0,9};
		Integer[] s2 = {3,9,0,9};
		SinglyLinkedList<Integer> list1 = new SinglyLinkedList<Integer>(s1);
		SinglyLinkedList<Integer> list2 = new SinglyLinkedList<Integer>(s2);
		SinglyLinkedList<Integer> answer = LinkedListsQuestions.addLists(list1, list2);
		System.out.println(answer);
	}
}
