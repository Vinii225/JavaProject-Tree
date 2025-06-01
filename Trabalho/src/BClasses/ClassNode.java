package BClasses;

public class ClassNode {
    private ClassStudent data;
    private ClassNode right;
    private ClassNode left;

    public ClassNode(ClassStudent data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }



    public ClassStudent getData() {
        return data;
    }

    public ClassNode getRight() {
        return right;
    }

    public ClassNode getLeft() {
        return left;
    }


    
    public void setRight(ClassNode right) {
        this.right = right;
    }

    public void setLeft(ClassNode left) {
        this.left = left;
    }
}