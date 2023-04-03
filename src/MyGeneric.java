public class MyGeneric<T> {
    private T e;

    public MyGeneric() {
    }

    public MyGeneric(T e) {
        this.e = e;
    }

    public void setE(T e) {
        this.e = e;
    }

    public T getE() {
        return e;
    }

    public static void main(String[] args) {
        MyGeneric<String> strObj=new MyGeneric<>("Hi");
        MyGeneric<Integer> intObj=new MyGeneric<>(22);

        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}
