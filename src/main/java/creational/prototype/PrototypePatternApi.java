package creational.prototype;

public class PrototypePatternApi {
    public static void main(String[] args) {
        Position position = new Position(10, 10);
        Tree tree = new PlasticTree(26.4, 12);
        tree.setPosition(position);
        System.out.println(tree);
        Tree tree1 = tree.copy();
        System.out.println(tree1);
        System.out.println("===============================");
        tree1.setPosition(new Position(20,25));
        System.out.println(tree);
        System.out.println(tree1);

    }
}
