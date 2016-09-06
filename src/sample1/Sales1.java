package sample1;

/**
 * Created by kakizoewataru on 2016/09/05.
 */
public class Sales1 {

    public static void main(String args[]){
        int tokyo;
        int osaka;
        int nagoya;
        char date;
        int a;
        int b;

        tokyo = 65000;
        osaka = 73000;
        nagoya = 90000;
        a = tokyo + nagoya + osaka;
        b = (tokyo + nagoya + osaka) / 3;

        date = '** 2010/04/01 **';
        System.out.println(" " +date);
        System.out.println("合計 : " +a);
        System.out.println("平均 : " +b);
    }
}
