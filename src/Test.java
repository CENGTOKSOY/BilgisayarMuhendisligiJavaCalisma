public class Test {
    // TEST SINIFI İÇİNDE HİÇ BİR İŞLEM YAPMAYINIZ
    // BU SINIF YAZDIĞINIZ DİĞER SINIFLARDAKİ KODLARIN PUANLAMASINI YAPAR
    // YAZACAĞINIZ TÜM KODLAR DİĞER SINIFLARDA OLACAKTIR.

    public static void main(String[] args) {
        double puan=0;
        TcKimlikNo tckn1=new TcKimlikNo("78471339158");  //doğru kimlik numarası
        TcKimlikNo tckn2=new TcKimlikNo("80378237086");  //doğru kimlik numarası
        TcKimlikNo tckn3=new TcKimlikNo("61733964153");  // yanlış kimlik numarası
        TcKimlikNo tckn4=new TcKimlikNo("12345678922");  // yanlış kimlik numarası

        if(tckn1.dogrula()==true && tckn2.dogrula()==true && tckn3.dogrula()==false && tckn4.dogrula()==false)
            puan+=5;
        else
            System.out.println("Yazdığınız kod kimlik numaralarını doğrulayamadı");

        SifreDogrulama sifre1=new SifreDogrulama("a1b2c3?Kl}");  //Geçerli şifre
        SifreDogrulama sifre2=new SifreDogrulama("(Abc6767)");   //Geçerli şifre
        SifreDogrulama sifre3=new SifreDogrulama("Pr7886{81");   //Geçersiz şifre
        SifreDogrulama sifre4=new SifreDogrulama("abc225?}");    //Geçersiz şifre

        if(sifre1.sifreDogrula()==true && sifre2.sifreDogrula()==true && sifre3.sifreDogrula()==false && sifre4.sifreDogrula()==false )
            puan+=10;
        else
            System.out.println("Yazdığınız kod şifreleri doğrulayamadı");
        // Verilen sayılarla oluşturulabilecek en büyük  sayı
        EnBuyukSayi ebs1=new EnBuyukSayi(11,1);
        EnBuyukSayi ebs2=new EnBuyukSayi(6060,6);
        EnBuyukSayi ebs3=new EnBuyukSayi(435,4600,5);
        EnBuyukSayi ebs4=new EnBuyukSayi(8,28,2569);
        EnBuyukSayi ebs5=new EnBuyukSayi(67,670,6,666);
        EnBuyukSayi ebs6=new EnBuyukSayi(3,304,350,36);

        if(ebs1.olusturulanEnbuyukSayi()==111 && ebs2.olusturulanEnbuyukSayi()==66060 &&  ebs3.olusturulanEnbuyukSayi()==54600435 && ebs4.olusturulanEnbuyukSayi()==8282569 && ebs5.olusturulanEnbuyukSayi()==676706666 && ebs6.olusturulanEnbuyukSayi()==363503304)
            puan+=12.5;
        else
            System.out.println("Yazdığınız kod verilen sayılarla oluşturulabilecek en büyük sayıyı bulamadı");


        Node n1=new Node(5);
        Node n2=new Node(5);
        Node n3=new Node(4);
        Node n4=new Node(6);
        Node n5=new Node(3);
        Node n6=new Node(3);
        Node n7=new Node(5);
        Node n8=new Node(3);

        Node n9=new Node(55);
        Node n10=new Node(33);

        LinkedList l1=new LinkedList();
        LinkedList l2=new LinkedList();
        LinkedList l3=new LinkedList();
        l1.add(n1);
        l1.add(n2);
        l1.add(n3);
        l1.add(n4);
        l1.add(n5);
        l1.add(n6);
        l1.add(n7);
        l1.add(n8);

        if(l1.get(5)==3)
            puan+=5;
        else
            System.out.println("Yazdığınız kod l1 ile gösterilen listedeki n. elemanı bulamadı");

        if(l1.enCokTekrarEdenKey()==5)
            puan+=10;
        else
            System.out.println("Yazdığınız kod l1 ile gösterilen listede en çok tekrar eden key değerini bulamadı");

        if(l1.siraveKeyCarpTopla()==143)
            puan+=10;
        else
            System.out.println("Yazdığınız siraveKeyCarpTopla() metodunu doğru çalışmadı");

        l1.remove(5);
        if(l1.get(7)==3)
            puan+=10;
        else
            System.out.println("Yazdığınız remove() metodu doğru çalışmadı");

        l1.add(n9);
        if(l1.get(1)==55 && l1.get(9)==33 )
            puan+=10;
        else
            System.out.println("Yazdığınız kod l1 ile gösterilen listenin başına ve sonuna Node ekleme işlemini yapamadı");

        ////güncellenen kısım güncelleme tarihi: 18.03.2024
        n1=new Node(10);
        n3=new Node(12);
        n5=new Node(15);
        n7=new Node(18);
        n9=new Node(20);

        n2=new Node(10);
        n4=new Node(14);
        n6=new Node(15);
        n8=new Node(20);
        n10=new Node(50);

        l2.add(n1);
        l2.add(n3);
        l2.add(n5);
        l2.add(n7);
        l2.add(n9);
        l3.add(n2);
        l3.add(n4);
        l3.add(n6);
        l3.add(n8);
        l3.add(n10);

        // iki listenin kesişimindeki key değerleri 10,15 ve 20 olduğundan bu 3 sayının toplamı 45 olur
        if(l2.ikiListeninKesisimindekiSayilarinToplami(l3)==45)
            puan+=15;
        else
            System.out.println("Yazdığınız kod farklı iki listenin kesişimindeki elemanların toplamını bulamadı");
// Güncellenen kısmın sonu

        //Banka hesabı
        BankaHesabi hesap1=new BankaHesabi("ALİ ASLAN");
        BankaHesabi hesap2=new BankaHesabi("AYLİN TAŞÇI",100000);

        hesap1.paraYatir(200000);
        hesap1.paraCek(50000);
        hesap1.setHesapSahibi("MUSA TEMEL");
        hesap1.paraYatir(20000);
        hesap1.paraCek(10000);

        hesap2.paraYatir(40000);
        hesap2.paraCek(20000);
        hesap2.paraYatir(30000);

        if(hesap1.hesapSahibi=="MUSA TEMEL" && hesap1.kalanPara()==160000 && hesap2.hesapSahibi=="AYLİN TAŞÇI" && hesap2.kalanPara()==150000)
            puan+=5;
        else
            System.out.println("BankaHesabi sınıfında yazdığınız kodlarda hata var");

        hesap1.paraGonder(hesap2, 30000);  // bu noktada hesap1 ve hesap2 hesaplarının güncel para miktarları dikkate alınarak hesap1 hesabından hesap2 hesabına gönderilecek miktar 30000

        if(hesap1.kalanPara()==130000 && hesap2.kalanPara()==180000)
            puan+=7.5;
        else
            System.out.println("BankaHesabi sınıfında yazdığınız paraGonder metodunda hata var");

        System.out.println("Toplam puanınız:->"+puan);

    }
}
