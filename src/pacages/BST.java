package pacages;

public class BST {
    Node root;

    // Constructor
    BST() {
        root = null;
    }
    public Node search(Node root, Cars car)
    {
        // Base Cases: root is null or key is present at root
        if (root==null || root.data.getMake().equals(car.getMake()))
        {
            if(root.data.getModel().equals(car.getModel()))
            {
                if(root.data.getYear() == car.getYear())
                {
                    if(root.data.getMileage() == car.getMileage())
                    {
                        if(root.data.getPrice() == car.getPrice())
                        {
                            return root;
                        }
                    }
                }
            }
        }

        // val is greater than root's key
        if (root.data.getPrice() > car.getPrice())
            return search(root.prev, car);

        // val is less than root's key
        return search(root.next, car);
    }

    Node insert(Node root, Cars car) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(car, null, null);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (car.getPrice() < root.data.getPrice())
            root.prev = insert(root.prev, car);
        else if (car.getPrice() > root.data.getPrice())
            root.next = insert(root.next, car);

        /* return the (unchanged) node pointer */
        return root;
    }
}

