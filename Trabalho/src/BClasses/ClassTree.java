package BClasses;

public class ClassTree {
    private ClassNode root;
    
    public ClassTree() {
        this.root = null;
    }
    
    public void insert(ClassStudent student) {
        root = insertRecursive(root, student);
    }
    
    private ClassNode insertRecursive(ClassNode current, ClassStudent student) {
        if (current == null) {
            return new ClassNode(student);
        }
        if (student.getRgm() < current.getData().getRgm()) {
            current.setLeft(insertRecursive(current.getLeft(), student));
        } else if (student.getRgm() > current.getData().getRgm()) {
            current.setRight(insertRecursive(current.getRight(), student));
        }
        
        return current;
    }
    
    public ClassStudent search(int rgm) {
        return searchRecursive(root, rgm);
    }
    
    private ClassStudent searchRecursive(ClassNode current, int rgm) {
        if (current == null) {
            return null;
        }
        
        if (rgm == current.getData().getRgm()) {
            return current.getData();
        }
        
        if (rgm < current.getData().getRgm()) {
            return searchRecursive(current.getLeft(), rgm);
        } else {
            return searchRecursive(current.getRight(), rgm);
        }
    }
    

    public boolean remove(int rgm) {
        if (search(rgm) == null) {
            return false;
        }
        
        root = removeRecursive(root, rgm);
        return true;
    }
    
    private ClassNode removeRecursive(ClassNode current, int rgm) {
        if (current == null) {
            return null;
        }
        

        if (rgm < current.getData().getRgm()) {
            current.setLeft(removeRecursive(current.getLeft(), rgm));
        } else if (rgm > current.getData().getRgm()) {
            current.setRight(removeRecursive(current.getRight(), rgm));
        } else {

            

            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }
            

            if (current.getLeft() == null) {
                return current.getRight();
            }
            if (current.getRight() == null) {
                return current.getLeft();
            }
            

            ClassStudent minValue = findMinValue(current.getRight());
            current.getData().setRgm(minValue.getRgm());
            current.getData().setName(minValue.getName());
            
            current.setRight(removeRecursive(current.getRight(), minValue.getRgm()));
        }
        
        return current;
    }
    
    private ClassStudent findMinValue(ClassNode node) {
        ClassStudent minValue = node.getData();
        while (node.getLeft() != null) {
            minValue = node.getLeft().getData();
            node = node.getLeft();
        }
        return minValue;
    }
    

    public void clear() {
        root = null;
    }
    

    public void showTreeInOrder() {
        if (root == null) {
            System.out.println("Árvore vazia!");
            return;
        }
        
        System.out.println("Conteúdo da árvore (in-order):");
        inOrderTraversal(root);
    }
    
    private void inOrderTraversal(ClassNode node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.println(node.getData());
            inOrderTraversal(node.getRight());
        }
    }
    
    public void showTreePreOrder() {
        if (root == null) {
            System.out.println("Árvore vazia!");
            return;
        }
        
        System.out.println("Conteúdo da árvore (pre-order):");
        preOrderTraversal(root);
    }
    
    private void preOrderTraversal(ClassNode node) {
        if (node != null) {
            System.out.println(node.getData());
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }
    }
    
    public void showTreePostOrder() {
        if (root == null) {
            System.out.println("Árvore vazia!");
            return;
        }
        
        System.out.println("Conteúdo da árvore (post-order):");
        postOrderTraversal(root);
    }
    
    private void postOrderTraversal(ClassNode node) {
        if (node != null) {
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            System.out.println(node.getData());
        }
    }
    
    public void showTree() {
        showTreeInOrder();
    }
}