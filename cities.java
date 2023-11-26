import java.util.*;

class cities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] cities = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter city name " + (i + 1) + ": ");
            cities[i] = sc.nextLine();
        }
        Arrays.sort(cities);

        System.out.println("Cities sorted in ascending order:");
        for (String city : cities) {
            System.out.println(city);
        }

        sc.close();
    }
}