public class Main {
    public static void main(String[] args) {
        //Naming conventions for variables : PascalNamingConvention for classes / camelNamingConvention = for methods(functions in classes)
        byte myAge = 30;
        long viewsCount = 3_123_456_789L;
        //By default, Java considers any number as an Integer hence we need to add l/L at the end of it
        short height = 5_5;
        int money = 6_96_96_969;
        // use underscore as comma's in order to read well
        double emo = 129.99;
        float price = 69.99f;
        // every decimal is considered as double type hence add f/F
        char letter = 'A';
        boolean isEligible = false;
        System.out.println(myAge);
        System.out.println(viewsCount);
        System.out.println(height);
        System.out.println(emo);
        System.out.println(price);
        System.out.println(letter);
        System.out.println(isEligible);
    }

}