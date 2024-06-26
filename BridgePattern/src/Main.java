public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("Hello, MyUniverse."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
        d4.randomDisplay(5);

        CountDisplay d = new CountDisplay(new FileDisplayImpl("/Users/ikjuncho/Library/Mobile Documents/com~apple~CloudDocs/Computer/GitHub/DesignPattern/BridgePattern/src/star.txt"));
        d.multiDisplay(3);
    }
}