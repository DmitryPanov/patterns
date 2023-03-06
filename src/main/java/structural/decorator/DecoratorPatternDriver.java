package structural.decorator;

public class DecoratorPatternDriver {

    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        christmasTree = new BubbleLights(christmasTree);
        System.out.println(christmasTree.decorate());
        // christmas tree with just one Garland
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        System.out.println(tree1.decorate());

        // christmas tree with two Garlands and one Bubble lights
        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        System.out.println(tree2.decorate());

    }

}