package com.vuongideas.pathfinding;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class World {
	private int maxX;
	private int maxY;
	private Point beginning;
	private Point destination;
	private List<Point> obstacles;
	
	public World() {
		this(100, 100);
	}
	
	public World(int x, int y) {
		this(x, y, null, null);
	}
	
	public World(int x, int y, Point beginning, Point destination) {
		obstacles = new ArrayList<Point>();
		maxX = x;
		maxY = y;
		this.beginning = beginning;
		this.destination = destination;
	}
	
	public Graph<Point> constructGraph() {
		FiniteGraph<Point> graph = new AdjacencyListFiniteGraph<Point>((maxX)*(maxY)-obstacles.size());
		for (int x=1; x<=maxX; x++) {
			for (int y=1; y<maxY; y++) {
				Point p = new Point(x, y);
				if (!obstacles.contains(p)) {
					graph.addVertex(p);	
				}
			}
		}
		return graph;
	}
	
	// getters and setters

	public int getMaxX() {
		return maxX;
	}

	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}

	public int getMaxY() {
		return maxY;
	}

	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}

	public Point getBeginning() {
		return beginning;
	}

	public void setBeginning(Point beginning) {
		this.beginning = beginning;
	}

	public Point getDestination() {
		return destination;
	}

	public void setDestination(Point destination) {
		this.destination = destination;
	}

	public List<Point> getObstacles() {
		return obstacles;
	}

	public void setObstacles(List<Point> obstacles) {
		this.obstacles = obstacles;
	}
	
	
}
