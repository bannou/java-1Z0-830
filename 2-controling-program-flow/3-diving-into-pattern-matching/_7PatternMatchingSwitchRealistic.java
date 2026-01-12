public class _7PatternMatchingSwitchRealistic {

    sealed interface Item {}

    record Book(String title, double price) implements Item { }
    record Electronics(String name, double price) implements Item { }
    record Shoes(String size, double price) implements Item { }

    public static double computeDiscount(Item item) {
        return switch (item) {

//            case Shoes shoes -> {
//                if(shoes.size().equals("S")) {
//                    yield 0.5 * shoes.price();
//                } else {
//                    yield 0.4 * shoes.price();
//                }
//            }

//  a cleaner way to the above
            case Shoes shoes when shoes.size().equals("S")          -> 0.5 * shoes.price();
            case Shoes shoes                                        -> 0.4 * shoes.price();
            case Book book                                          -> 0.3 * book.price();
            case Electronics electronics                            -> 0.2 * electronics.price();
            case null, default                                      -> 0;
        };
    }


    public static void main(String[] args) {
        var discount = computeDiscount(new Shoes("S", 10));
        var discount2 = computeDiscount(new Shoes("M", 10));

        System.out.println(discount);
        System.out.println(discount2);
    }
}
