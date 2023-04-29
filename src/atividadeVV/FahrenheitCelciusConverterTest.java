package atividadeVV;

public class FahrenheitCelciusConverterTest {
    public static double toC(double f) {
        if (f < -459.67) {
            throw new IllegalArgumentException("Temperaturas abaixo de zero são inválidas!");
        }
        return (f - 32) * 5 / 9;
    }

    public static double toF(double c) {
        if (c < -273.15) {
            throw new IllegalArgumentException("Temperaturas abaixo de zero são inválidas!");
        }
        return c * 9 / 5 + 32;
    }
}
