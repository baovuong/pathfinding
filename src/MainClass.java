import java.awt.Point;
import java.util.List;

import com.vuongideas.pathfinding.World;
import com.vuongideas.pathfinding.algorithm.BreadthFirstSearchAlgorithm;
import com.vuongideas.pathfinding.algorithm.GreedySearchAlgorithm;
import com.vuongideas.pathfinding.algorithm.Heuristic;
import com.vuongideas.pathfinding.graph.Graph;
import com.vuongideas.pathfinding.graph.Vertex;

public class MainClass {
	public static void main(String[] args) {

		World world = new World(100, 100, new Point(1,2), new Point(90,9));
		world.getObstacles().add(new Point(50,50));
		world.getObstacles().add(new Point(89,8));
		Graph<Point> graph = world.constructGraph();

		long beginTime = System.nanoTime();		
		//List<Vertex<Point>> solution = graph.solve(new BreadthFirstSearchAlgorithm<Point>());
		
		List<Vertex<Point>> solution = graph.solve(new GreedySearchAlgorithm<Point>(new Heuristic<Point>() {

			@Override
			public double perform(Graph<Point> graph, Vertex<Point> current) {
				// TODO Auto-generated method stub
				Point start = current.getValue();
				Point goal = graph.getGoal().getValue();
				return start.distance(goal);
			}
		}));
		
		long endTime = System.nanoTime();
		System.out.println("solution:");
		for (Vertex<Point> step : solution) {
			System.out.printf("(%d, %d)\n", step.getValue().x, step.getValue().y);
		}
		System.out.printf("elapsed time: %f ms\n", (endTime-beginTime)/1000000.0);
		System.out.println("done");
	}
}
