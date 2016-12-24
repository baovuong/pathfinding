import java.awt.Point;

import com.vuongideas.pathfinding.AdjacencyListFiniteGraph;
import com.vuongideas.pathfinding.FiniteGraph;
import com.vuongideas.pathfinding.Graph;
import com.vuongideas.pathfinding.Vertex;
import com.vuongideas.pathfinding.World;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World world = new World(10, 10, new Point(1,2), new Point(9,9));
		Graph<Point> graph = world.constructGraph();
		System.out.println("done");
	}
}
