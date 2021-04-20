//Ethan Yu (not you, me!)

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MorseCodeTreeTest 
{
	MorseCodeTree tree;
	TreeNode<String> root;
	ArrayList<String> list = new ArrayList<String>();
	
	@Before
	public void setUp() throws Exception 
	{
		tree = new MorseCodeTree();
		root = new TreeNode<String>("abc");
		list = tree.toArrayList();
	}
	
	@After
	public void tearDown() throws Exception
	{
		tree = null;
		root = null;
		list = null;
	}
	
	@Test
	public void testGetRoot() 
	{
		assertEquals(tree.getRoot().getData(), "");
		assertEquals(root.getData(), "abc");
	}
	
	@Test
	public void testSetRoot() 
	{
		tree.setRoot(root);
		assertEquals(tree.getRoot().getData(), "abc");
	}
	
	@Test
	public void TestAddNode() 
	{
		tree.addNode(tree.getRoot(), ".--", "lolololol");
		assertEquals(tree.fetch(".--"), "lolololol");
	}
	
	@Test
	public void TestFetchNode() 
	{
		assertEquals(tree.fetchNode(tree.getRoot(), ".--"), "w");
	}
	
	@Test
	public void TestToArrayList() 
	{
		System.out.print(list);
		assertEquals(list.get(5), "u");
		assertEquals(list.get(8), "r");
	}
	
	

}
