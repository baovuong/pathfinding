package com.vuongideas.pathfinding;

import java.util.ArrayList;
import java.util.List;

public class Graph<T> {

	private List<Edge<T>> edges;
	private List<Node<T>> nodes;
	
	public Graph() {
		edges = new ArrayList<Edge<T>>();
		nodes = new ArrayList<Node<T>>();
	}
	
	public List<Node<T>> getNeighbors(Node<T> node) {
		List<Node<T>> result = new ArrayList<Node<T>>();
		for (Edge<T> edge : edges) {
			Node<T> other = edge.getOtherNode(node);
			if (other != null) {
				result.add(other);
			}
		}
		return result;
	}
	
	
	
	// getters and setters
	public List<Edge<T>> getEdges() {
		return edges;
	}
	public void setEdges(List<Edge<T>> edges) {
		this.edges = edges;
	}
	public List<Node<T>> getNodes() {
		return nodes;
	}
	public void setNodes(List<Node<T>> nodes) {
		this.nodes = nodes;
	}
}
