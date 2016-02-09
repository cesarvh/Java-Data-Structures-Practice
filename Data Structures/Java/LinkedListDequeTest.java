/** Performs some basic linked list tests. */
public class LinkedListDequeTest {
	
	/* Utility method for printing out empty checks. */
	public static boolean checkEmpty(boolean expected, boolean actual) {
		if (expected != actual) {
			System.out.println("isEmpty() returned " + actual + ", but expected: " + expected);
			return false;
		}
		return true;
	}

	/* Utility method for printing out empty checks. */
	public static boolean checkSize(int expected, int actual) {
		if (expected != actual) {
			System.out.println("size() returned " + actual + ", but expected: " + expected);
			return false;
		}
		return true;
	}

	/* Prints a nice message based on whether a test passed. 
	 * The \n means newline. */
	public static void printTestStatus(boolean passed) {
		if (passed) {
			System.out.println("Test passed!\n");
		} else {
			System.out.println("Test failed!\n");
		}
	}

	/** Adds a few things to the list, checking isEmpty() and size() are correct, 
	  * finally printing the results. 
	  *
	  * && is the "and" operation. */
	public static void addIsEmptySizeTest() {
		System.out.println("Running add/isEmpty/Size test.");
		System.out.println("Make sure to uncomment the lines below (and delete this print statement).");
		
		LinkedListDeque<String> lld1 = new LinkedListDeque<String>();

		boolean passed = checkEmpty(true, lld1.isEmpty());

		lld1.addFirst("front");
		passed = checkSize(1, lld1.size()) && passed;
		passed = checkEmpty(false, lld1.isEmpty()) && passed;

		lld1.addLast("middle");
		passed = checkSize(2, lld1.size()) && passed;

		lld1.addLast("back");
		passed = checkSize(3, lld1.size()) && passed;

		System.out.println("Printing out deque: ");
		lld1.printDeque();

		printTestStatus(passed);
		
	}

	/** Adds an item, then removes an item, and ensures that dll is empty afterwards. */
	public static void addRemoveTest() {

		System.out.println("Running add/remove test.");

		System.out.println("Make sure to uncomment the lines below (and delete this print statement).");
		
		LinkedListDeque<Integer> lld1 = new LinkedListDeque<Integer>();
		// should be empty 
		boolean passed = checkEmpty(true, lld1.isEmpty());

		lld1.addFirst(6);
		// should not be empty 
		passed = checkEmpty(false, lld1.isEmpty()) && passed;

		lld1.addFirst(5);
		lld1.addFirst(4);
		lld1.addFirst(3);
		lld1.addFirst(2);
		lld1.addFirst(1);

		lld1.addLast(-2);
		lld1.addLast(-3);
		lld1.addLast(-4);
		lld1.addLast(-5);


		// int i = 0;
		// LinkedListDeque.Node temp = lld1.sentinel.next;
		
		// while (i < lld1.size() + 3) {
		// 	System.out.println(temp.data);
		// 	temp = temp.next;
		// 	i += 1;
		// }
		// Should print:
		// 1
		// 2
		// 3
		// 4
		// 5
		// 6
		// -2
		// -3
		// -4
		// -5
		// 1
		// 2

		System.out.println(lld1.get(2));
		// System.out.println(lld1.getRecursive(0));
		System.out.println(lld1.getRecursive(2));

		// lld1.printDeque();
		// // Should print "1, 2, 3, 4, 5, 6, -2, -3, -4, -5."

		// lld1.removeLast();
		// lld1.printDeque();
		// // Should print "1, 2, 3, 4, 5, 6, -2, -3, -4."

		// lld1.removeFirst();
		// lld1.printDeque();
		// Should print "2, 3, 4, 5, 6, -2, -3, -4."
		
 
		passed = checkEmpty(false, lld1.isEmpty()) && passed;

		printTestStatus(passed);
		// System.out.println(lld1.get(5));
		// System.out.println(lld1.recursiveGet(5));
	}

	public static void main(String[] args) {
		System.out.println("Running tests.\n");
		addIsEmptySizeTest();
		addRemoveTest();
	}
} 