package sample1;

/**
 * Created by kakizoewataru on 2016/09/05.
 */
public class Sales1 {

    public static void main(String args[]){
        int tokyo = 65000;
        int osaka = 73000;
        int nagoya = 90000;
        String date = "** 2010/04/01 **";
        int total;
        int average;

        total = tokyo + nagoya + osaka;
        average = (tokyo + nagoya + osaka) / 3;

        System.out.println(" " +date);
        System.out.println("合計 : " +total);
        System.out.println("平均 : " +average);
    }
}
