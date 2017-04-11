package cs61b.Trees;

public class SibTreeNode {
	Object item;
	SibTreeNode parent;
	SibTreeNode firstChild;
	SibTreeNode nextSibling;
	
	//Each node visited/preorder()'d only once
	//linearTime
	
	/* HOW THE ALGORITHM RUNS
	 *          1
	 *      2        6
	 *  3   4   5    7   8
	 */
	
	public void preorder(){
		this.visit();
		if(firstChild != null){
			firstChild.preorder();
		}
		if(nextSibling != null){
			nextSibling.preorder();
		}
	}
	
	/* HOW THE ALGORITHM RUNS
	 *        8
	 *    4        7
	 *  1 2 3     5  6
	 */
	
	public void postorder(){
		if(firstChild != null){
			firstChild.postorder();
		}
		this.visit(); //this is the only thing that moved
		if(nextSibling != null){
			nextSibling.postorder();
		}
	}
	
	public void visit(){
		System.out.println(item.toString());
	}
}
