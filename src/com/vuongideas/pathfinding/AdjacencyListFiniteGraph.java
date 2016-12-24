package com.vuongideas.pathfinding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdjacencyListFiniteGraph<T> extends FiniteGraph<T> {
	private int startIndex;
	private int goalIndex;
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
		if (!vertices.contains(v)) {
			vertices.add(v);
		}
	}

	@Override
	public void addVertex(T value) {
		addVertex(new Vertex<T>(value));
		
	}

	@Override
	public void removeVertex(Vertex<T> v) {
		int i = vertices.indexOf(v);
		if (i != -1) {
			vertices.remove(v);
			edges.remove(i);
			

			for (List<Integer> e : edges) {
				// remove edges connected to v
				e.remove(new Integer(i));
				for (int j=0; j < e.size(); j++) {
					if (e.get(j) >= i) {
						e.set(j, e.get(j)-1);
					}
				}
			}		
		}	
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
		vertices.set(i, v);
	}

	@Override
	public Vertex<T> getStart() {
		return vertices.get(startIndex);
	}

	@Override
	public Vertex<T> getGoal() {
		return vertices.get(goalIndex);
	}

	@Override
	public void setStart(Vertex<T> start) {
		int i = vertices.indexOf(start);
		if (i == -1) {
			addVertex(start);
			i = vertices.indexOf(start);
		}
		startIndex = i;
		
	}

	@Override
	public void setGoal(Vertex<T> goal) {
		int i = vertices.indexOf(goal);
		if (i == -1) {
			addVertex(goal);
			i = vertices.indexOf(goal);
		}
		startIndex = i;
				
	}
}
