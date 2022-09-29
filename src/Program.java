

public class Program {
    public static void main(String[] args) {
        Person man1 = new Person("Mikle","Ivanov");
        Person man2 = new Person("Ivan","Ivanov");
        Person man3 = new Person("Paul","Ivanov");
        Person man4 = new Person("Victor","Ivanov");
        Person man5 = new Person("Denis","Ivanov");


        Tree gt = new Tree();
         gt.append(man1, man2);
         gt.append(man1, man3);
         gt.append(man1, man4);
         gt.append(man1, man5);
        gt.append(man2, man3);
        gt.append(man2, man4);
        gt.append(man2, man5);


         System.out.println(new Research(gt).spend(man1, Relationship.children));
        System.out.println(new Research(gt).spend(man2, Relationship.parent));
        System.out.println(new Research(gt).spend(man3, Relationship.parent));
    }
}
enum Relationship {
    parent,
    children
}