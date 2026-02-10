package org.example.dsa.linkedlist;

public class Main {

    public static void testReverseBetween() {
        LinkedList myLinkedList;

        // Test 1: Empty list
        System.out.println("Test 1: Empty List");
        myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.reverseBetween(0, 0);
        System.out.println("List: (empty)");
        System.out.println("Expected: empty");
        myLinkedList.printList();
        System.out.println();

        // Test 2: Single node list
        System.out.println("Test 2: Single Node");
        myLinkedList = new LinkedList(10);
        myLinkedList.reverseBetween(0, 0);
        System.out.println("List: 10");
        System.out.println("Expected: 10");
        myLinkedList.printList();
        System.out.println();

        // Test 3: Reverse sublist in middle (1 -> 2 -> 3 -> 4 -> 5; reverse 1..3)
        System.out.println("Test 3: Reverse Sublist in Middle");
        myLinkedList = new LinkedList(1);
        for (int i = 2; i <= 5; i++) myLinkedList.append(i);
        myLinkedList.reverseBetween(1, 3);  // Reverse nodes 2,3,4
        System.out.println("Original: 1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Expected: 1 -> 4 -> 3 -> 2 -> 5");
        myLinkedList.printList();
        System.out.println();

        // Test 4: Reverse from head (reverse 0..2)
        System.out.println("Test 4: Reverse From Head");
        myLinkedList = new LinkedList(1);
        for (int i = 2; i <= 5; i++) myLinkedList.append(i);
        myLinkedList.reverseBetween(0, 2);  // Reverse nodes 1,2,3
        System.out.println("Original: 1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Expected: 3 -> 2 -> 1 -> 4 -> 5");
        myLinkedList.printList();
        System.out.println();

        // Test 5: Reverse to tail (reverse 2..4)
        System.out.println("Test 5: Reverse To Tail");
        myLinkedList = new LinkedList(1);
        for (int i = 2; i <= 5; i++) myLinkedList.append(i);
        myLinkedList.reverseBetween(2, 4);  // Reverse nodes 3,4,5
        System.out.println("Original: 1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Expected: 1 -> 2 -> 5 -> 4 -> 3");
        myLinkedList.printList();
        System.out.println();

        // Test 6: Reverse entire list (0..4)
        System.out.println("Test 6: Reverse Entire List");
        myLinkedList = new LinkedList(1);
        for (int i = 2; i <= 5; i++) myLinkedList.append(i);
        myLinkedList.reverseBetween(0, 4);
        System.out.println("Original: 1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Expected: 5 -> 4 -> 3 -> 2 -> 1");
        myLinkedList.printList();
        System.out.println();

        // Test 7: startIndex == endIndex (no change)
        System.out.println("Test 7: No Change (start == end)");
        myLinkedList = new LinkedList(1);
        for (int i = 2; i <= 5; i++) myLinkedList.append(i);
        myLinkedList.reverseBetween(2, 2);
        System.out.println("Original: 1 -> 2 -> 3 -> 4 -> 5");
        System.out.println("Expected: 1 -> 2 -> 3 -> 4 -> 5");
        myLinkedList.printList();
        System.out.println();

    }

    public static void testRemoveDuplicates() {
        LinkedList myLinkedList;

        // Test 1: Empty list
        System.out.println("Test 1: Empty List");
        myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.removeDuplicates();
        System.out.println("Expected: List is empty");
        myLinkedList.printList();
        System.out.println();

        // Test 2: Single node (no duplicates)
        System.out.println("Test 2: Single Node");
        myLinkedList = new LinkedList(10);
        myLinkedList.removeDuplicates();
        System.out.println("Expected: 10");
        myLinkedList.printList();
        System.out.println();

        // Test 3: Multi-node (no duplicates)
        System.out.println("Test 3: No Duplicates");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.removeDuplicates();
        System.out.println("Expected: 1 -> 2 -> 3");
        myLinkedList.printList();
        System.out.println();

        // Test 4: Duplicates in the middle
        System.out.println("Test 4: Duplicates in Middle");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.removeDuplicates();
        System.out.println("Expected: 1 -> 2 -> 3");
        myLinkedList.printList();
        System.out.println();

        // Test 5: All elements are duplicates
        System.out.println("Test 5: All Duplicates");
        myLinkedList = new LinkedList(5);
        myLinkedList.append(5);
        myLinkedList.append(5);
        myLinkedList.append(5);
        myLinkedList.removeDuplicates();
        System.out.println("Expected: 5");
        myLinkedList.printList();
        System.out.println();

        // Test 6: Duplicates at start and end
        System.out.println("Test 6: Duplicates at Start/End");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.removeDuplicates();
        System.out.println("Expected: 1 -> 2 -> 3");
        myLinkedList.printList();
        System.out.println();

        // Test 7: Mixed duplicates throughout
        System.out.println("Test 7: Mixed Duplicates");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(1);
        myLinkedList.append(3);
        myLinkedList.append(2);
        myLinkedList.append(4);
        myLinkedList.removeDuplicates();
        System.out.println("Expected: 1 -> 2 -> 3 -> 4");
        myLinkedList.printList();
        System.out.println();

        /*
            UPDATED EXPECTED OUTPUT:
            -------------------------
            Test 1: Empty List
            Expected: List is empty
            List is empty

            Test 2: Single Node
            Expected: 10
            10

            Test 3: No Duplicates
            Expected: 1 -> 2 -> 3
            1 -> 2 -> 3

            Test 4: Duplicates in Middle
            Expected: 1 -> 2 -> 3
            1 -> 2 -> 3

            Test 5: All Duplicates
            Expected: 5
            5

            Test 6: Duplicates at Start/End
            Expected: 1 -> 2 -> 3
            1 -> 2 -> 3

            Test 7: Mixed Duplicates
            Expected: 1 -> 2 -> 3 -> 4
            1 -> 2 -> 3 -> 4
        */
    }

    static void main(String[] args) {
        testSwapPairs();
    }

    public static void testSwapPairs() {
        LinkedList myLinkedList;

        // Test 1: Empty list
        System.out.println("Test 1: Empty List");
        myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.swapPairs();
        System.out.println("Expected: empty");
        myLinkedList.printList();
        System.out.println();

        // Test 2: Single node (no swap)
        System.out.println("Test 2: Single Node");
        myLinkedList = new LinkedList(10);
        myLinkedList.swapPairs();
        System.out.println("Expected: 10");
        myLinkedList.printList();
        System.out.println();

        // Test 3: Two nodes (swap them)
        System.out.println("Test 3: Two Nodes");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.swapPairs();
        System.out.println("Expected: 2 -> 1");
        myLinkedList.printList();
        System.out.println();

        // Test 4: Odd number of nodes (3 nodes)
        System.out.println("Test 4: Odd Length List");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.swapPairs();
        System.out.println("Expected: 2 -> 1 -> 3");
        myLinkedList.printList();
        System.out.println();

        // Test 5: Even number of nodes (4 nodes)
        System.out.println("Test 5: Even Length List");
        myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.swapPairs();
        System.out.println("Expected: 2 -> 1 -> 4 -> 3");
        myLinkedList.printList();
        System.out.println();

        // Test 6: Longer list (6 nodes)
        System.out.println("Test 6: Longer List (6 Nodes)");
        myLinkedList = new LinkedList(1);
        for (int i = 2; i <= 6; i++) myLinkedList.append(i);
        myLinkedList.swapPairs();
        System.out.println("Expected: 2 -> 1 -> 4 -> 3 -> 6 -> 5");
        myLinkedList.printList();
        System.out.println();

    }

}


