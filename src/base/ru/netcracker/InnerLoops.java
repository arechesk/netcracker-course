package base.ru.netcracker;
public class InnerLoops {
    public static void main(String[] args) {

        int size = 8;
        System.out.println("A");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print("# ");
            System.out.println();
        }
        System.out.println();


        System.out.println("b.a");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print((j <= i) ? "# " : "  ");
            System.out.println();
        }
        System.out.println();


        System.out.println("b.b");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print((j < size - i) ? "# " : "  ");
            System.out.println();
        }
        System.out.println();


        System.out.println("b.c");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j)
                System.out.print((j >= i) ? "# " : "  ");
            System.out.println();
        }
        System.out.println();


    }
}