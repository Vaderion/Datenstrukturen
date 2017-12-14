public class TreeNode {

	int elem;
	TreeNode left;
	TreeNode right;
		
public TreeNode (int i){
	elem = i;
	left = right = null;
}

public TreeNode getLeft(){
	return left;
}

public TreeNode getRight(){
	return right;
}

public int getElement(){
	return elem;
}

public void setLeft (TreeNode n){
	left = n;
}

public void setRight (TreeNode i){
	right = i;
}

public void setElement (int e){
	elem = e;
}


}
