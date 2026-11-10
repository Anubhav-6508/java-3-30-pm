class Q1 {
    static int x = 10;
    int y = 20;

    Q1() {
        x++;
        y++;
    }

    public static void main(String[] args) {
        Q1 a = new Q1();
        Q1 b = new Q1();

        a.x = a.x + 5;
        a.y = a.y + 5;

        System.out.println(a.x + " " + a.y);
        System.out.println(b.x + " " + b.y);
    }
}
