import java.util.*;

public class WorkWithText implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
        } else {
            if (o1.length() < o2.length()) {
                return -1;
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void serch(String[] array, Scanner in) throws NotFoundWorldException {
        System.out.println("\n" + "Введите слово для поиска");
        int count = 0;
        String serch = in.next();
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(serch)) {
                count++;
            }
        }
        if (count == 0) throw new NotFoundWorldException("Нет такого слова в тексте");
        System.out.println("Слово" + " " + serch + " " + "повторилось в тексте" + " " + count + " " + "раз(а)");
    }
}