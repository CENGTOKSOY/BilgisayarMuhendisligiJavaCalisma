import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LinkedList {

    private Node head;
    private Node p2;

    public LinkedList() {
        this.head = null;
    }

    // Listenin başına veya sonuna Node eklemek için güncellenmiş add metodu
    public void add(Node p, boolean addToEnd) {
        if (head == null) {
            head = p;
        } else if (!addToEnd) {
            p.next = head;
            head = p;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = p;
        }
    }

    public void add(Node p1) {
        // Bu metod şu anda kendini tekrar çağırıyor, bu yüzden düzeltmemiz gerekiyor.
        // Örneğin, listenin sonuna p1 düğümünü eklemek için:
        add(p1, true);
    }

    // Ve eğer listenin başına ve sonuna iki düğüm eklemek istiyorsanız:
    public void add(Node p1, Node p2) {
        add(p1, false); // Listenin başına p1 düğümünü ekler
        add(p2, true);  // Listenin sonuna p2 düğümünü ekler
    }



    public int enCokTekrarEdenKey() {
        HashMap<Integer, Integer> keyFrekanslari = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            keyFrekanslari.put(temp.key, keyFrekanslari.getOrDefault(temp.key, 0) + 1);
            temp = temp.next;
        }
        int enCokTekrarEden = -1;
        int maxFrekans = 0;
        for (Map.Entry<Integer, Integer> entry : keyFrekanslari.entrySet()) {
            if (entry.getValue() > maxFrekans) {
                maxFrekans = entry.getValue();
                enCokTekrarEden = entry.getKey();
            }
        }
        return enCokTekrarEden;
    }

    public int get(int s) {
        Node temp = head;
        int count = 1;
        while (temp != null && count < s) {
            temp = temp.next;
            count++;
        }
        if (temp != null) {
            return temp.key;
        } else {
            return -1;
        }
    }

    public int siraveKeyCarpTopla() {
        Node temp = head;
        int count = 1;
        int sum = 0;
        while (temp != null) {
            sum += temp.key * count;
            temp = temp.next;
            count++;
        }
        return sum;
    }

    public void remove(int s) {
        Node temp = head;
        Node prev = null;
        while (temp != null && temp.key != s) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        if (prev == null) {
            head = temp.next;
        } else {
            prev.next = temp.next;
        }
    }

    public int ikiListeninKesisimindekiSayilarinToplami(LinkedList l) {
        HashSet<Integer> kesisim = new HashSet<>();
        Node temp = head;
        while (temp != null) {
            kesisim.add(temp.key);
            temp = temp.next;
        }
        int toplam = 0;
        temp = l.head;
        while (temp != null) {
            if (kesisim.contains(temp.key)) {
                toplam += temp.key;
            }
            temp = temp.next;
        }
        return toplam;
    }
}

