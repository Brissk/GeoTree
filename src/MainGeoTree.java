

public class MainGeoTree {
    public static void main(String[] args) {
        Person man1 = new Person("Mikle", "Ivanov");
        Person man2 = new Person("Ivan", "Ivanov");
        Person man3 = new Person("Paul", "Ivanov");
        Person man4 = new Person("Victor", "Ivanov");
        Person man5 = new Person("Denis", "Ivanov");
        Person man6 = new Person("Kirill", "Ivanov");


        Tree gt = new Tree();
        gt.appendParentChildren(man1, man2);
        gt.appendParentChildren(man2, man3);
        gt.appendGrandParentChildren(man1, man4);
        gt.appendGrandParentChildren(man2, man5);
        gt.appendGrandParentChildren(man3, man5);
        gt.appendGrandParentChildren(man6, man2);
        gt.appendUncleAuntNephew(man6, man2);
        gt.appendUncleAuntNephew(man3, man1);
        gt.appendUncleAuntNephew(man2, man5);


        System.out.println(new Research(gt).spendAll(man2)); // Узнать ВСЮ родню конкретного человека
        System.out.println(new Research(gt).spend(man2, Relationship.CHILDREN)); // Узнать, сколько у человека указанных родных(детей в данном случае)

    }
}
