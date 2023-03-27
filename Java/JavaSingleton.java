class JavaSingleton {
   public String str;
    private static final JavaSingleton instance = new JavaSingleton();

    private JavaSingleton() {}

    public static JavaSingleton getSingleInstance() {
        return instance;
    }
}
