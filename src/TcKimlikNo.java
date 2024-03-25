public class TcKimlikNo {

    private String tcKimlikNo;

    public TcKimlikNo(String tc) {
        this.tcKimlikNo = tc;
    }

    public boolean dogrula() {
        if (tcKimlikNo == null || tcKimlikNo.length() != 11 || tcKimlikNo.charAt(0) == '0') {
            return false;
        }

        int[] haneler = new int[11];

        for (int i = 0; i < 11; i++) {
            haneler[i] = tcKimlikNo.charAt(i) - '0';
        }

        int tekToplam = haneler[0] + haneler[2] + haneler[4] + haneler[6] + haneler[8];
        int ciftToplam = haneler[1] + haneler[3] + haneler[5] + haneler[7];

        int t1 = (tekToplam * 7 - ciftToplam) % 10;
        int t2 = (tekToplam + ciftToplam + haneler[9]) % 10;

        return t1 == haneler[9] && t2 == haneler[10];
    }
}
