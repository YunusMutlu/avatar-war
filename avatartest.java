import java.util.Scanner;

public class avatartest {
    public static void main(String[] args) throws InterruptedException {
        String ad;
        String[] tur=new String[2];
        int[] guc=new int[10];
        avatar a= new avatar();
        avatar b= new avatar();
        Scanner inp = new Scanner(System.in);
        System.out.print("1.oyuncunun adini girin:");
        ad=inp.nextLine();
        a.setAd(ad);
        System.out.print("2.oyuncunun adini girin:");
        ad=inp.nextLine();
        b.setAd(ad);
        a.setTur(tur);
        b.setTur(tur);
        a.setGuc(guc);
        b.setGuc(guc);
        avatar.kapis(a,b);


    }
}
