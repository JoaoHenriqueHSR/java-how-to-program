public class HealthProfile {
    private String name;
    private String surname;
    private int day;
    private int month;
    private int year;
    private double height;
    private double kg;
    private String sex;

    public HealthProfile(String name, String surname, int day, int month, int year, double height, double kg, String sex){
        this.name=name;
        this.surname = surname;
        this.day=day;
        this.month=month;
        this.year=year;
        this.height=height;
        this.kg=kg;
        this.sex=sex;
    }

    public int Age(int day, int month, int year){
        int age=year-this.year;

        if(month>=this.month){
            if(day>=this.day){
                return age;
            }else{
                return age-=1;
            }
        }
        return age-=1;
    }

    public int Max(int age){
        return 220 - age;
    }

    public double tMax(int age){
        int max=Max(age);
        return max * 0.8;
    }

    public double tMin(int age){
        int max=Max(age);
        return max * 0.5;
    }

    public double Imc(){
        return kg/(height*height);
    }
}
