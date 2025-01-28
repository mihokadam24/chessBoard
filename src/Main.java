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
        chessTableDesigner1();
        chessTableDesigner2();
        chessTableDesigner3();
        chessTableDesigner4();
    }

    public static void chessTableDesigner1() {
        System.out.println("Sakktábla rajzoló - 1. változat");
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
        System.out.println("-------------------------------");
    }

    public static final String headerFooter = "  a b c d e f g h";

    public static void chessTableDesigner2() {
        System.out.println("Sakktábla rajzoló - 2. változat");
        System.out.println(headerFooter);
        byte rowMaker = 1;
        for (int j = 1; j <= 4; j++) {
            System.out.print(rowMaker + " ");
            for (int i = 1; i <= 8; i++) {
                if (i % 2 != 0) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println(rowMaker);
            rowMaker++;
            // következő sor
            System.out.print(rowMaker + " ");
            for (int i = 1; i <= 8; i++) {
                if (i % 2 == 0) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println(rowMaker);
            rowMaker++;
        }
        System.out.println(headerFooter);
        System.out.println("-------------------------------");
    }

    public static void chessTableDesigner3() {
        System.out.println("Sakktábla rajzoló - 3. változat");
        final String oddRow = " W B W B W B W B ";
        final String evenRow = " B W B W B W B W ";
        System.out.println(headerFooter);
        for (int i = 1; i <= 8; i++) {
            if (i % 2 != 0) {
                System.out.println(i + oddRow + i);
            } else {
                System.out.println(i + evenRow + i);
            }
        }
        System.out.println(headerFooter);
        System.out.println("-------------------------------");
    }

    public static void chessTableDesigner4() {
        System.out.println("Sakktábla rajzoló - 4. változat");
        System.out.println(headerFooter);
        for (int row = 1; row <= 8; row++) {
            System.out.print(row + " ");
            for (int column = 1; column <= 8; column++) {
                if ((row % 2 != 0 && column % 2 != 0) || (row % 2 == 0 && column % 2 == 0)) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println(row);
        }
        System.out.println(headerFooter);
        System.out.println("-------------------------------");
    }
}