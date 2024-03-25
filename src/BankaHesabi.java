public class BankaHesabi {

    String hesapSahibi;
    private double hesapAcilisMiktari; // Hesaba ilk açılışta yatırılan para miktarı
    private double paraMiktarı; // Hesaptaki güncel para miktarı

    public BankaHesabi(String hesapSahibi){
        this.hesapSahibi = hesapSahibi;
        this.hesapAcilisMiktari = 0;
        this.paraMiktarı = 0; // İlk açılışta para miktarı 0 olarak ayarlanır
    }
    public BankaHesabi(String hesapSahibi, double hesapAcilisMiktari){
        this.hesapSahibi = hesapSahibi;
        this.hesapAcilisMiktari = hesapAcilisMiktari;
        this.paraMiktarı = hesapAcilisMiktari; // İlk açılışta verilen miktar güncel para miktarı olarak ayarlanır
    }

    public String getHesapSahibi() {
        return hesapSahibi;
    }

    public void setHesapSahibi(String hesapSahibi) {
        this.hesapSahibi = hesapSahibi;
    }

    public double getHesapAcilisMiktari() {
        return hesapAcilisMiktari;
    }

    public void setHesapAcilisMiktari(double hesapAcilisMiktari) {
        this.hesapAcilisMiktari = hesapAcilisMiktari;
    }

    public double kalanPara(){
        return paraMiktarı;
    }
    public void paraYatir(double miktar){
        this.paraMiktarı += miktar; // Yatırılan miktarı güncel para miktarına ekler
    }
    public void paraCek(double miktar){
        if(this.paraMiktarı >= miktar){
            this.paraMiktarı -= miktar; // Çekilen miktarı güncel para miktarından düşer
        } else {
            System.out.println("Yetersiz bakiye.");
        }
    }

    public void paraGonder(BankaHesabi h, double para){
        if(this.paraMiktarı >= para){
            this.paraMiktarı -= para; // Gönderen hesaptan para düşülür
            h.paraMiktarı += para; // Alıcı hesaba para eklenir
        } else {
            System.out.println("Yetersiz bakiye.");
        }
    }
}
