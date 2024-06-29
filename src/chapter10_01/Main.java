package chapter10_01;

public class Main {
    public static void main(String[] args) {
        Employee taro = new Employee();
        taro.name = "タロウ";

        Manager hanako = new Manager();
        hanako.name = "ハナコ";

        //①taroの持つoperationメソッドを呼び出します。
        taro.Operation();
        //②hanakoの持つoperationメソッドを呼び出します。
        hanako.Operation();
        //③hanakoの持つmanagementメソッドを呼び出します。
        hanako.management();
    }
}