package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float in1 = 5000;
        float expected1 = (float) 83.333336;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("5000 rubles are 83.333336. Test result : " + passed1);

        float dollar = Converter.rubleToDollar(5000);
        System.out.println("5000 rubles are " + dollar + " dollars.");

        float in2 = 7352;
        float expected2 = (float) 105.02857;
        float out2 = Converter.rubleToEuro(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("7352 rubles are 105.02857. Test result : " + passed2);

        float euro2 = Converter.rubleToEuro(7352);
        System.out.println("7352 rubles are " + euro2 + " euro.");
    }

}