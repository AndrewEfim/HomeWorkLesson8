import java.util.*;

public class BeginProgramm {

    void Begin() throws NotFoundWorldException {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для проверки");
        String inText = in.nextLine( );
        String[] array = inText.split(" ");
        Comparator<String> stringLengthComparator = new WorkWithText();
        Set<String> textListNotDublicat = new TreeSet();
        textListNotDublicat.addAll(Arrays.asList(array));
        System.out.println(Arrays.toString(array));

        List<String> text2 = new ArrayList<>();
        text2.addAll(textListNotDublicat);
        String[] arr2 = text2.toArray(new String[text2.size()]);
        Arrays.sort(arr2, stringLengthComparator);
        System.out.println("Список слов без повторений и в порядке возростания");
        for (String te : arr2)
            System.out.printf("%s ", te, "\n");
        WorkWithText.serch(array, in);
    }
}
