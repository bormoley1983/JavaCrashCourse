import java.util.Random;

public class TrafficAnalyzer {
    public static void main(String[] args) {
        Random random = new Random();
        int[] trafficData = random.ints(100).toArray();

        System.out.println(getMaxTraffic(trafficData));
    }

    public static int getMaxTraffic(int[] traffic){
        int maxTraffic = 0;
        for (int volume : traffic){
            if (volume>0){
                maxTraffic = volume;
            }
        }
        return maxTraffic;
    }
}
