package sample1;

import java.time.LocalDate;

/**
 * Created by kakizoewataru on 2016/09/05.
 */
public class Sales1 {

    public static void main(String args[]){
        int tokyo = 65000;
        int osaka = 73000;
        int nagoya = 90000;
        LocalDate date = LocalDate.now();            //訂正_日付変更
        int total = tokyo + nagoya + osaka;          //訂正_total = tokyo + ... 　
        int average = (tokyo + nagoya + osaka) / 3;  //訂正_average = (tokyo + ...

        System.out.println(date);                    //訂正_date <= コメント出力削除
        System.out.println("合計 : " + total);       //訂正_+ total <= +total
        System.out.println("平均 : " + average);     //訂正_+ average <= +average
    }

}
