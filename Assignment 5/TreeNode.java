//Ethan Yu (not you, me!)

public class TreeNode<T> {
    protected T data;
    protected TreeNode<T> left;
    protected TreeNode<T> right;
    
	public TreeNode(T data) 
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public TreeNode(TreeNode<T> node) 
	{
		this.data = node.data;
		this.left = node.left;
		this.right = node.right;
	}
	
	public TreeNode() {
		this.left = null;
		this.right = null;
	}

	public T getData() 
	{
		return this.data;
	}
}
