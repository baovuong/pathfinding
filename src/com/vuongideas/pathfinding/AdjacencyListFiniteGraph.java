package com.vuongideas.pathfinding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdjacencyListFiniteGraph<T> extends FiniteGraph<T> {

	private List<Vertex<T>> vertices;
	private List<List<Integer>> edges;
	
	public AdjacencyListFiniteGraph(int size) {
		super(size);
		vertices = new ArrayList<Vertex<T>>(size);
		edges = new ArrayList<List<Integer>>(size);
	}
	
	@Override
	public boolean adjacent(Vertex<T> v1, Vertex<T> v2) {
		// search for v1
		int i1 = vertices.indexOf(v1);
		int i2 = vertices.indexOf(v2);
		if (i1 != -1) {
			return edges.get(i1).contains(i2);
		}
		return false;
	}

	@Override
	public List<Vertex<T>> neighbors(Vertex<T> v) {
		List<Vertex<T>> result = new ArrayList<Vertex<T>>();
		int i = vertices.indexOf(v);
		if (i != -1) {
			for (int e : edges.get(i)) {
				result.add(vertices.get(e));
			}
		}
		return result;
	}

	@Override
	public void addVertex(Vertex<T> v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addVertex(T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVertex(Vertex<T> v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEdge(Vertex<T> v1, Vertex<T> v2) {
		int i1 = vertices.indexOf(v1);
		int i2 = vertices.indexOf(v2);
		if (i1 != -1 && i2 != -1) {
			if (edges.get(i1) == null) {
				edges.set(i1, new LinkedList<Integer>());
			}
			edges.get(i1).add(i2);
		}
	}

	@Override
	public void removeEdge(Vertex<T> v1, Vertex<T> v2) {
		int i1 = vertices.indexOf(v1);
		int i2 = vertices.indexOf(v2);
		if (i1 != -1 && i2 != -1 && edges.get(i1) != null) {
			edges.get(i1).remove(new Integer(i2));
		}		
	}

	@Override
	public void setVertex(int i, Vertex<T> v) {
		// TODO Auto-generated method stub
		
	}
}
