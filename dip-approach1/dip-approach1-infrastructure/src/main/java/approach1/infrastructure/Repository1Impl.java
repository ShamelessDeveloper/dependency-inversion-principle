package approach1.infrastructure;

import org.springframework.stereotype.Repository;

@Repository
public class Repository1Impl implements approach1.infrastructure.Repository1 {
    @Override
    public void remove(int id) {
        System.out.println("  _____                           _               ______       _   _ _         \n" +
                " |  __ \\                         (_)             |  ____|     | | (_) |        \n" +
                " | |__) |___ _ __ ___   _____   ___ _ __   __ _  | |__   _ __ | |_ _| |_ _   _ \n" +
                " |  _  // _ \\ '_ ` _ \\ / _ \\ \\ / / | '_ \\ / _` | |  __| | '_ \\| __| | __| | | |\n" +
                " | | \\ \\  __/ | | | | | (_) \\ V /| | | | | (_| | | |____| | | | |_| | |_| |_| |\n" +
                " |_|  \\_\\___|_| |_| |_|\\___/ \\_/ |_|_| |_|\\__, | |______|_| |_|\\__|_|\\__|\\__, |\n" +
                "                                           __/ |                          __/ |\n" +
                "                                          |___/                          |___/ ");
    }
}
