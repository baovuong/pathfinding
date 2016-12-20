package com.vuongideas.pathfinding;

public class Node<T> {
	private boolean start;
	private boolean goal;
	private T value;
	
	public Node() {
		this(null);
	}
	
	public Node(T value) {
		this.value = value;
		start = false;
		goal = false;
	}
	
	
	// getters and setters
	public boolean isStart() {
		return start;
	}
	public void setStart(boolean start) {
		this.start = start;
	}
	public boolean isGoal() {
		return goal;
	}
	public void setGoal(boolean goal) {
		this.goal = goal;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}

}
