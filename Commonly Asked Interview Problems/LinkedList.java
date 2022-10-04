package FlatterningaLInkedLis;

public class LinkedList {
    static class Node{
        int data;
        Node down,right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.down=null;
        }
    }

    Node head;

    Node merge(Node a, Node b) {
        if (a == null) { //if the first list is empty then second is the answer
            return b;
        }
        if (b == null) { //if the second list is empty the first is the answer
            return a;
        }
        Node result;  //compare the data members of the two list and put the larger one in result

        if (a.data < b.data) {
            result = a;
            result.down = merge(a.down, b);
        } else {
            result = b;
            result.down = merge(a, b.down);
        }
        result.right = null;
        return result;
    }

        Node flatten(Node root)
        {
//            base case
            if (root == null || root.right == null) {
                return root;
            }
            // recur for list on right
            root.right = flatten(root.right);

            // now merge
            root = merge(root, root.right);

            // return the root
            // it will be in turn merged with its left
            return root;
        }

    Node push(Node head_ref, int data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(data);

        /* 3. Make next of new Node as head */
        new_node.down = head_ref;

        /* 4. Move the head to point to new Node */
        head_ref = new_node;

        /*5. return to link it back */
        return head_ref;
    }

    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.down;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        L.head=L.push(L.head,30);
        L.head=L.push(L.head,8);
        L.head=L.push(L.head,7);
        L.head = L.push(L.head, 5);

        L.head.right = L.push(L.head.right, 20);
        L.head.right = L.push(L.head.right, 10);

        L.head.right.right = L.push(L.head.right.right, 50);
        L.head.right.right = L.push(L.head.right.right, 22);
        L.head.right.right = L.push(L.head.right.right, 19);

        L.head.right.right.right
                = L.push(L.head.right.right.right, 45);
        L.head.right.right.right
                = L.push(L.head.right.right.right, 40);
        L.head.right.right.right
                = L.push(L.head.right.right.right, 35);
        L.head.right.right.right
                = L.push(L.head.right.right.right, 20);

        // Function call
        L.head = L.flatten(L.head);

        L.printList();
    }
    }


