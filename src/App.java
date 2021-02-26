public class App {
    static final int INICIO = 65;
    static final int FIM = 90;
    public static void main(String[] args) throws Exception {
        char letra;
        String oct,hex,bin,bin8;
        char[] c = { 0x2554, 0x2557, 0x255A, 0x255D, 0x2551, 0x255F, 0x2562, 0x2551, 0x2502 };
        System.out.printf("%c=============================================%c\n",c[0],c[1]);
        System.out.printf("%c %9s %c %4s %c %5s %c %5s %c %8s %c\n", c[4], "Caracter",c[8],"Dec",c[8],"Oct",c[8],"Hex",c[8],"Bin", c[4]);
        System.out.printf("%c=============================================%c\n",c[5],c[6]);
        for (int i = INICIO; i <= FIM; i++) {
            letra = (char)i;
            oct = Integer.toOctalString(letra);
            hex = Integer.toHexString(letra);
            bin = Integer.toBinaryString(i);
            bin8 = String.format("%8s", bin).replaceAll(" ", "0");
            System.out.printf("%c %8c  %c %3d  %c %4s  %c %4s  %c %8s %c\n", c[4], letra, c[8], i, c[8], oct, c[8], hex, c[8], bin8, c[4]);
            if(i < FIM)
                System.out.printf("%c---------------------------------------------%c\n",c[5], c[6]);
        }
        System.out.printf("%c=============================================%c", c[2], c[3]);
    }
}