package com.bl.linkedlist;

public interface INode <K>{
	K getKey();
	void setKey();
	
	INode<K> getNext();
	void setNext (INode<K> next);

}
