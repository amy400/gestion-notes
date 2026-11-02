import java.util.Scanner;
public class GestionNotes {
    public static void main (String[] args){
//        System.out.println("Gestion des notes : demarrage ");
        final int COEFALGO =3;
        final int COEFBD = 2;
        final int COEFA = 1;
        final double NDEVOIR = 0.4;
        final double NEXAMEN = 0.6;
        System.out.println("========================");
        System.out.println("  RELEVE DE NOTES - L2 ");
        System.out.println("=========================");
//        String prenom ="Awa";
//        String nom ="Ndiaye";
//        String matricule = "ISI-2026-0142";
//        int age = 20;
//        System.out.println("Etudiant : " + prenom + "\t" + nom + "\t (" + age + "\t ans)");
//        System.out.println("Matricule : " + matricule);
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entez le prenom");
        String prenom = clavier.nextLine();
        System.out.print("Entez le nom");
        String nom = clavier.nextLine();
        System.out.print("Entez l age");
        int age = clavier.nextInt();
        System.out.print("Entez matricule ");
        clavier.nextLine();
        String matricule = clavier.nextLine();
        System.out.print("entrez le note de devoir d algo ");
        double devoirAlgo = clavier.nextDouble();
        System.out.print("entrez le note  examen d algo ");
        double examenAlgo = clavier.nextDouble();
        System.out.print("entrez le note de devoir base de donnee ");
        double devoirBd = clavier.nextDouble();
        System.out.print("entrez le note  examen base de donnee ");
        double examenBd = clavier.nextDouble();
        System.out.print("entrez le note de devoir  l anglais  ");
        double devoirAnglais = clavier.nextDouble();
        System.out.print("entrez le note  examen l anglais  ");
        double examenAnglais = clavier.nextDouble();
        double moyennealgo = devoirAlgo * NDEVOIR + examenAlgo * NEXAMEN;
        double moyenneBd = devoirBd * NDEVOIR +examenBd * NEXAMEN;
        double moyenneanglais = devoirAnglais * NDEVOIR + examenAnglais * NEXAMEN;
        double moyencoefAL = moyennealgo * COEFALGO;
        double moyencoefBd = moyenneBd * COEFBD;
        double moyencoefA = moyenneanglais * COEFA;
        double sommeCoefs = moyencoefAL + moyencoefBd + moyencoefA;
        double moyenneGenerale = sommeCoefs/ 6;
        System.out.println("Etudiant : " + prenom + " " + nom + " (" + age + " ans)");
        System.out.println("Matricule : " + matricule);
        System.out.println("moyAlgo " + moyennealgo + "| moyBd  " + moyenneBd + "| moyAnglais  "  + moyenneanglais);
        System.out.println("La moyenne generale est "+ moyenneGenerale);

        clavier.close();


    }
}
