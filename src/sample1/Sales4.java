package sample1;

import java.time.LocalDate;

/**
 * Created by kakizoewataru on 2016/09/06.
 */
public class Sales4 {
    public static int total;

    public static void main(String[] args) {

        int[] records = {65000, 73000, 90000};                 //訂正_ 0削除と配列コードの修正

        LocalDate date = LocalDate.now();

        for (int i = 0; i < 3; i++) {
            total += records[i];
            System.out.println("[" +i +"] total => " +total);  //訂正_
        }

        System.out.println(date);
        System.out.println("合計 : " +total);

        getAverage();
    }

    public static void getAverage(){
        int average;
        average = total / 3;
        System.out.println("平均 : " +average);
    }
}
