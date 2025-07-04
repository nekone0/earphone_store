import java.util.*;
import java.io.*;

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

    static void writenum(Integer quest)
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

    static String fileCreate(String nama, ArrayList<String> toko)
    {
       try{
            // buat + nulis
            FileWriter fill = new FileWriter(nama + ".txt");
            for (int a = 0; a < toko.size(); a = a+1)
            {
                fill.write(toko.get(a) + "\n");
            }
            fill.close();

            // buat file
            File cari = new File(nama + ".txt");
            Scanner a_file = new Scanner(cari);
            int a = 1;
            while (a_file.hasNextLine())
            {
                String data = a_file.nextLine();
                macam.write(a + ". " + data);
                a++;
            }
            a_file.close();
        }
        catch(IOException e)
        {
            macam.write("Error");
            e.printStackTrace();
        }
        return "File " + nama + "  telah dibuat";
    }

    static String addStr(String nama, String text)
    {
       try{
            // buat + nulis
            FileWriter fill = new FileWriter(nama + ".txt", true);
            fill.write(text+"\n");
            fill.close();
        }

        catch(IOException e)
        {
            macam.write("Error");
            e.printStackTrace();
        }
        return "File " + nama + "  telah dibuat";
    }

    static void showBarang(ArrayList<ArrayList<String>> x)
    {
        try
        {
            File cari_1 = new File("barang.txt");
            File cari_2 = new File("harga.txt");
            File cari_3 = new File("stock.txt");
            Scanner a_file_1 = new Scanner(cari_1);
            Scanner a_file_2 = new Scanner(cari_2);
            Scanner a_file_3 = new Scanner(cari_3);
            // ArrayList<ArrayList<String>> x = new ArrayList<ArrayList<String>>();
            // ArrayList<String> x_item = new ArrayList<>();
            
            int a = 1;
            int b = 0;
            while (a_file_1.hasNextLine())
            {
                String data_1 = a_file_1.nextLine();
                String data_2 = a_file_2.nextLine();
                String data_3 = a_file_3.nextLine();
                macam.write(a + ". " + data_1 + " - $" + data_2 + " | Stock : " + data_3);
                a++;
                
                // masukin data ke arraylist
                x.add(new ArrayList<String>());
                x.get(b).add(data_1);
                x.get(b).add(data_2);
                x.get(b).add(data_3);
                b++;
                // x_item.add(data_1);
            }
            
            // debugging 
            // macam.write(x.get(0).get(0));
            // macam.write(x.get(0).get(1));
            // macam.write(x.get(0).get(2));
            // macam.write(x.get(1).get(0));

            a_file_1.close();
            a_file_2.close();
            a_file_3.close();
        }

        catch(IOException e)
        {
            macam.write("error");
            e.printStackTrace();
        }
    }

    static int addInt(String nama, Integer amt)
    {
        int b = 0;
       try{
            // buat + nulis
            FileWriter fill = new FileWriter(nama + ".txt", true);
            fill.write(amt+"\n");
            fill.close();
        }
        catch(IOException e)
        {
            macam.write("Error");
            e.printStackTrace();
        }

        return b;
    }

    // Delete barang
    static void itemRemove(String Filename, String Filename_2, String Filename_3, int rak)
    {
        try
        {        
            File del_1 = new File(Filename+".txt");
            File del_2 = new File(Filename_2+".txt");
            File del_3 = new File(Filename_3+".txt");
            Scanner file_1 = new Scanner(del_1);
            Scanner file_2 = new Scanner(del_2);
            Scanner file_3 = new Scanner(del_3);
            ArrayList<String> brg = new ArrayList<String>();   
            ArrayList<String> hrg = new ArrayList<String>();
            ArrayList<String> stok = new ArrayList<String>();

            while (file_1.hasNextLine())
            {    
                String item = file_1.nextLine();
                brg.add(item);
            }
            file_1.close();
            while (file_2.hasNextLine())
            {
                String price = file_2.nextLine();
                hrg.add(price);
            }
            file_2.close();
            while (file_3.hasNextLine())
            {
                String stock = file_3.nextLine();
                stok.add(stock);
            }
            file_3.close();

            brg.remove(rak-1);
            hrg.remove(rak-1);
            stok.remove(rak-1);

            FileWriter ipt = new FileWriter(Filename+".txt");
            for (int b = 0; b<brg.size();b++)
            {
                ipt.write(brg.get(b)+"\n");
            }
            ipt.close();

            FileWriter ipt_2 = new FileWriter(Filename_2+".txt");
            for (int c = 0; c<hrg.size();c++)
            {
                ipt_2.write(hrg.get(c)+"\n");;
            }
            ipt_2.close();
            FileWriter ipt_3 = new FileWriter(Filename_3+".txt");
            for (int d = 0; d<stok.size();d++)
            {
                ipt_3.write(stok.get(d)+"\n");
            }
            ipt_3.close();
        }
        catch(IOException e)
        {
            macam.write("Error");
            e.printStackTrace();
        }
    }

    static void editItem(String Filename, int rak, String editn)
    {
        try
        {
            File edit = new File(Filename+".txt");
            Scanner file_1 = new Scanner(edit);

            ArrayList<String> brg = new ArrayList<String>();
            while (file_1.hasNextLine())
            {
                String item = file_1.nextLine();
                brg.add(item);
            }
            file_1.close();
            
            brg.set(rak-1,editn);

            FileWriter ipt = new FileWriter(Filename+".txt");
            for (int b = 0; b<brg.size();b++)
            {
                ipt.write(brg.get(b)+"\n");
            }
            ipt.close();
        }
        catch (IOException e)
        {
            macam.write("Error");
            e.printStackTrace();
        }
    }

    static void editNum(String Filename, int rak, int editn)
    {
        try
        {
            File edit = new File(Filename+".txt");
            Scanner file_1 = new Scanner(edit);

            ArrayList<String> num = new ArrayList<String>();
            while (file_1.hasNextLine())
            {
                String item = file_1.nextLine();
                num.add(item);
            }
            file_1.close();
            
            String edit_1 = Integer.toString(editn);
            num.set(rak-1,edit_1);

            FileWriter ipt = new FileWriter(Filename+".txt");
            for (int b = 0; b<num.size();b++)
            {
                ipt.write(num.get(b)+"\n");
            }
            ipt.close();
        }
        catch (IOException e)
        {
            macam.write("Error");
            e.printStackTrace();
        }
    }
    
    // static void updateItem(String Filename, String Filename_2, int rak, String editn, int editp)
    // {
    //     try
    //     {        
    //         File del_1 = new File(Filename+".txt");
    //         File del_2 = new File(Filename_2+".txt");
    //         Scanner file_1 = new Scanner(del_1);
    //         Scanner file_2 = new Scanner(del_2);

    //         ArrayList<String> brg = new ArrayList<String>();   
    //         ArrayList<String> hrg = new ArrayList<String>();

    //         while (file_1.hasNextLine())
    //         {    
    //             String item = file_1.nextLine();
    //             brg.add(item);
    //         }
    //         file_1.close();
    //         while (file_2.hasNextLine())
    //         {
    //             String price = file_2.nextLine();
    //             hrg.add(price);
    //         }
    //         file_2.close();

    //         // for (int a = 0; a<brg.size(); a++)
    //         // {
    //         //     macam.write(a+". "+brg.get(a)+" - "+hrg.get(a));
    //         // }

    //         brg.set(rak-1, editn);
    //         hrg.set(rak-1, editp);

    //         FileWriter ipt = new FileWriter(Filename+".txt");
    //         for (int b = 0; b<brg.size();b++)
    //         {
    //             ipt.write(brg.get(b)+"\n");
    //         }
    //         ipt.close();

    //         FileWriter ipt_2 = new FileWriter(Filename_2+".txt");
    //         for (int c = 0; c<hrg.size();c++)
    //         {
    //             ipt_2.write(hrg.get(c)+"\n");;
    //         }
    //         ipt_2.close();

    //     }
    //     catch(IOException e)
    //     {
    //         macam.write("Error");
    //         e.printStackTrace();
    //     }
    // }

    static String strukCreate(String nama, int change, int pay, int total, ArrayList<String> cart)
    {
        try{
            FileWriter fill = new FileWriter(nama+".txt");
            fill.write("Earphone Store\n");
            fill.write("==============\n");
            for (int a = 0; a < cart.size(); a = a+3)
            {
                fill.write(cart.get(a) + " - $" + cart.get(a+1) +  " | Amount : " + cart.get(a+2) + "\n");
            }
            fill.write("--------------\n");
            fill.write("Total : $" + total + "\n");
            fill.write("Amount paid : $" + pay + "\n" );
            fill.write("--------------\n");
            fill.write("Change : $" + change + "\n");
            fill.close();
        }
        catch(IOException e)
        {
            macam.write("Error");
            e.printStackTrace();
        }
        return "File " + nama + "  telah dibuat";
    }
    
    static void updateStock(int rak, int amt)
    {
        try
        {
            File cari_1 = new File("stock.txt");
            Scanner file = new Scanner(cari_1);
            ArrayList<String> stock = new ArrayList();

            while (file.hasNextLine())
            {
                String item_stock = file.nextLine();
                stock.add(item_stock);
            }
            file.close();

            int update = Integer.parseInt(stock.get(rak-1));
            update=update-amt;
            stock.set(rak-1, Integer.toString(update));

            FileWriter ipt = new FileWriter("stock.txt");
            for (int b = 0; b<stock.size();b++)
            {
                ipt.write(stock.get(b)+"\n");
            }
            ipt.close();


        }
        catch(IOException e)
        {
            macam.write("Error");
            e.printStackTrace();
        }
    }

}
