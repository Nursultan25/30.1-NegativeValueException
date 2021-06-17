package kg.megacom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int res1 = 0;
        try {
            res1 = cilinderVolume(3, 11);
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }

        int res2 = 0;
        try {
            res2 = cilinderVolume(-6, 11);
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }

        int res3 = 0;
        try {
            res3 = cilinderVolume(11, 11);
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }

        int res4 = 0;
        try {
            res4 = cilinderVolume(-5, 11);
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }

        int res5 = 0;
        try {
            res5 = cilinderVolume(22, 11);
        } catch (NegativeValueException e) {
            e.printStackTrace();
        }

        Collections.addAll(list, res1, res2, res3, res4, res5);

        System.out.println(list);
    }

    public static int cilinderVolume(int radius, int height) throws NegativeValueException {
        if (radius <= 0) {
            throw new NegativeValueException("radius(" + radius + ") less than 0");
        } else if (height <= 0) {
            throw new NegativeValueException("height(" + height + ") less than 0");
        } else if (radius <= 0 && height <= 0) {
            throw new NegativeValueException("height(" + height + ") and radius(" + radius + ") less than 0");
        }

        return radius * height;
    }
}
