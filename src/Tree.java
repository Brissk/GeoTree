import java.util.*;

public class Tree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {

        return tree;
    }

    public void appendParentChildren(Person p1, Person p2) {
        tree.add(new Node(p1, Relationship.PARENT, p2));
        tree.add(new Node(p2, Relationship.CHILDREN, p1));
    }
    public void appendGrandParentChildren(Person p1, Person p2) {
        tree.add(new Node(p1, Relationship.GRANDPARENT, p2));
        tree.add(new Node(p2, Relationship.GRANDCHILDREN, p1));
    }
    public void appendUncleAuntNephew(Person p1, Person p2) {
        tree.add(new Node(p1, Relationship.UNCLEorAUNT, p2));
        tree.add(new Node(p2, Relationship.NEPHEW, p1));
    }
}
