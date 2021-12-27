package com.bl.linkedlist;

public class LinkedListDemo {
	public static void main(String[] args) {
		INode<Integer> myFirstNode = new MyNode<Integer>(56);
		INode<Integer> mySecondNode = new MyNode<Integer>(30);
		INode<Integer> myThirdNode = new MyNode<Integer>(70);
		
		MyLinkedList<Integer> intLinkedList = new MyLinkedList<>();
		
		intLinkedList.add(myFirstNode);
		intLinkedList.add(mySecondNode);
		intLinkedList.add(myThirdNode);
		
		intLinkedList.printMyNode();
		System.out.println("Size of LinkedList :" +intLinkedList.size());
		
		INode<Integer> myFourthNode = new MyNode<Integer>(40);
		System.out.println("Insert" + intLinkedList.insert(30, myFourthNode));
		
		intLinkedList.printMyNode();
		System.out.println("Size of LinkedList :"+intLinkedList.size());
		
		System.out.println("Remove" + intLinkedList.remove(40));
		intLinkedList.printMyNode();
		System.out.println("Size of LinkedList :"+ intLinkedList.size());
		

	}
	public void popFromLinkedList(MyLinkedList<Integer> intLinkedList) {
		INode<Integer> poppedNode = intLinkedList.pop();
		
		System.out.println("Node" + poppedNode +" is popped out from the linked list");
		intLinkedList.printMyNode();
	}
	public void popLastFromLinkedList(MyLinkedList<Integer> intLinkedList) {
		INode<Integer> lastNode = intLinkedList.popLast();
		
		System.out.println("Last Node" + lastNode +"has been removed");
		 
		intLinkedList.printMyNode();
	}

}
