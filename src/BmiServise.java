public class BmiServise {
    public int calculate(double heightMetr, double weightKg) {

        double bodyMasIndex = weightKg / (heightMetr * heightMetr);
        //int result = (int) index;
        return (int) bodyMasIndex;
    }

}
