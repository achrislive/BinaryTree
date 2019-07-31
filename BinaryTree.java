public class BinaryTree {

    static int root = 0;
    static String[] array = new String[10];

    /**Method to initialize the root*/
    public void InitializeRoot(String value){
        array[0] = value;
    }

    /** Method to insert value to the left child of the node*/
    public void LeftChild(String value, int root){

        int position = (root*2)+1;

        // Check if the parent node exists
        if (array[root] == null){
            System.out.println("There\'s no parent node of where you want to insert value");
        }

        else {
            array[position] = value;
        }

    }


    /** Method to insert value to the right child of the node*/
    public void RightChild(String value, int root){

        int position = (root*2)+2;

        // Check if the parent node exists
        if (array[root] == null){
            System.out.println("There\'s no parent node of where you want to insert value");
        }

        else {
            array[position] = value;
        }

    }

    /** Method to print the whole tree*/
    public void ShowTree(){
        for (int i=0; i<array.length; i++){
            if (i % 2 == 0){
                if (array[i]!= null) {
                    System.out.print(array[i] + "\n");
                }
            }

            else {
                System.out.print(array[i] + " - - ");
            }

        }
    }


    /** Method to find data in the tree
     * By providing the value and root
     */

    public boolean FindValue(String value, int Root){

        if (array[root] == null){
            System.out.println("There\'s no such parent node in the tree");
            return false;
        }

        else{
            int LeftPosition = (Root*2)+1;
            int RightPosition = (Root*2)+2;

            if (array[LeftPosition].equals(value)){
                System.out.println(value + " found on the left child of "+ array[Root]);
                return true;
            }

            else if (array[RightPosition].equals(value)){
                System.out.println(value + " found on the right child of "+ array[Root]);
                return true;
            }

            else {
                System.out.println(value + " can\'t be found on root "+ array[Root]);
                return false;
            }
        }

    }

    /** Method to delete a node from the tree
     * 1. If the node doesn't have children, just replace it with null
     * 2. If the node has only 1 child, replace the deleted node with the child
     */
    public void DeleteValue(int Root){

        // Check if the root exists
        if (array[Root] == null){
            System.out.println("The root node doesn\'t exist in the tree");
            return;
        }

        int LeftPosition = (Root*2)+1;
        int RightPosition = (Root*2)+2;

        // Check if the node doesn't have any child and delete it
        if (array[LeftPosition] == null && array[RightPosition] == null){
            array[Root] = null;
        }

        // Check if the node has only one child on the left
        else if (array[LeftPosition] != null && array[RightPosition]== null){
            array[Root] = array[LeftPosition];
            array[LeftPosition] = null;
        }

        // Check if the node has only one child on the right
        else if (array[LeftPosition] == null && array[RightPosition]!= null){
            array[Root] = array[RightPosition];
            array[RightPosition] = null;
        }

    }



    /** Main */
    public static void main(String[] args) {

        // Creating the binary tree object
        BinaryTree test = new BinaryTree();

        // Set root
        test.InitializeRoot("0");

        // Inserting the left child and the right child for root 0
        test.LeftChild("1", 0);
        test.RightChild("2", 0);

        // Inserting the left child and the right child for root 1
        test.LeftChild("3", 1);
        test.RightChild("4", 1);

        // Finding if the value 2 is in the tree
        test.FindValue("2", 0);

        // Deleting the value 4 in the tree
//        test.DeleteValue(4);

        // Showing the tree
//        test.ShowTree();




    }

}
