class Wdata {
    int month;  //フィールド=データ
    int day;
    String sky;
}

class Weather {
    public static void main(String[] args) {
        Wdata today = new Wdata();  //インスタンス化
        today.month = 10;
        today.day = 2;
        today.sky = "晴れ";
        System.out.println(today.month + "月" + today.day + "日" + today.sky);
    }
}
