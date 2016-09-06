package sample1;

/**
 * Created by kakizoewataru on 2016/09/06.
 */
public class Sales2 {
    public static void main(String[] args){

        int [] records;
        records = new int [3];
        records[0] = 65000;
        records[1] = 73000;
        records[2] = 90000;
        int total;
        int average;
        String date = "** 2010/04/01 **";

        total = records[0] + records[1] + records[2];
        average = total / 3;

        System.out.println("" +date);
        System.out.println("合計 : " +total);
        System.out.println("平均 : " +average);
    }
}
