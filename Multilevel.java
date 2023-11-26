public class Multilevel {
    public static void main(String[] args) {
        State st = new State("Asia", "India", "Maharashtra");
        System.out.println("\n");
        System.out.println("The Place is as Follow");
        System.out.println("\n");
        st.Display2();
    }
}

class Continent {
    String ContinentName;

    Continent(String ContinentName) {
        this.ContinentName = ContinentName;
    }

    void Display() {
        System.out.println("Name Of the Continent is " + ContinentName);
    }
}

class Country extends Continent {
    String CountryName;

    Country(String ContinentName, String CountryName) {
        super(ContinentName);
        this.CountryName = CountryName;
    }

    void Display1() {
        Display();
        System.out.println("Name of the Country is " + CountryName);
    }
}

class State extends Country {
    String StateName;

    State(String ContinentName, String CountryName, String StateName) {
        super(ContinentName, CountryName);
        this.StateName = StateName;
    }

    void Display2() {
        Display1();
        System.out.println("Name of the State is " + StateName);

    }
}
