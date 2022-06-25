/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Administrator
 */
public class MyBST {
    public TreeNode mRoot;
    
    public MyBST(){
        
    }
    public TreeNode insert(TreeNode rootNode,int value){
        if (rootNode == null){
            return new TreeNode(value);
        }
        if(value < rootNode.val){
            if(rootNode.left == null){
                rootNode.left = new TreeNode(value);
            }
            else{
                insert(rootNode.left,value);
            }
            
        }
        else{
            if(rootNode.right == null){
                rootNode.right = new TreeNode(value);
            }
            else{
                insert(rootNode.right,value);
            }
            
        }
        return rootNode;
    }
    public TreeNode findLeftModeNode(TreeNode root){
        if(root == null){
            return root;
        }
        TreeNode leftMostNode = root; 
        while(leftMostNode.left != null){
            leftMostNode = leftMostNode.left;
        }
        return leftMostNode;
    }
    
    
    
    public TreeNode deleteNode(TreeNode root, int key){
        if (root == null){
            return null;
        }
        if(key < root.val){
           root.left =  deleteNode(root.left,key);
        }
        else if( key > root.val){
            root.right = deleteNode(root.right,key);
           
        }
        else {
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left != null && root.right == null){
                return root.left;
            }
            if(root.left == null && root.right != null){
                return root.right;
            }
            TreeNode leftModeNode = findLeftModeNode(root.right);
            root.val = leftModeNode.val;
            root.right = deleteNode(root.right,leftModeNode.val);
        }   
        return root;
    }
    public static TreeNode searchBST(TreeNode root, int key){
         if(root == null){
             return null;
         }
         if(key <root.val){
             return searchBST(root.left,key);
         }
         if(key >root.val){
             return searchBST(root.right,key);
         }
         else{
             return root;
         }
        
        
    }
    public  String PreOder(TreeNode currentNode,String p){
        if( currentNode == null){
            return"";
        }
        p = p+currentNode.val+" ";
        
        p=p+PreOder(currentNode.left,p);
        p=p+PreOder(currentNode.right,p);
        return p;
    }
    public  String InOder(TreeNode currentNode,String p){
        if( currentNode == null){
            return"";
        }
        
        
        p=p+InOder(currentNode.left,p);
        p=p+currentNode.val+" ";
        p=p+InOder(currentNode.right,p);
        return p;
    }
//    public  void PostOder(TreeNode currentNode){
//        if( currentNode == null){
//            return ;
//        }
//        
//        
//        PostOder(currentNode.left);
//        
//        PostOder(currentNode.right);
//        
//        
//        System.out.println(currentNode.val+" ");
//        
//    }
    public  String PostOder(TreeNode currentNode,String p){
        if( currentNode == null){
            return "";
        }
        else{
        
        p = p+PostOder(currentNode.left,p);
        
        p = p+PostOder(currentNode.right,p);
        
        
        p= p + currentNode.val+" ";
        }
        return p;
    }
    
    
    
}
