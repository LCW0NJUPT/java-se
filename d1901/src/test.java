package src;

public class test {
    public static void main(String[] args) {
        Holder<String> h1 = new Holder<>();
        h1.setValue("abc");
        String s1 = h1.getValue();

        Holder<Integer> h2 = new Holder<>();
        h2.setValue(452);
        Integer i1= h2.getValue();

        Holder h3 = new Holder();
        h3.setValue(3.2323);
        h3.setValue("sss");



    }
}
