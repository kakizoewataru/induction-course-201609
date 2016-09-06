package sample1;

import java.time.LocalDate;

/**
 * Created by kakizoewataru on 2016/09/06.
 */
public class Sales3 {
    public static int total;
    public static void main(String[] args){

        int [] records = {0, 65000, 73000, 90000};              //訂正　削除=>records[0] = 0;
        LocalDate date = LocalDate.now();

        int average;

        for(int i = 0; i < 3 ; i++){                            //訂正_for文修正
            total += records[i];
            System.out.println("total => " +total);
        }

        average = (total + records[3]) / 3;

        System.out.println(date);
        System.out.println("合計: " +(total + records[3]));
        System.out.println("平均: " +average);
    }
}
