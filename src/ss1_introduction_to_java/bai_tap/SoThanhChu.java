package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc");
        int number = Integer.parseInt(scanner.nextLine());
        int hangTram = number / 100;
        int hangChuc = (number % 100) /10;
        int hangDonVi = number % 10;
        String docChu = "";
        if (number > 0 && number < 999)
            switch (hangTram) {
                case 9:
                    docChu += "nine hundred";
                    break;
                case 8:
                    docChu += "eight hundred";
                    break;
                case 7:
                    docChu += "seven hundred";
                    break;
                case 6:
                    docChu += "six hundred";
                    break;
                case 5:
                    docChu += "fine hundred";
                    break;
                case 4:
                    docChu += "four hundred";
                    break;
                case 3:
                    docChu += "three hundred";
                    break;
                case 2:
                    docChu += "two hundred";
                    break;
                case 1:
                    docChu += "one hundred";
                    break;
            }
        if (hangTram != 0 && (hangChuc != 0 || hangDonVi != 0)){
            docChu += " and ";
        }
        if (hangChuc >= 2 ){
            switch (hangChuc){
                case 9:
                    docChu += "ninety";
                    break;
                case 8:
                    docChu += "eightty";
                    break;
                case 7:
                    docChu += "seventy";
                    break;
                case 6:
                    docChu += "sixty";
                    break;
                case 5:
                    docChu += "fifty";
                    break;
                case 4:
                    docChu += "forty";
                    break;
                case 3:
                    docChu += "thirty";
                    break;
                case 2:
                    docChu += "Twenty";
                    break;
            }
        }else if(hangChuc == 1){
            switch (hangDonVi){
                case 9:
                    docChu += " Nineteen";
                    break;
                case 0:
                    docChu += " Ten";
                    break;
                case 8:
                    docChu += "Eighteen";
                    break;
                case 7:
                    docChu += " Seventeen";
                    break;
                case 6:
                    docChu += " Sixteen";
                    break;
                case 5:
                    docChu += " Fifteen";
                    break;
                case 4:
                    docChu += " Fourteen";
                    break;
                case 3:
                    docChu += " Thirteen";
                    break;
                case 2:
                    docChu += " Twelve";
                    break;
                case 1:
                    docChu += " Eleven";
                    break;
            }
        }
        if(hangChuc !=1) {
            switch (hangDonVi) {
                case 1:
                    docChu += " one";
                    break;
                case 2:
                    docChu += " two";
                    break;
                case 3:
                    docChu += " three";
                    break;
                case 4:
                    docChu += " four";
                    break;
                case 5:
                    docChu += " five";
                    break;
                case 6:
                    docChu += " six";
                    break;
                case 7:
                    docChu += " seven";
                    break;
                case 8:
                    docChu += " eight";
                    break;
                case 9:
                    docChu += " nine";
                    break;
            }
        }
        System.out.println(docChu);
    }
}
