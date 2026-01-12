public class _6PracticeQuestions {

    class Animal {}
    class Dog extends Animal {}
    class Cat extends Animal {}

    void question1() {
        System.out.println("Question 1");
        Animal pet = new Cat();

        if (pet instanceof Dog d)
            System.out.println("Dog");
        else if (pet instanceof Cat)
            System.out.println("Cat");
        else
            System.out.println("Animal");
    }

    String getType(Object obj) {
        System.out.println("Question 2");

        if (obj instanceof Number n && n != null)
            return "Num";

        // cannot use the || operator
//        if (obj instanceof String c && !c.isEmpty() || c != null)
//            return "String";

        return "Unknown";
    }

    public static void main(String[] args) {

        // null and incompatible types
        new _62PracticeQuestions().question1();

        new _62PracticeQuestions().getType(null);

        System.out.println("Question 3");
        Object obj = "Hello";

        if (obj instanceof String s)
            System.out.println("Length: " + s.length());

//        else if (obj instanceof Integer)
//            System.out.println("Value: " + i * 2);  // 'i' not created

//        System.out.println(s.toUpperCase());  // out of scope

    }
}
