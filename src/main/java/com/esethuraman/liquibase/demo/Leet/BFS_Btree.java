package com.esethuraman.liquibase.demo.Leet;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS_Btree {


    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<Integer> queue = new LinkedList<>();
        if(root != null){
            ((LinkedList<Integer>) queue).add(root.val);
        }

        while(!queue.isEmpty()){

        }
        return null;
    }


}

class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val = val;
    }
}
