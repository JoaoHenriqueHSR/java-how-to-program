public class HeartRates {
    private String name;
    private String surname;
    private int day;
    private int month;
    private int year;

    public HeartRates(String name, String surname, int day, int month, int year){
        this.name=name;
        this.surname = surname;
        this.day=day;
        this.month=month;
        this.year=year;
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

}
