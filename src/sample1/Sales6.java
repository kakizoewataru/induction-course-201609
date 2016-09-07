package sample1;

import java.time.LocalDate;

/**
 * Created by kakizoewataru on 2016/09/07.
 */

public class Sales6 {

    public static double total;
    public static void main(String[] args) {

        System.out.print(args[0]);
        System.out.print(args[1]);
        System.out.print(args[2]);
        System.out.println(args[3]);

        double[] records = {Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3])};

        for (int i = 0; i < 3; i++) {
            total += records[i];
            System.out.println("[" + i + "] total => " + total);
        }

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println("合計 : " +total);
        getAverage();
    }

    public static void getAverage(){
        double average;
        average = total / 3;
        System.out.print("平均 : " +average);
    }
}
