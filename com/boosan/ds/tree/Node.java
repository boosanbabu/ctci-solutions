package com.boosan.ds.tree;

class Node{
	int key;
	Node left,right;
	
	public Node(int data)
	{
		this.key = data;
		left = right = null;
	}
	
	public void setLeft(int data)
	{
		left = new Node(data);
	}
	
	public void setRight(int data)
	{
		right = new Node(data);
	}
}