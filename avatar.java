import java.util.Random;

public class avatar {
    private String ad;
    private String[] tur;
    private int[] guc;
    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setTur(String[]xd) {
        Random c=new Random();
        xd=new String[5];
        String [] x=new String[2];
        x[0]="savasci";
        x[1]="çiftci";
        int v=0;
        while(v<5){
            xd[v]=x[c.nextInt(2)];
            v++;
        }
        this.tur = xd;
    }

    public String[] getTur() {

        return tur;
    }

    public void setGuc(int[] guc) {
        Random rnd=new Random();
        guc=new int[5];
        for (int v=0;v<5;v++){
            guc[v]=rnd.nextInt(10)+1;
        }
        this.guc = guc;
    }
    public int[] getGuc() {
        return guc;
    }
    public static void kapis(avatar a,avatar b) throws InterruptedException {
        int puan=0;
        int puan2=0;
        for(int v=0;v<5;v++){
            if(a.tur[v]==b.tur[v]){
                if(a.guc[v]>b.guc[v]){
                    puan=(a.guc[v]-b.guc[v])+puan;
                    System.out.println(a.ad+" isimli oyunbu bu tur "+(a.guc[v]-b.guc[v])+" puan aldı toplam puan="+puan);
                    Thread.sleep(1500);
                }
                else if (a.guc[v]<b.guc[v]) {
                    puan2=(b.guc[v]-a.guc[v])+puan;
                    System.out.println(b.ad+" isimli oyunbu bu tur "+(b.guc[v]-a.guc[v])+" puan aldı toplam puan="+puan2);
                    Thread.sleep(1500);
                }
                else{
                    puan+=0;
                    puan2+=0;
                    System.out.println("Güçler eşit berabere 0 puan");
                    Thread.sleep(1500);
                }
            }
            else{
                if(a.tur[v]=="savasci"){
                    puan+=10;
                    System.out.println(a.ad+" isimli oyuncu bu tur 10 puan aldı toplam puan="+puan);
                    Thread.sleep(1500);
                }
                else if(b.tur[v]=="savasci"){
                    puan2+=10;
                    System.out.println(b.ad+" isimli oyuncu bu tur 10 puan aldı toplam puan="+puan2);
                    Thread.sleep(1500);
                }
                else{
                    System.out.println("Güçler eşit berabere 0 puan");
                    Thread.sleep(1500);
                }

            }
        }
        if(puan>puan2){
            System.out.println("Kazanan="+a.ad+" toplam puan="+puan);
                System.out.println("Kaybeden="+b.ad+" toplam puanı="+puan2);
            Thread.sleep(1500);
        }
        else{
            System.out.println("Kazanan="+b.ad+" toplam puan="+puan2);
            System.out.println("Kaybeden="+a.ad+" toplam puanı="+puan);
        }
    }
}