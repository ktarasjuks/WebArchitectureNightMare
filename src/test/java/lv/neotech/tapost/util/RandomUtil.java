package lv.neotech.tapost.util;


import java.util.concurrent.ThreadLocalRandom;

public class RandomUtil {

    public static int getRandomNumberInRange(int upperLimit) {
        return ThreadLocalRandom.current().nextInt(0, upperLimit);
    }
}
