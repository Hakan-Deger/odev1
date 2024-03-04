public class DereceBul {
    public int birinciBul(int[] derece) {

        int enKucukIndex = 0;
        int enKucuk = derece[0];
        for (int i = 0; i < derece.length; i++) {
            if (derece[i] < derece[enKucukIndex]) {
                enKucuk = derece[i];
                enKucukIndex = i;

            }
        }
        return enKucukIndex;

    }

    public int ikinciBul(int[] derece) {
        int enKucukIndex = birinciBul(derece);
        int enKucuk = derece[birinciBul(derece)];
        int enKucukIndex2 = 0;
        int enKucukDerece2 = derece[0];
        for (int i = 0; i < derece.length; i++) {
            if (derece[i] > enKucuk && derece[i] < derece[enKucukIndex2]) {
                enKucukDerece2 = derece[i];
                enKucukIndex2 = i;
            }

        }
        return enKucukIndex2;

    }

    public int ucuncuBul(int[] derece) {
        int enKucuk = derece[birinciBul(derece)];
        int enKucukDerece2 = derece[ikinciBul(derece)];
        int enKucukIndex3 = 0;
        int enKucukDerece3 = derece[0];
        for (int i = 0; i < derece.length; i++) {
            if (derece[i] > enKucukDerece2 && derece[i] < derece[enKucukIndex3]) {
                enKucukDerece3 = derece[i];
                enKucukIndex3 = i;

            }
        }
        return enKucukIndex3;

    }

    public void ilkUc(int[] derece) {
        String[] isim = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar",
                "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};
        System.out.println("Birinci " + isim[birinciBul(derece)] + " " + derece[birinciBul(derece)] + "'");
        System.out.println("İkinci " + isim[ikinciBul(derece)] + " " + derece[ikinciBul(derece)] + "'");
        System.out.println("Üçüncü " + isim[ucuncuBul(derece)] + " " + derece[ucuncuBul(derece)] + "'");
    }

    public void sınıflandır(int[] derece) {
        int A = 0, B = 0, C = 0;
        for (int i = 0; i < derece.length; i++) {
            if (derece[i] >= 200 && derece[i] <= 299) {
                A++;
            } else if (derece[i] >= 300 && derece[i] <= 399) {
                B++;
            } else if (derece[i] > 400) {
                C++;
            }
        }
        System.out.println("A -->" + A);
        System.out.println("B -->" + B);
        System.out.println("C -->" + C);
    }


}


