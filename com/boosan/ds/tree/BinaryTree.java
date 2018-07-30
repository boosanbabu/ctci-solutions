package com.boosan.ds.tree;

public class BinaryTree {
	
	Node root;
	
	public BinaryTree(int d)
	{
		root = new Node(d);
	}
	
	public BinaryTree()
	{
		root = null;
	}
	
	public static void main(String a[])
	{
		BinaryTree bt = new BinaryTree(1);
		bt.root.left = new Node(3);
		bt.root.left.left = new Node(2);
		bt.root.left.left.left = new Node(4);
		bt.root.left.left.left = new Node(7);

		bt.root.right = new Node(5);
		bt.root.right.right = new Node(6);
		bt.root.right.right.right = new Node(-5);
		bt.root.right.right.right.right = new Node(-15);
		
		bt.inOrder(bt.root);
	}
	
	public void inOrder(Node n)
	{
		if(n==null)
			return;
		inOrder(n.left);
		System.out.println(n.key);
		inOrder(n.right);
	}

}
