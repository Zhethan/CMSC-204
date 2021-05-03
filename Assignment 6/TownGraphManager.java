//Ethan Yu (not you, me!)

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TownGraphManager implements TownGraphManagerInterface{
	
	private Graph graph = new Graph();

	//adds a road
	@Override
	public boolean addRoad(String town1, String town2, int weight, String roadName) {
		Town t1 = new Town(town1);
		Town t2 = new Town(town2);
		
		if (graph.addEdge(t1, t2, weight, roadName) != null)
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
	//gets an existing road
	@Override
	public String getRoad(String town1, String town2) {
		Town t1 = new Town(town1);
		Town t2 = new Town(town2);
		return graph.getEdge(t1,t2).getName();
	}

	//adds a town
	@Override
	public boolean addTown(String v) {
		return graph.addVertex(new Town(v));
	}

	//gets an existing town
	@Override
	public Town getTown(String name) {
		for (Town x: graph.vertices) 
		{
			if (x.name.equals(name)) 
			{
				return x;
			}
		}
		return null;
	}

	//checks if the graph contains the town
	@Override
	public boolean containsTown(String v) {
		return graph.containsVertex(new Town(v));
	}

	//checks if the graph contains the road connection between town1 and town2 
	@Override
	public boolean containsRoadConnection(String town1, String town2) {
		Town t1 = new Town(town1);
		Town t2 = new Town(town2);
		return graph.containsEdge(t1, t2);
	}

	//returns an arraylist of the roads sorted by name
	@Override
	public ArrayList<String> allRoads() {
		return graph.edgeSet().stream().map(Road::getName).sorted().collect(Collectors.toCollection(ArrayList::new));
	}

	//deletes the road connection between town1 and town2 
	@Override
	public boolean deleteRoadConnection(String town1, String town2, String road) 
	{
		Town t1 = new Town(town1);
		Town t2 = new Town(town2);
		
		if(graph.removeEdge(t1, t2, 0, road) != null) 
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
	//deletes a town
	@Override
	public boolean deleteTown(String v) 
	{
		return graph.removeVertex(new Town(v));
	}

	//returns an arraylist of the towns sorted by name
	@Override
	public ArrayList<String> allTowns() 
	{
		return graph.vertexSet().stream().map(Town::getName).sorted().collect(Collectors.toCollection(ArrayList::new));
	}

	//gets the shortest path between town1 and town2
	@Override
	public ArrayList<String> getPath(String town1, String town2) 
	{
		Town t1 = new Town(town1);
		Town t2 = new Town(town2);
		return graph.shortestPath(t1, t2);
	}

}
