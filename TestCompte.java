public class TestCompte {
    public static void main(String[] args) {
        Compte c1 = new Compte("salah", 1500);
        Compte c2 = new Compte("Fatma", 2000);

        System.out.println(c1);
        System.out.println(c2.getTitulaire());

        CompteEpargne c3 = new CompteEpargne("Ali", 850, 0);

        /*
         * double montant = 1200;
         * if (c3.getSolde() < montant) {
         * System.out.println(x:"Solde insuffisant !");
         * } else {
         * c3.debiter(montant:1200);
         * }
         */

        try {
            c3.debiter(200);
            System.out.println(c3.getSolde());

        } catch (SoldeInsuffisantException e) {
            System.out.println(e);
        }

        System.out.println(c3);

        // System.out.println("------");

        // Banque stb = new Banque("STB");

        // System.out.println(nom: "STB");

        // stb.addCompte(c1);
        // stb.addCompte(c2);
        // stb.addCompte(c3);
    }
}