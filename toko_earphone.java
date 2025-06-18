import java.util.*;

public class toko_earphone {
    static ArrayList<String> toko = new ArrayList<String>();
    static ArrayList<Integer> price = new ArrayList<Integer>();
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
                        while (true)
                        {
                            // macam.clear();
                            // int harga = macam.inputInt("Masukan harga : ");
                            // price.add(harga);
                            String name = macam.inputString("Nama earphone : ");
                            toko.add(name);
                            
                            // macam.lanjut();
                            macam.write(toko.get(0));
                            // int act2 = macam.inputInt("1. Continue\n2. Exit");
                            // if (act2 == 1)
                            // {
                            //     continue;
                            // }
                            // else if (act2 == 2)
                            // {
                            //     break;
                            // }
                        }
                        
                    }
                    else if (act1 == 2)
                    {
                        while (true)
                        {
                            macam.clear();
                            macam.write("1. Ganti item\n2. Ganti harga");
                            int act2 = macam.inputInt("");
                            if (act2 == 1)
                            {
                                int rak = macam.inputInt("Pilih rak yang akan diganti : ");
                                String editn = macam.inputString("Input nama baru : ");
                                toko.set(rak, editn);
                                macam.lanjut();
                                int editp = macam.inputInt("Input harga baru");
                                price.set(rak, editp);
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
                                price.set(rak, editp);
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
                            macam.write("Inventory\n---------------");
                            for (int a = 0; a < toko.size(); a++)
                            {
                                macam.write((a+1)+ ". " + toko.get(a) + " - " + price.get(a));
                            }
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
                            int rak = macam.inputInt("Pilih rak yang akan dihilangkan : ");
                            toko.remove(rak);
                            price.remove(rak);
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
        }
        
    }
}
