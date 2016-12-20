package com.vuongideas.pathfinding;

public class Edge<T> {
	private double weight;
	private Node<T> node1;
	private Node<T> node2;
	
	public Edge() {
		this(null, null);
	}
	
	public Edge(Node<T> node1, Node<T> node2) {
		this(node1, node2, 1);
	}
	
	public Edge(Node<T> node1, Node<T> node2, double weight) {
		this.node1 = node1;
		this.node2 = node2;
		this.weight = weight;
	}
	
	public Node<T> getOtherNode(Node<T> node) {
		return node == node1 ?  node2 : (node == node2 ? node1 : null);
	}
	
	public boolean contains(Node<T> node) {
		return getOtherNode(node) != null;
	}
	
	// getters and setters
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Node<T> getNode1() {
		return node1;
	}

	public void setNode1(Node<T> node1) {
		this.node1 = node1;
	}

	public Node<T> getNode2() {
		return node2;
	}

	public void setNode2(Node<T> node2) {
		this.node2 = node2;
	}
	
}
