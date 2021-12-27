package com.bl.linkedlist;

public class MyNode<K> implements INode<K> {
	
	private K key;
	public INode<K> next;
	
	public MyNode(K key) {
		this.key = key;
		next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}

	public void setNext(INode<K> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyNode{key=").append(key).append("}");
		if(next != null) {
			builder.append("->").append(next);
		}
		return builder.toString();
	}

	@Override
	public void setKey() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
