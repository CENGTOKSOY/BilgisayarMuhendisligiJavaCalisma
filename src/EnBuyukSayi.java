import java.util.Arrays;

public class EnBuyukSayi {

    private String[] sayilar;

    public EnBuyukSayi(int... gelenSayilar) {
        sayilar = new String[gelenSayilar.length];
        for (int i = 0; i < gelenSayilar.length; i++) {
            sayilar[i] = String.valueOf(gelenSayilar[i]);
        }
    }

    public int olusturulanEnbuyukSayi() {
        Arrays.sort(sayilar, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder enBuyukSayi = new StringBuilder();
        for (String sayi : sayilar) {
            enBuyukSayi.append(sayi);
        }
        // Sayının int sınırlarını aşmadığından emin olun
        long sayi = Long.parseLong(enBuyukSayi.toString());
        if (sayi > Integer.MAX_VALUE) {
            throw new ArithmeticException("Sayı int türünün maksimum sınırını aşıyor.");
        }
        return (int) sayi;
    }
}
