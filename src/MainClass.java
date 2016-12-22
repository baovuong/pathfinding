import com.vuongideas.pathfinding.AdjacencyListFiniteGraph;
import com.vuongideas.pathfinding.FiniteGraph;
import com.vuongideas.pathfinding.Vertex;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiniteGraph<Integer> graph = new AdjacencyListFiniteGraph<Integer>(4);
		Vertex<Integer> v1 = new Vertex<Integer>(3);
		Vertex<Integer> v2 = new Vertex<Integer>(5);
		Vertex<Integer> v3 = new Vertex<Integer>(7);
		Vertex<Integer> v4 = new Vertex<Integer>(9);
		graph.setVertex(0, v1);
		graph.setVertex(1, v2);
		graph.setVertex(2, v3);
		graph.setVertex(5, v4);
		System.out.println("done");
	}
}
