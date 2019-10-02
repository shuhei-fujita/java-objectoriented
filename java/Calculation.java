//異なるオブジェクトのメソッドの呼び出し
class Calc {
    int add(int a, int b) {
        return a + b;
    }
}

class Calculation {
    public static void main() {
        Calc calc = new Calc();
        System.out.println(calc.add(3, 9));
    }
}
