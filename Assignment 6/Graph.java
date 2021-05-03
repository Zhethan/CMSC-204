//Ethan Yu (not you, me!)

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;


public class Graph implements GraphInterface<Town, Road>
{
	public Set<Town> vertices = new HashSet<>();
	public Set<Road> edges = new HashSet<>();
	public ArrayList<String> shortest = new ArrayList<>();
	public Town town;
	
	//gets the existing road
	@Override
	public Road getEdge(Town sourceVertex, Town destinationVertex) {
		if (sourceVertex == null || destinationVertex == null) 
		{
			return null;
		}else
		{
			for (Road x: edges) 
			{
				if (x.contains(sourceVertex) && x.contains(destinationVertex)) 
				{
					return x;
				}
			}
		}
		return null;
		
	}

	//adds a road
	@Override
	public Road addEdge(Town sourceVertex, Town destinationVertex, int weight, String description) {
		if (!containsVertex(sourceVertex) || !containsVertex(destinationVertex)) 
		{
			throw new IllegalArgumentException("Unvalid");
		}
		if(sourceVertex == null || destinationVertex == null) {
			throw new NullPointerException("Unvalid");
		}
		
		Road newRoad = new Road(sourceVertex,destinationVertex,weight,description);
		edges.add(newRoad);
		return newRoad;
	}

	//adds a town
	@Override
	public boolean addVertex(Town v) throws NullPointerException{
		if (v == null) 
		{
			throw new NullPointerException("Unvalid");
		}
		if (!(vertices.contains(v)))
		{
			vertices.add(v);
			return true;
		}
		return false;
		
	}

	//checks if it contains the road
	@Override
	public boolean containsEdge(Town sourceVertex, Town destinationVertex) {
		for (Road x: edges) 
		{
			if (x.contains(sourceVertex) && x.contains(destinationVertex)) 
			{
				return true;
			}
		}
		return false;
	}

	//checks if it contains the town
	@Override
	public boolean containsVertex(Town v) {		
		for (Town x: vertices) 
		{
			if (x.equals(v)) 
			{
				return true;
			}
		}
		return false;
	}

	//returns a set of the roads
	@Override
	public Set<Road> edgeSet() {
		return edges;
	}

	//returns a set of the roads connected to a certain vertex
	@Override
	public Set<Road> edgesOf(Town vertex) {
		if(vertex == null) {
			throw new NullPointerException("Unvalid");
		}
		
		Set<Road> output = new HashSet<>();
		for (Road x: edges) 
		{
			if (x.contains(vertex)) 
			{
				output.add(x);
			}
		}
		
		if (output.isEmpty()) 
		{
			throw new IllegalArgumentException("Unvalid");
		}
		return output;
	}

	//removes a road
	@Override
	public Road removeEdge(Town sourceVertex, Town destinationVertex, int weight, String description) {
		
		Road output = null;
		for (Road x: edges) 
		{
			if (x.contains(sourceVertex) && x.contains(destinationVertex)) 
			{
				output = x;
			}
		}
		if(edges.remove(output))
			return output;
		return null;
	}

	//removes a town
	@Override
	public boolean removeVertex(Town v) {
		if (v == null) 
		{
			return false;
		}
		
		for (Town x: vertices) 
		{
			if (x.name.equals(v.name)) 
			{
				return true;
			}
		}
		return false;

	}

	//returns a set of the towns
	@Override
	public Set<Town> vertexSet() {
		return vertices;
	}

	//finds the shortest path from the sourceVertex to the destinationVertex (ideally)
	@Override
	public ArrayList<String> shortestPath(Town sourceVertex, Town destinationVertex) {
		ArrayList<Road> shortestPath = new ArrayList<>();
		addEdge(sourceVertex, destinationVertex, 0, null);
		shortestPath.add(null);
		return null;
	}

	//dijkstra's shortest path method (ideally)
	@Override
	public void dijkstraShortestPath(Town sourceVertex) 
	{
		ArrayList<Town> vertex = new ArrayList<>(vertices);
		int[][]adjacencyMatrix = new int[vertices.size()][vertices.size()];
	}
	
}
