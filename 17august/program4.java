class program4{

    public static void main(String[] args) {
        System.out.println("Program started");

        main(10);
        main(10, 20);
    }

    public static void main(int x) {
        System.out.println(x);
    }

    public static void main(int x, int y) {
        System.out.println(x + y);
    }
}
