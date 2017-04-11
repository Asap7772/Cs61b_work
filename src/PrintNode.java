
public class PrintNode {
	static void Print(Node head) {
        while(true){
            if(head != null){
                if(head.item != null){
                    System.out.println(head.item);
                }
                head = head.next;
            }else{
                break;
            }
        }
    }
	public static void main(String args[]){
		Node head = new Node(new Integer(0));
		Node previ = head;
		for(int i = 0; i < 20; i++){
			Node node = new Node(new Integer(i+1));
			previ.next = node;
			previ = node;
		}
		Print(head);
	}
}
