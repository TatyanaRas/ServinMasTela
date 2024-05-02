//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiServise servise = new BmiServise();

        double heightMetr = 1.87;
        double weightKg = 98;
        // double bodyMasIndex;
        // int i = (int) bodyMasIndex;
        int bodyMasIndex = servise.calculate(heightMetr, weightKg);
        System.out.println(bodyMasIndex);
    }
}