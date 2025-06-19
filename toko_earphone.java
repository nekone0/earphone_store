import java.util.*;

public class toko_earphone {
    static ArrayList<String> toko = new ArrayList<String>();
    static ArrayList<Integer> price = new ArrayList<Integer>();

    static Scanner a = new Scanner(System.in);

    public static void list()
    {
        macam.write("Inventory\n---------------");
        if (toko.size() == 0)
        {
            macam.write("Kosong");
        }
        else
        {
            for (int a = 0; a < toko.size(); a++)
            {
                macam.write((a+1)+ ". " + toko.get(a) + " - " + price.get(a));
            }
        }
        macam.write("---------------");
    }
    public static void main(String[] args)
    {
        while (true)
        {
            macam.clear();
            macam.write("Please log in\n1. Owner\n2. Customer");
            int user = macam.inputInt("");

            if (user == 1)
            {
                while (true)
                {
                    macam.clear();
                    macam.write("Welcome\n1. Add\n2. Update\n3. See List\n4. Remove\n5. Back");
                    int act1 = macam.inputInt("Pick an action : ");
                    if (act1 == 1)
                    {
                        macam.lanjut();
                        while (true)
                        {
                            toko.add(macam.inputString("Nama earphone : "));
                            int harga = macam.inputInt("Masukan harga : ");
                            price.add(harga);
                            int act2 = macam.inputInt("1. Continue\n2. Exit");
                            if (act2 == 1)
                            {
                                macam.lanjut();
                                continue;
                            }
                            else if (act2 == 2)
                            {
                                break;
                            }
                        }
                        
                    }
                    else if (act1 == 2)
                    {
                        macam.lanjut();
                        while (true)
                        {
                            macam.clear();
                            list();
                            macam.write("1. Ganti item\n2. Ganti harga");
                            int act2 = macam.inputInt("");
                            if (act2 == 1)
                            {
                                int rak = macam.inputInt("Pilih rak yang akan diganti : ");
                                macam.lanjut();
                                String editn = macam.inputString("Input nama baru : ");
                                toko.set(rak-1, editn);
                                int editp = macam.inputInt("Input harga baru");
                                price.set(rak-1, editp);
                                int act3 = macam.inputInt("1. Continue\n2. Exit");
                                if (act3 == 1)
                                {
                                    continue;
                                }
                                else if (act3 == 2)
                                {
                                    break;
                                }
                            }
                            else if (act2 == 2)
                            {
                                int rak = macam.inputInt("Pilih rak yang akan diganti : ");
                                int editp = macam.inputInt("Input harga baru");
                                price.set(rak-1, editp);
                                int act3 = macam.inputInt("1. Continue\n2. Exit");
                                if (act3 == 1)
                                {
                                    continue;
                                }
                                else if (act3 == 2)
                                {
                                    break;
                                }
                            }
                        }
                        
                    }
                    else if (act1 == 3)
                    {
                        while (true)
                        {
                            macam.clear();
                            list();
                            macam.write("1. Exit");
                            int act2 = macam.inputInt("Press 1 to exit");
                            if (act2 == 1)
                            {
                                break;
                            }
                        }
                    }

                    else if (act1 == 4)
                    {
                        while (true)
                        {
                            macam.clear();
                            list();
                            int rak = macam.inputInt("Pilih rak yang akan dihilangkan : ");
                            toko.remove(rak-1);
                            price.remove(rak-1);
                            int act2 = macam.inputInt("1. Continue\n2. Exit");
                            if (act2 == 1)
                            {
                                continue;
                            }
                            else if (act2 == 2)
                            {
                                break;
                            }
                        }
                    }

                    else if (act1 == 5)
                    {
                        break;
                    }
                }
            }

            else if (user == 2)
            {
                int atm = 0;
                while (true)
                {
                    macam.write("Welcome\n1. ATM\n2. Shop\n3. Back");
                    int act1 = macam.inputInt("Pick an action : ");

                    if (act1 == 1)
                    {
                        while (true)
                        {
                            macam.clear();
                            macam.write("Money : $" + atm);
                            macam.write("Pick an amount you want to add\n1. $10\n2. $20\n3. $50\n4. $100\n5. $1000\n6. Back");
                            int addm = macam.inputInt("");
                            if (addm == 1)
                            {
                                atm = atm + 10;
                            }
                            else if (addm == 2)
                            {
                                atm = atm + 20;
                            }
                            else if (addm == 3)
                            {
                                atm = atm + 50;
                            }
                            else if (addm == 4)
                            {
                                atm = atm + 100;
                            }
                            else if (addm == 5)
                            {
                                atm = atm + 1000;
                            }
                            else if (addm == 6)
                            {
                                break;
                            }
                        }
                    }

                    else if (act1 == 2)
                    {
                        while (true)
                        {
                            macam.clear();
                            macam.write("Money : $"+atm);
                            macam.write("Welcome to the shop\n----------");
                            macam.write("1. Buy\n2. Exit");
                            int act2 = macam.inputInt("Pick an action : ");
                            if (act2 == 1)
                            {
                                while (true)
                                {
                                    macam.clear();
                                    macam.write("Money : $"+atm);
                                    list();
                                    int rak = macam.inputInt("Pilih rak yang akan dibeli : ");
                                    atm = atm - price.get(rak-1);
                                    int act3 = macam.inputInt("1. Continue\n2. Exit");
                                    if (act3 == 1)
                                    {
                                        continue;
                                    }
                                    else if (act3 == 2)
                                    {
                                        break;
                                    }
                                }
                            }
                            else if (act2 == 2)
                            {
                                break;
                            }                           
                        }
                    }

                    else if (act1 == 3)
                    {
                        break;
                    }
                }
                


            }
        }
        
    }
}
