public class Main {

    public static void main(String[] args) {
        /* Feladat: sakktábla mezőinek megjelenítése a konzolon az alábbi mintának megfeleleően
            W B W B W B W B
            B W B W B W B W
            W B W B W B W B
            B W B W B W B W
            W B W B W B W B
            B W B W B W B W
            W B W B W B W B
            B W B W B W B W
         */
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 8; i++) {
                if (i % 2 != 0) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
            for (int i = 1; i <= 8; i++) {
                if (i % 2 == 0) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }
}