class ClassC extends ClassB {
    private int param;
    protected String str;
    public static final int i = 11;

    @Deprecated
    private int f1(Object p, int x) throws NullPointerException {
        if (p == null)
            throw new NullPointerException();
        return x;
    }

    @InfoAnnotation(name = "sum", type = "int")
    public int sum(int a, int b) {
        return a + b;
    }

    @InfoAnnotation(name = "f2", type = "void")
    public void f2() {
        System.out.println("f2");
    }

    public void StrPlusI(String str) {
        System.out.println(i + str);
    }
}
