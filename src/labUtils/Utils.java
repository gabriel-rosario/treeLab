package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		t.addRoot(4);
		Position<Integer> nine = t.addChild(t.root(), 9);
		t.addChild(nine, 7);
		t.addChild(nine,10);
		Position<Integer> twenty = t.addChild(t.root(), 20);
		Position<Integer> twentyL = t.addChild(twenty, 15);
		Position<Integer> twentyR = t.addChild(twenty, 21);
		Position<Integer> fifteenL = t.addChild(twentyL, 12);
		Position<Integer> fifteenR = t.addChild(twentyL, 17);
		t.addChild(fifteenR, 19);
		Position<Integer> fourty = t.addChild(twentyR, 40);
		t.addChild(fourty, 30);
		t.addChild(fourty, 45);


		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		t.addRoot(4);
		Position<Integer> root = t.root();
		Position<Integer> rL = t.addLeft(t.root(), 9);
		t.addLeft(rL, 7);
		t.addRight(rL, 10);
		Position<Integer> rR = t.addRight(t.root(), 20);
		Position<Integer> tL = t.addLeft(rR, 15);
		t.addLeft(tL, 12);
		t.addLeft(t.addRight(tL, 17), 19);
		Position<Integer> tR = t.addRight(rR, 21);
		Position<Integer> t1L = t.addLeft(tR, 40);
		t.addLeft(t1L, 30);
		t.addRight(t1L, 45);
		
		
		return t; 
	}


}
