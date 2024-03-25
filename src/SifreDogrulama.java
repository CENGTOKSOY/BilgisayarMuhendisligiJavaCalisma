public class SifreDogrulama {

    private String sifre;

    public SifreDogrulama(String sifre) {
        this.sifre = sifre;
    }

    public boolean sifreDogrula() {
        if (sifre == null || sifre.length() < 8 || sifre.length() > 10) {
            return false;
        }

        boolean buyukHarfVarMi = false;
        boolean kucukHarfVarMi = false;
        boolean rakamVarMi = false;
        boolean ozelKarakterVarMi = false;
        int ardArdaRakamSayisi = 0;
        int ardArdaHarfSayisi = 0;
        int[] karakterFrekanslari = new int[128];

        char oncekiKarakter = '\0';

        for (int i = 0; i < sifre.length(); i++) {
            char c = sifre.charAt(i);
            karakterFrekanslari[c]++;

            if (karakterFrekanslari[c] > 2) return false; // Aynı karakter 2'den fazla tekrar edemez

            if (Character.isUpperCase(c)) {
                buyukHarfVarMi = true;
                if (i > 0 && c == oncekiKarakter + 1) ardArdaHarfSayisi++;
                else ardArdaHarfSayisi = 1;
            } else if (Character.isLowerCase(c)) {
                kucukHarfVarMi = true;
                if (i > 0 && c == oncekiKarakter + 1) ardArdaHarfSayisi++;
                else ardArdaHarfSayisi = 1;
            } else if (Character.isDigit(c)) {
                rakamVarMi = true;
                if (i > 0 && c == oncekiKarakter + 1) ardArdaRakamSayisi++;
                else ardArdaRakamSayisi = 1;
            } else if ("{},[]%&/()=?+".indexOf(c) != -1) {
                ozelKarakterVarMi = true;
            } else {
                return false; // Geçersiz karakter
            }

            if (ardArdaHarfSayisi > 2 || ardArdaRakamSayisi > 2) return false; // Ardışık 3 veya daha fazla harf veya rakam

            oncekiKarakter = c;
        }

        return buyukHarfVarMi && kucukHarfVarMi && rakamVarMi && ozelKarakterVarMi;
    }
}
