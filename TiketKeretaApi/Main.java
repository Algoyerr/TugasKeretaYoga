public class Main {

    public static void main(String[] args) {

        TiketEkonomi ekonomi = new TiketEkonomi(
                "2221",
                "Yoga",
                "Bandung",
                100000,
                "26 April",
                "17.00 WIB",
                "089543526154",
                "321100403982"
        );

        TiketBisnis bisnis = new TiketBisnis(
                "2421",
                "Putri",
                "Jakarta",
                150000,
                "26 April",
                "17.00 WIB",
                "0895435221",
                "32110040000"
        );

        ekonomi.cetakInfo();

        System.out.println("----------------------");

        bisnis.cetakInfo();
    }
}