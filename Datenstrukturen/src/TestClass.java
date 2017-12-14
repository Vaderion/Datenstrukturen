public class TestClass {

	public static void main(String[] args) {
	
		TreeNode root = new TreeNode(6);
	
		insert(5, root);
		insert(4, root);
		insert(2, root);
		
		preOrder(root);
		
	}
	
	
	public static void preOrder(TreeNode root){
		
		System.out.println(root.getElement()+" ");
		if(root.getLeft()!=null){
			preOrder(root.getLeft());
		}
		else{
			if(root.getRight()!=null){
			insert(v, root.getRight());
			}
			else{System.out.print("EOF");
			}
		}
		
	}

	
	public static void insert(int v, TreeNode root){
		
		if(v<root.getElement()){
			if(root.getRight()==null){
				root.setRight(new TreeNode(v));}
			else{insert(v, root.getRight());}
		}
		else{
			if(root.getLeft()==null){
				root.setLeft(new TreeNode(v));}
			else{insert(v, root.getLeft());}
		}

	}
	
	
}
