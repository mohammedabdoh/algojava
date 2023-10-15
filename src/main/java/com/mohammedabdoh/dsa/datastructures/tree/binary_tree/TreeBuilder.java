package com.mohammedabdoh.dsa.datastructures.tree.binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBuilder {
    public static Node build(String str) {
        if(str.isEmpty() || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");

        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        int i = 1;
        while(queue.size() > 0 && i < ip.length) {
            Node currentNode = queue.peek();
            queue.remove();

            String currVal = ip[i];

            if(!currVal.equals("N")) {
                currentNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currentNode.left);
            }
            i++;

            if(i >= ip.length) {
                break;
            }

            currVal = ip[i];

            if (!currVal.equals("N")) {
                currentNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currentNode.right);
            }
            i++;
        }

        return root;
    }
}
