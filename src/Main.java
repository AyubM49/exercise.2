public class Main {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wenesday", "Thrusday", "Friday"};
        int dayWeather[] = {45,29,10,22,41,28,33};
        int predection[] = {95,60,25,5,0,75,90};
        for (int i = 0; i < dayWeather.length; i++) {
            if(dayWeather[i]<=32 && predection[i]>=50 ){
                System.out.println("On" + days [i] + "It will be" +dayWeather[i] + "It will be" +predection[i] + "a Chance of");
            }
        }
    }
}