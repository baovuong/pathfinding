package com.vuongideas.pathfinding;

import java.util.List;

public interface Graph<T> {
	public boolean adjacent(Vertex<T> v1, Vertex<T> v2);
	public List<Vertex<T>> neighbors(Vertex<T> v);
	public void addVertex(Vertex<T> v);
	public void addVertex(T value);
	public void removeVertex(Vertex<T> v);
	public void addEdge(Vertex<T> v1, Vertex<T> v2);
	public void removeEdge(Vertex<T> v1, Vertex<T> v2);
}
