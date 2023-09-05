package sort;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Melon[] melons = new Melon[]{};

        Arrays.sort(melons, new Comparator<Melon>() {
            @Override
            public int compare(Melon melon, Melon t1) {
                return Integer.compare(melon.getWeight(), t1.getWeight());
            }
        });

        Arrays.sort(melons, Comparator.comparingInt(Melon::getWeight));

        Comparator<Melon> bType = Comparator.comparing(Melon::getType);
        Comparator<Melon> dType = Comparator.comparing(Melon::getType).reversed();
    }
}
