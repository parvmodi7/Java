package Tress;
import java.util.*;

public class traversel {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
  static class Binarytree{
    static int idx = -1;
    public static Node buildTree(int nodes[])
    {
        idx++;
        if(nodes[idx]==-1)
        {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;
    }
  }

//   PreOrder traversel ---> Root Left Right 

  public static void preOrder(Node root)
  {
    if(root==null)
    {
        return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
  }

//  InOrder traversel ---> Left Root Right

public static void InOrder(Node root)
{
    if(root == null)
    {
        return;
    }
    InOrder(root.left);
    System.out.print(root.data + " ");
    InOrder(root.right);
}

// PostOrder traversel ---> Left Right Root 

public static void PostOrder(Node root)
{
    if(root == null)
    {
        return ;
    }
    PostOrder(root.left);
    PostOrder(root.right);
    System.out.print(root.data + " ");
}



//  Level Order traversel 

public static void levelOrder(Node root)
{
  if(root == null){
    return ;
  }

  Queue<Node> q=new LinkedList<>();
  q.add(root);
  q.add(null);
  while(!q.isEmpty())
  {
     Node curr=q.remove();
     if(curr==null)
     {
        System.out.println();
        if(q.isEmpty())
        {
            break;
        }
        else
        {
            q.add(null);
        }
     }
     else
     {
        System.out.print(curr.data + " ");
        if(curr.left!=null)
        {
            q.add(curr.left);
        }
        if(curr.right!=null)
        {
            q.add(curr.right);
        }
     }
  }

}


//  Count of Nodes

public static int CountOfNodes(Node root)
{
    if(root == null)
    {
        return 0;
    }
    return 1 + CountOfNodes(root.left) + CountOfNodes(root.right);
}

//  Sum of Nodes 

public static int SumOfNodes(Node root)
{
    if(root == null)
    {
        return 0 ;
    }
    return root.data+ SumOfNodes(root.left) + SumOfNodes(root.right);
}

//  Height of a Tree

public static int Height(Node root)
{
    if(root == null)
    {
        return 0;
    }
    int h1 = Height(root.left);
    int h2 = Height(root.right);
    int maxh=Math.max(h1,h2)+1;
    return maxh;
}
  public static void main(String args[])
  {
    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    Binarytree tree=new Binarytree();
    Node root=tree.buildTree(nodes);
    // System.out.println(root.data);
    // preOrder(root);
    // InOrder(root);
    // PostOrder(root);
    // levelOrder(root);
    System.out.println(Height(root));

  }
}
