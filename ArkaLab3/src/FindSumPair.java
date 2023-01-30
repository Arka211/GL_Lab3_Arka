
public class FindSumPair {
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	
	class Node{
		int nodedata;
		Node leftNode;
		Node rightNode;
		Node(int nodedata)
		{
			this.Nodedata = nodeData;
			this.leftNode = null;
			this.rightNode = null;
		}
		
		public Node insert(Node currentLocation, int key)
		{
			if(currentLocation == null)
				return new Node(key);
			if (key < currentLocation.nodeData)
				currentLocation.leftNode  = insert(currentLocation.leftNode, key);
			else
				currentLocation.rightNode = insert(currentLocation.leftNode, key);
				return currentLocation;
		}
		
		public boolean findpairUtil(Node currentLocation, int sum, List<Integer> list)
		
		if(currentLocation == null)
			return false;
		if(findpairUtil(currentLocation.leftNode, sum, list))
			return true;
		if(list.contains(sum-currentLocation.NodeData))
		{
			System.out.println("Pair found (" + (sum-currentLocation.nodeData) + ", " + currentLocation.nodedata +")");
			return true;
		}
		else
			list.add(currentLocation.nodeData);
		return findpairUtil(currentLocation.rightNode, sum, list);
	}
	
	

	public static void main(String[] args)
	{
		Node root = null;
		FindSumPair findSP = new FindSumPair();
		
		root = findSP.insert(root, 40);
		root = findSP.insert(root, 20);
		root = findSP.insert(root, 60);
		root = findSP.insert(root, 10);
		root = findSP.insert(root, 30);
		root = findSP.insert(root, 50);
		root = findSP.insert(root, 70);
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the sum value to find the pair");
		int sum = scan.nextInt();
		List<Interger> list = new ArrayList<>();
		if(!findSP.findpairUtil(root, sum, list))
			System.out.println("Pair does not exist");
		scan.close();
				
}
	
}
