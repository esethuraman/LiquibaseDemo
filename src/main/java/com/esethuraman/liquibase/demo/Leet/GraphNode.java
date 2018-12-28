package com.esethuraman.liquibase.demo.Leet;

import java.util.LinkedList;
import java.util.List;

public class GraphNode {
    int val;
    List<GraphNode> neighbors = new LinkedList<>();

    GraphNode(int val){
        this.val = val;
    }
}
