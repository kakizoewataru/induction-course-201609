package sample1;

/**
 * Created by kakizoewataru on 2016/09/06.
 */
public class Sales3 {
    public static void main(String[] args){

        int [] records;
        records = new int [4];
        records[0] = 0;
        records[1] = 65000;
        records[2] = 73000;
        records[3] = 90000;

        String date = "** 2010/04/01 **";
        int total;
        int average;


        for(int i = 0 ; i <= 2 ; i++){
            if(i == 0){
                System.out.println("[0] total => " +records[0]);
            }
            if(i == 1){
                System.out.println("[1] total => " +records[1]);
            }
            if(i == 2) {
                System.out.println("[2] total => " + (records[1] + records[2]));
            }
        }

        total = records[1] + records[2] + records[3];
        average = total / 3;

        System.out.println(" " +date);
        System.out.println("合計: " +total);
        System.out.println("平均: " +average);
    }
}
