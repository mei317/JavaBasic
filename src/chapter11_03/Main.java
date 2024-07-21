package chapter11_03;

public class Main {

    public static void main(String[] args) {
        Transferable[] parts = {
            new Switch(),
            new Router()
        };

        for (Transferable work : parts) {
            work.transfer();
        }
    }

}
