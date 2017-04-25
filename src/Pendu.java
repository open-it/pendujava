import java.util.Scanner;

public class Pendu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mot = "telephone";
        char[] tabMot = mot.toCharArray();
        char[] tabMotSaisie = new char[tabMot.length];
        
        int i = 0;
        for(char c : tabMot) {
            tabMotSaisie[i] = '-';
            i++;
        }
        
        System.out.println(String.valueOf(tabMotSaisie));
        
        while (String.valueOf(tabMotSaisie).contains("-")) {
            System.out.println("Saisissez une lettre : ");
            String saisie = sc.nextLine();
            int j = 0;
            for(char c : tabMot) {
                if(c == saisie.charAt(0)) {
                    tabMotSaisie[j] = c;
                }
                
                j++;
            }
            
            System.out.println(String.valueOf(tabMotSaisie));
        }
        System.out.println("BRAVO !!!");
    }

}
