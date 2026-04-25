public class HeartRatesTest {
    public static void main(String[] args) {
        int dia=23,mes=4,ano=2026;
        HeartRates HeartRates = new HeartRates("João", "Henrique", 22, 4, 2002);
        System.out.println("Idade: "+HeartRates.Age(dia, mes, ano));
        int idade = HeartRates.Age(dia, mes, ano);

        System.out.println("Frequencia maxima: "+ HeartRates.Max(idade));
        System.out.printf("Frequencia max ideal: %.2f \n", HeartRates.tMax(idade));
        System.out.printf("Frequencia min ideal: %.2f", HeartRates.tMin(idade));
    }
}