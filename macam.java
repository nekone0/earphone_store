import java.util.*;
public class macam {
    static Scanner a = new Scanner(System.in);

    static String inputString(String question)
    {
        System.out.println(question);
        String nama = a.nextLine();
        return nama;
    }

    static Integer inputInt(String question)
    {
        System.out.println(question);
        Integer angka = a.nextInt();
        return angka;
    }
    static void lanjut()
    {
        a.nextLine();
    }

    static Double inputDou(Double question)
    {
        System.out.println(question);
        Double angka2 = a.nextDouble();
        return angka2;
    }

    static void write(String quest)
    {
        System.out.println(quest);
    }

    static void writeNum(Integer quest)
    {
        System.out.println(quest);
    }

    static void clear()
    {
        System.out.print ("\033[H\033[2J");
        System.out.flush();
    }

    static void timer(int sec)
    {
        try {
        Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
    }

    public static boolean isStringNull(String s)
    {
        if (s == null)
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}
