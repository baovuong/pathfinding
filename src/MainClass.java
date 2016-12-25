import java.awt.Point;
import java.util.List;

import com.vuongideas.pathfinding.World;
import com.vuongideas.pathfinding.graph.Graph;
import com.vuongideas.pathfinding.graph.Vertex;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World world = new World(10, 10, new Point(1,2), new Point(9,9));
		Graph<Point> graph = world.constructGraph();
		Vertex<Point> start = graph.getStart();
		System.out.printf("start: (%d, %d)\n", start.getValue().x, start.getValue().y);
		List<Vertex<Point>> neighbors = graph.neighbors(start);
		System.out.println("neighbors");
		for (Vertex<Point> neighbor : neighbors) {
			System.out.printf("(%d, %d)\n", neighbor.getValue().x, neighbor.getValue().y);
		}		
		System.out.println("done");
	}
}
