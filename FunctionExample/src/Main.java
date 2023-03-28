public class Main {
    public static void main(String[] args) {
        //string to double transaction
        String sayi1 = "10.5";
        String sayi2 = "5.5";
        System.out.println("------------------String To Double Dört İşlem------------------");
        System.out.println("Toplam:" + stringToDoubleTotal(sayi1, sayi2));
        System.out.println("Fark:" + stringToDoubleDifference(sayi1, sayi2));
        System.out.println("Çarpım:" + stringToDoubleImpact(sayi1, sayi2));
        System.out.println("Bölme:" + stringToDoubleDivide(sayi1, sayi2));
        // string to int transactions
        String sayi3 = "15";
        String sayi4 = "10";
        System.out.println("------------------String To Int Dört İşlem------------------");
        System.out.println("Toplam:" + stringToIntTotal(sayi3, sayi4));
        System.out.println("Fark:" + stringToIntDifference(sayi3, sayi4));
        System.out.println("Çarpım:" + stringToIntImpact(sayi3, sayi4));
        System.out.println("Bölme:" + stringToIntDivide(sayi3, sayi4));
    }

    public static double stringToDoubleTotal(String s1, String s2) {
        try {
            double sayi1 = Double.parseDouble(s1);
            double sayi2 = Double.parseDouble(s2);
            double sonuc = sayi1 + sayi2;
            return sonuc;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }

    public static double stringToDoubleDifference(String s1, String s2) {
        try {
            double sayi1 = Double.parseDouble(s1);
            double sayi2 = Double.parseDouble(s2);
            double sonuc = sayi1 - sayi2;
            return sonuc;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }

    public static double stringToDoubleImpact(String s1, String s2) {
        try {
            double sayi1 = Double.parseDouble(s1);
            double sayi2 = Double.parseDouble(s2);
            double sonuc = sayi1 * sayi2;
            return sonuc;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }

    public static double stringToDoubleDivide(String s1, String s2) {
        try {
            double sayi1 = Double.parseDouble(s1);
            double sayi2 = Double.parseDouble(s2);
            double sonuc = sayi1 / sayi2;
            return sonuc;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }

    public static int stringToIntTotal(String s1, String s2) {
        try {
            int sayi1 = Integer.parseInt(s1);
            int sayi2 = Integer.parseInt(s2);
            int sonuc = sayi1 + sayi2;
            return sonuc;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static int stringToIntDifference(String s1, String s2) {
        try {
            int sayi1 = Integer.parseInt(s1);
            int sayi2 = Integer.parseInt(s2);
            int sonuc = sayi1 - sayi2;
            return sonuc;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static int stringToIntImpact(String s1, String s2) {
        try {
            int sayi1 = Integer.parseInt(s1);
            int sayi2 = Integer.parseInt(s2);
            int sonuc = sayi1 * sayi2;
            return sonuc;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static int stringToIntDivide(String s1, String s2) {
        try {
            int sayi1 = Integer.parseInt(s1);
            int sayi2 = Integer.parseInt(s2);
            int sonuc = sayi1 / sayi2;
            return sonuc;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}