import java.util.*;

public class Research {
    ArrayList<Node> tree;

    public Research(Tree geoTree) {

        tree = geoTree.getTree();
    }

    public ArrayList<Person> spend(Person p, Relationship re) {
        ArrayList<Person> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.p2.getName() == p.getName() && t.re == re) {
                result.add(t.p1);
            }
        }
        return result;
    }
    public ArrayList<String> spendAll(Person p) {
        ArrayList<String> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.p2.getName() == p.getName() && t.re == Relationship.PARENT) {
                result.add("Parent: " + t.p1);
            }
            if (t.p2.getName() == p.getName() && t.re == Relationship.CHILDREN) {
                result.add("Children: " + t.p1);
            }
            if (t.p2.getName() == p.getName() && t.re == Relationship.GRANDPARENT) {
                result.add("Grandparent: " + t.p1);
            }
            if (t.p2.getName() == p.getName() && t.re == Relationship.GRANDCHILDREN) {
                result.add("Great children: " + t.p1);
            }
            if (t.p2.getName() == p.getName() && t.re == Relationship.UNCLEorAUNT) {
                result.add("Uncles (Aunts): " + t.p1);
            }
            if (t.p2.getName() == p.getName() && t.re == Relationship.NEPHEW) {
                result.add("Nephews: " + t.p1);
            }
        }
        return result;
    }
}
