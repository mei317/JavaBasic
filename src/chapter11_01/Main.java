package chapter11_01;

public class Main {
    public static void main(String[] args) {
        Item[] items = {
            new weapon("鉄の剣",20),
            new Armor("皮の服",10)
        };
        for (Item item : items) {
            item.use();
        }
    }
}
