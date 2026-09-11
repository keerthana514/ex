class Missing {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 5};
        int n = 5, sum = 0;

        for (int x : a)
            sum += x;

        int total = n * (n + 1) / 2;

        System.out.println("Missing number = " + (total - sum));
    }
}
