/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
       HashMap <Node,Node> hm = new HashMap<>();
      public Node cloneGraph(Node node) {
      if(node == null) return null;
      if(hm.containsKey(node))
          return hm.get(node);//if already visted return copy
        Node curr = new Node(node.val); //make copy
        hm.put(node,curr); //link copy to original 
        for(Node next: node.neighbors) //DFS cloning
            curr.neighbors.add(cloneGraph(next));
        return curr;
        
    }
}