public class HealthProfileTest {
    public static void main(String[] args) {
        int dia=23, mes=4, ano=2026;
        HealthProfile HealthProfile = new HealthProfile("João", "Henrique", 14, 8, 2003, 1.80, 75, "Masculino");
        System.out.println(HealthProfile.Age(dia, mes, ano));
        int idade = HealthProfile.Age(dia, mes, ano);

        System.out.println("Frequencia cardiaca maxima: "+ HealthProfile.Max(idade));
        System.out.println("Frequencia maxima ideal: "+ HealthProfile.tMax(idade));
        System.out.println("Frequencia minima ideal: "+ HealthProfile.tMin(idade));
        System.out.printf("Imc: %.2f \n", HealthProfile.Imc());
    }
}