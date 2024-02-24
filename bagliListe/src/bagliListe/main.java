package bagliListe;


public class main {

	public static void main(String[] args) {
		/*
		LinkedList list = new LinkedList();
		Node dugum = new Node(15);
		list.root = dugum;
		
		Node yeniDugum = new Node(30);
		list.root.next = yeniDugum;
		
		
		Node biyeniDugumDaha = new Node(50);
		list.root.next.next = biyeniDugumDaha;
		
		biyeniDugumDaha = new Node(70);
		list.root.next.next.next = biyeniDugumDaha;
		
		
		LinkedList list=new LinkedList();
		insert(list,25);
		insert(list,15);
		insert(list,20);
		insert(list,30);
		print(list);
		*/
		
		LinkedList list=new LinkedList();
		orderlyInsert(list, 10);
		orderlyInsert(list, 15);
		orderlyInsert(list, 12);
		orderlyInsert(list, 8);
		orderlyInsert(list, 50);
		orderlyInsert(list, 45);
		print(list);
		
		System.out.println();
		delete(list, 12);
		
		System.out.println();
		print(list);
		
		System.out.println();
		delete(list, 8);
		
		System.out.println();
		print(list);
		
		System.out.println();
		delete(list, 145);
		
		System.out.println();
		print(list);
		
		
	}
	
	static void print(LinkedList list) {
		Node iter = list.root;
		while(iter!=null) {
			System.out.println(iter.data);
			iter = iter.next;
		}
		
	}

	static LinkedList insert(LinkedList list, int data) {
		Node dugum = new Node(data);
		// liste boşsa
		if(list.root == null) {
			list.root = dugum;
		}else {
			Node iter = list.root;
			while(iter.next != null) {
				iter = iter.next;
			}
			iter.next = dugum;
		}
		
		return list;
	}
	static LinkedList orderlyInsert(LinkedList list, int data) {
		Node dugum = new Node(data);
		//liste boşsa
		if(list.root == null) {
			list.root = dugum;
		}
		//eklenecek eleman root'tan küçükse
		if(dugum.data < list.root.data){
			dugum.next = list.root;
			list.root = dugum;
		}else {
			Node iter = list.root;
			while(iter.next != null && iter.next.data < dugum.data) {
				iter = iter.next;
			}
			Node temp = iter.next;
			iter.next = dugum;
			dugum.next = temp;
		}
		
		return list;
	}

	static LinkedList addFirst(LinkedList list, int data) {
		Node temp = new Node(data);
		
		// liste boşsa
		if(list.root == null) {
			list.root = temp;
		}else {
			temp.next = list.root;
			list.root = temp;
		}
		
		return list;
	}
	
	static LinkedList delete(LinkedList list, int deleteData) {
		//eleman root'ta ise
		if(list.root!=null && list.root.data == deleteData) {
			list.root = list.root.next;
		}else {
			Node iter = list.root;
			//listede bir yerde ise
			while(iter.next != null && iter.next.data != deleteData) {
				iter = iter.next;
			}
			
			if(iter.next == null) {
				System.out.println("Silinecek eleman bulunamadı!");
			}else {
				iter.next = iter.next.next;
			}
		}
		return list;
	}
	
	static LinkedList addWithIndex(int index, int data, LinkedList list) throws ArrayIndexOutOfBoundsException{
		try {
			if(index == 0)
				addFirst(list, data);
			else {
				Node temp = new Node(data);
				int count = 0;
				Node iter = list.root;
				while(count < index - 1) {
					iter = iter.next;
					count++;
				}
				temp.next = iter.next;
				iter.next = temp;
			}
				
			return list;
		} catch(NullPointerException e){
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
}
