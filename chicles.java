import java.util.Scanner;

class chicles {
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner (System.in);
        System.out.println("Vols jugar");
        String joc = teclat.nextLine();

        while (joc != "hol"){
        System.out.println("Quants envoltoris necessites per aconseguir chicles");
        int necess = teclat.nextInt();
        System.out.println("Quants chicles et donen");
        int envolt = teclat.nextInt();
        System.out.println("Quants tens");
        int chicle = teclat.nextInt();
        
        if (necess > envolt)
        System.out.println(necess + envolt + chicle + " " + chicle);
        else if(necess < envolt)
        System.out.println("\nRuina\n");
        else if (chicle == 0 && envolt == 0 && necess == 0)
        break;
        }
    }
}

