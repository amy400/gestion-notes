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
        System.out.println("Etudiant : " + prenom + " " + nom + " (" + age + " ans)");
        System.out.println("Matricule : " + matricule);
        clavier.close();


    }
}
