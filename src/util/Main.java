package util;

public class Main {

    public static String testUtil(String phone){

        String[] data = phone.split("-");

        String first = data[0];
        String result = "";
        switch (first){
            case "02" : result = "seoul"; break;
            case "031" :result = "bus"; break;
            case "042" :result = "train"; break;
            case "051" : result = "sea"; break;
            case "052" : result = "steal"; break;
            case "044" : result = "king"; break;
            case "053" : result = "hot"; break;
            case "062" : result = "peace"; break;
            case "033" : result = "potato"; break;
            case "043" : result = "middle.n"; break;
            case "041" : result = "middle.s"; break;
            case "054" : result = "east.n"; break;
            case "055" : result = "east.s"; break;
            case "063" : result = "west.n"; break;
            case "061" : result = "west.s"; break;
            case "064" : result = "jeju"; break;
            case "010" : result = "phone"; break;
            case "070" : result = "internet"; break;
            default: result = "none"; break;
        }

        return "phone code = " + result;
    }

   public static void main(String[] args){

        String phone = "02-123-4566";
        String phone1 = "031-123-4566";
        String phone2 = "042-123-4566";
        String phone3 = "054-123-4566";
        String phone4 = "010-123-4566";

        System.out.println(Main.testUtil(phone));
        System.out.println(Main.testUtil(phone1));
        System.out.println(Main.testUtil(phone2));
        System.out.println(Main.testUtil(phone3));
        System.out.println(Main.testUtil(phone4));


   }
}
