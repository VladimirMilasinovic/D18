package DomaciOOP1;

public class Main {
    public static void main(String[] args) {
//        Zadatak 1.
//Napraviti klasu Knjiga koja ce imati naziv i zanr. U glavnoj klasi napraviti dve knjige,
// zatim proveriti da li imaju isti zanr i naziv, ako imaju, ispisati poruku da je u pitanju ista knjiga,
// ako je samo zanr isti, ispisati poruku koji je to zanr, ako nista od toga nije isto, ispisati poruku da su u pitanju dve razlicite knjige.
        Knjiga knjiga1 = new Knjiga();

knjiga1.naziv = "Besmrtni bataljon";
knjiga1.zanr = "Roman";

Knjiga knjiga2 = new Knjiga();

knjiga2.naziv = "Miris baruta i smrti na KiM 1998 godine";
knjiga2.zanr = "Istorija";

if (knjiga1.naziv.equals(knjiga2.naziv) && (knjiga1.zanr.equals(knjiga2.zanr))){
            System.out.println("U pitanju je ista knjiga");
        } else if (!knjiga1.naziv.equals(knjiga2.naziv) && (knjiga1.zanr.equals(knjiga2.zanr))) {
    System.out.println("U pitanju je isti zanr " + knjiga2.zanr);
}else {
    System.out.println("U pitanju su dve razlicite knjige");
}

    }
}
