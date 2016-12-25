package com.vuongideas.pathfinding.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import com.vuongideas.pathfinding.graph.Graph;
import com.vuongideas.pathfinding.graph.Vertex;

public class BreadthFirstSearchAlgorithm<T> implements SearchAlgorithm<T> {

	@Override
	public List<Vertex<T>> search(Graph<T> graph) {
		List<Vertex<T>> path = new LinkedList<Vertex<T>>();
		Queue<Vertex<T>> fringe = new LinkedList<Vertex<T>>();
		Vertex<T> root = graph.getStart();
		Vertex<T> current;
		List<Vertex<T>> discovered = new ArrayList<Vertex<T>>();
		Map<Vertex<T>, Vertex<T>> parent = new HashMap<Vertex<T>, Vertex<T>>();
		fringe.add(root);
		while (!fringe.isEmpty()) {
			current = fringe.remove();
			if (!discovered.contains(current)) {
				discovered.add(current);
				for (Vertex<T> neighbor : graph.neighbors(current)) {
					fringe.add(neighbor);
					parent.put(neighbor, current);
					
				}
			}
		}
		return path;
	}

}
