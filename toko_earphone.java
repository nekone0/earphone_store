import java.util.*;

public class toko_earphone {
    static ArrayList<String> cart = new ArrayList<String>();
    static ArrayList<ArrayList<String>> x = new ArrayList<ArrayList<String>>();

    static Scanner a = new Scanner(System.in);
    static int b = 0;

    public static void cart(int total)
    {
        macam.write("Cart\n-------------------");
        if (cart.size() == 0)
        {
            macam.write("Kosong");
        }
        else
        {
            int i = 1;
            for (int a = 0; a < cart.size(); a = a+3)
            {
                macam.write((i) + ". " + cart.get(a) + " - $" + cart.get(a+1) + " | Amount : " + cart.get(a+2));
                i++;
            }
            macam.write("Total : $" + total);
            b = b + total;
        }
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
                            // toko.add(macam.inputString("Nama earphone : "));
                            String item = macam.inputString("Nama earphone : ");
                            macam.addStr("barang", item);
                            int harga = macam.inputInt("Harga : ");
                            macam.addInt("harga", harga);
                            int qty = macam.inputInt("Jumlah barang : ");
                            macam.addInt("stock", qty);
                            int act2 = macam.inputInt("1. Continue\n2. Exit");
                            if (act2 == 1)
                            {
                                macam.lanjut();
                                macam.clear();
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
                            macam.showBarang(x);
                            macam.write("1. Ganti item\n2. Ganti harga\n3. Ganti stok");
                            int act2 = macam.inputInt("");
                            if (act2 == 1)
                            {
                                int rak = macam.inputInt("Pilih rak yang akan diganti : ");
                                macam.lanjut();
                                String editn = macam.inputString("Input nama baru : ");
                                macam.editItem("barang", rak, editn);
                                int editp = macam.inputInt("Input harga baru : ");
                                macam.editNum("harga", rak, editp);
                                int edits = macam.inputInt("Input stok baru : ");
                                macam.editNum("stock", rak, edits);
                                int act3 = macam.inputInt("1. Continue\n2. Exit");
                                if (act3 == 1)
                                {
                                    macam.clear();
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
                                macam.editNum("harga", rak, editp);
                                int act3 = macam.inputInt("1. Continue\n2. Exit");
                                if (act3 == 1)
                                {
                                    macam.clear();
                                    continue;
                                }
                                else if (act3 == 2)
                                {
                                    break;
                                }
                            }
                            else if (act2 == 3)
                            {
                                int rak = macam.inputInt("Pilih rak yang akan diganti : ");
                                int edits = macam.inputInt("Input stok baru");
                                macam.editNum("stock", rak, edits);
                                int act3 = macam.inputInt("1. Continue\n2. Exit");
                                if (act3 == 1)
                                {
                                    macam.clear();
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
                            // list();
                            macam.showBarang(x);
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
                            macam.showBarang(x);
                            int rak = macam.inputInt("Pilih rak yang akan dihilangkan : ");
                            macam.itemRemove("barang","harga", "stock", rak);
                            int act2 = macam.inputInt("1. Continue\n2. Exit");
                            if (act2 == 1)
                            {
                                macam.clear();
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
                int total = 0;
                while (true)
                {
                    macam.clear();
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
                            macam.write("1. Buy\n2. See cart\n3. Exit");
                            int act2 = macam.inputInt("Pick an action : ");
                            if (act2 == 1)
                            {
                                while (true)
                                {
                                    macam.clear();
                                    macam.write("Money : $"+atm);
                                    macam.showBarang(x);
                                    int rak = macam.inputInt("Pilih rak yang akan dibeli : ");
                                    int amt = macam.inputInt("Masukkan jumlah barang : ");
                                    int byr = Integer.parseInt(x.get(rak-1).get(1));
                                    
                                    int available = Integer.parseInt(x.get(rak-1).get(2));
                                    if (available == 0)
                                    {
                                        macam.write("Maaf, barang ini kosong!");
                                        macam.timer(3);
                                        break;
                                    }
                                    else if (available < amt)
                                    {
                                        macam.write("Maaf, stock tidak cukup!");
                                        macam.timer(3);
                                        break;
                                    }
                                    macam.updateStock(rak, amt);
                                    macam.writenum(byr);
                                    total = total + byr*amt;
                                    cart.add(x.get(rak-1).get(0));
                                    cart.add(x.get(rak-1).get(1));
                                    cart.add(Integer.toString(amt));
                                    cart(total);

                                    int act3 = macam.inputInt("1. Continue\n2. Checkout\n3. Exit");
                                    if (act3 == 1)
                                    {
                                        macam.clear();
                                        continue;
                                    }
                                    else if (act3 == 2)
                                    {
                                        macam.write("Money : "+ atm);
                                        int pay = macam.inputInt("Input the amount you want to pay : ");
                                        if (atm >= pay)
                                        {
                                            atm = atm - pay;
                                            if (pay >= total)
                                            {
                                                macam.clear();
                                                int change = pay - total;
                                                macam.write("Thank you");
                                                cart(total);
                                                macam.write("---------------");
                                                macam.write("Change : $" + change);
                                                atm = atm + change;
                                                macam.strukCreate("struk", change, pay, total, cart);
                                                macam.timer(5);
                                                cart.clear();
                                                total = 0;
                                                change = 0;
                                                break;
                                            }
                                            else 
                                            {
                                                macam.write("You do not have enough money!");
                                                macam.timer(3);
                                                break;
                                            }
                                        }
                                        else
                                        {
                                            macam.write("You do not have enough money!");
                                            macam.timer(3);
                                            break;
                                        }
                                    }
                                    else if (act3 == 3)
                                    {
                                        break;
                                    }
                                }
                            }
                            else if (act2 == 2)
                            {
                                macam.clear();
                                cart(total);
                                int act3 = macam.inputInt("1. Chechout\n2. Back");
                                if (act3 == 1)
                                {
                                    macam.write("Money : "+ atm);
                                    int pay = macam.inputInt("Input the amount you want to pay : ");
                                    if (atm >= pay)
                                    {
                                        atm = atm - pay;
                                        if (pay >= total)
                                        {

                                            macam.clear();
                                            int change = pay - total;
                                            macam.write("Thankyou");
                                            cart(total);
                                            macam.write("---------------");
                                            macam.write("Change : $" + change);
                                            atm = atm + change;
                                            macam.strukCreate("struk", change, pay, total, cart);
                                            macam.timer(5);
                                            total = 0;
                                            change = 0;
                                            cart.clear();
                                        }
                                        else 
                                        {
                                            macam.write("You do not have enough money!");
                                            macam.timer(3);
                                            break;
                                        }
                                    }
                                    else
                                    {
                                        macam.write("You do not have enough money!");
                                        macam.timer(3);
                                        break;
                                    }
                                }
                                else if (act3 == 2)
                                {
                                    break;
                                }
                            }
                            else if (act2 == 3)
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
