package com.company;

public final class linkedlist
{
    private static class Node
    {
        String name;
        Node next;
    }

    public static void main(String[] args)
    {
        Node top = null;

        //singly linked list does not exist.

        top = new Node();
        top.name = "A";
        top.next = null;
        dump("Case 1", top);

        // singly linked list exists and the node must be inserted before the first node.

        Node temp;
        temp = new Node();
        temp.name = "B";
        temp.next = top;
        top = temp;
        dump("Case 2", top);

        //singly linked list exists and the node must be inserted after the last node.

        temp = new Node();
        temp.name = "C";
        temp.next = null;
        Node temp2;
        temp2 = top;
        while (temp2.next != null)
            temp2 = temp2.next;
        temp2.next = temp;
        dump("Case 3", top);

        // Singly linked list exists and the node must be inserted between two nodes.

        temp = new Node();
        temp.name = "D";
        temp2 = top;
        while (temp2.name.equals("A") == false)
            temp2 = temp2.next;
        temp.next = temp2.next;
        temp2.next = temp;
        dump("Case 4", top);

        // Delete the first node.

        top = top.next;
        dump("After first node deletion", top);

        // 5.1 Restore node B.

        temp = new Node();
        temp.name = "B";
        temp.next = top;
        top = temp;

        //Delete any node but the first node.

        temp = top;
        while (temp.name.equals("A") == false)
            temp = temp.next;
        temp.next = temp.next.next;
        dump("After D node deletion", top);
    }

    private static void dump(String msg, Node topNode)
    {
        System.out.print(msg + " ");
        while (topNode != null)
        {
            System.out.print(topNode.name + " ");
            topNode = topNode.next;
        }
        System.out.println();
    }
}
