package com.wiesen.structure_type.composite;

import java.util.ListIterator;
import java.util.Vector;

/**
 * Created by wiesen on 16-7-19.
 */
public class TreeNode {
    private String mName;

    private Vector<TreeNode> mChildTreeNode = new Vector<>();

    public TreeNode(String name) {
        this.mName = name;
    }

    public String getName(){
        return mName;
    }

    public void add(TreeNode treeNode){
        mChildTreeNode.add(treeNode);
    }

    public void remove(TreeNode treeNode){
        mChildTreeNode.remove(treeNode);
    }

    public TreeNode getChild(int i){
        return mChildTreeNode.get(i);
    }

    public ListIterator<TreeNode> getChildList(){
        return mChildTreeNode.listIterator();
    }
}
