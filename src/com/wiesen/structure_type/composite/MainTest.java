package com.wiesen.structure_type.composite;

import java.util.ListIterator;

/**
 * Created by wiesen on 16-7-19.
 */
public class MainTest {

    public static void main(String[] args){
        TreeNode root = new TreeNode("root");

        TreeNode childA = new TreeNode("childA");
        TreeNode childB = new TreeNode("childB");

        childA.add(childB);

        root.add(childA);

        ListIterator<TreeNode> childList = root.getChildList();
        element(childList);

    }

    private static void element(ListIterator<TreeNode> treeNodeListIterator){
        while (treeNodeListIterator.hasNext()){
            TreeNode c = treeNodeListIterator.next();
            System.out.println(c.getName());
            element(c.getChildList());
        }
    }
}
