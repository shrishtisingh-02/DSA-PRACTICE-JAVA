class Solution {

    public Node cloneLinkedList(Node head) {

        // Step 1: Deep copy
        Node temp1 = head;

        Node head2 = new Node(-1);
        Node temp2 = head2;

        while (temp1 != null) {

            Node t = new Node(temp1.data);

            temp2.next = t;
            temp2 = temp2.next;

            temp1 = temp1.next;
        }

        Node b = head2.next;

        // Step 2: Create mapping
        HashMap<Node, Node> map = new HashMap<>();

        Node tempA = head;
        Node tempB = b;

        map.put(null, null);

        while (tempA != null) {

            map.put(tempA, tempB);

            tempA = tempA.next;
            tempB = tempB.next;
        }

        // Step 3: Connect random pointers
        tempA = head;

        while (tempA != null) {

            tempB = map.get(tempA);

            tempB.random = map.get(tempA.random);

            tempA = tempA.next;
        }

        return b;
    }
}