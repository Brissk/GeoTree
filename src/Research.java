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
}
