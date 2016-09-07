package sample1;

import java.time.LocalDate;

/**
 * Created by kakizoewataru on 2016/09/07.
 */
public class Sales5 {
    public static double total;

    public static void main(String[] args) {

        double[] records = {82000, 46000, 65000};
        LocalDate date = LocalDate.now();

        for (int i = 0; i < 3; i++) {
            total += records[i];
            System.out.println("[" + i + "] date => " + total);
        }
        System.out.println(date);
        System.out.println("合計 : " + total);

        getAverage();
    }
    public static void getAverage(){
            double average;
            average = total / 3;
            System.out.println("平均 : " + average);
    }
}


