package sample1;

import java.time.LocalDate;

/**
 * Created by kakizoewataru on 2016/09/06.
 */
public class Sales2 {
    public static void main(String[] args) {

        int[] records = {65000, 73000, 90000};            //訂正_配列プログラム一行
        int total = records[0] + records[1] + records[2]; //訂正_total = records ...
        int average = total / 3;                          //訂正_average = total / 3
        LocalDate date = LocalDate.now();

        System.out.println(date);                         //訂正_date <= コメント出力削除
        System.out.println("合計 : " + total);
        System.out.println("平均 : " + average);
    }
}