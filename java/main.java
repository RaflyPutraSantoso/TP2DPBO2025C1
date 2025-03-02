//library
import java.util.ArrayList;
import java.util.Scanner;
//deklarasi class
public class main 
{
    public static void main(String[] args) 
    {
        //deklarasi array
        ArrayList<Baju> list = new ArrayList<>();
        //instansiasi n inisialisasi
        int menu = 0;
        String id = "", nama = "", harga = "", stok = "", jenis = "", bahan = "", warna = "", size = "", merk = "";
        Scanner scanner = new Scanner(System.in);
        //looping
        do {
            //output pilihan menu
            System.out.println("+-------------------------------+");
            System.out.println("| Latihan Praktikum DPBO 2 2025 |");
            System.out.println("+-------------------------------+");
            System.out.println("Pilihan Menu :");
            System.out.println("1. Menambahkan Data");
            System.out.println("2. Menampilkan Data");
            System.out.println("3. Keluar Dari Program");
            //input user
            System.out.print("\nMasukkan menu pilihan : ");
            try 
            {
                menu = scanner.nextInt();    
            }
            catch (Exception e) 
            {
                System.out.println("Input tidak sesuai!");
            }
            //switch case
            switch (menu) 
            {
                //case 1 untuk menambahkan data
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    //input user
                    System.out.println("+------------------+");
                    System.out.println("| Menambahkan Data |");
                    System.out.println("+------------------+");

                    System.out.print("ID : ");
                    try 
                    {
                        id = scanner.next();    
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("nama : ");
                    try 
                    {
                       nama = scanner.next();    
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("harga : ");
                    try 
                    {
                       harga = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("stok : ");
                    try 
                    {
                        stok = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("jenis : ");
                    try 
                    {
                        jenis = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("bahan : ");
                    try 
                    {
                        bahan = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("warna : ");
                    try 
                    {
                        warna = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("size : ");
                    try 
                    {
                        size = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }

                    System.out.print("merk : ");
                    try 
                    {
                        merk = scanner.next();     
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Input tidak sesuai!");
                    }
                    //instansiasi
                    Baju temp = new Baju();
                    //input user dimasukkan ke temp menggunakan setter dengan masing masing atribut
                    temp.setId(id);
                    temp.setnama(nama);
                    temp.setharga(harga);
                    temp.setstok(stok);
                    temp.setjenis(jenis);
                    temp.setbahan(bahan);
                    temp.setwarna(warna);
                    temp.setsize(size);
                    temp.setmerk(merk);
                    //objek dimasukkan ke list
                    list.add(temp);

                    System.out.println("\n Data Berhasil Ditambahkan!");
                    break;
                    //case 2 untuk menampilkan data
                    case 2:
                    //untuk check apakah data kosonng atau tidak
                    boolean isEmpty = list.isEmpty();
                    if (isEmpty == true) 
                    {
                        System.out.println("Data Masih Kosong!");
                    }
                    else
                    {
                        //penanda kata terpanjang
                        int longestId = 2, longestnama = 4, longestharga = 5, longeststok = 5;
                        int longestjenis = 4, longestbahan = 8, longestwarna = 6;
                        int longestsize = 5, longestmerk = 6;
                        //mencari kata terpanjang
                        for (int i = 0; i < list.size(); i++) 
                        {
                            if (list.get(i).getId().length() > longestId) 
                            {
                                longestId = list.get(i).getId().length();
                            }
                            if (list.get(i).getnama().length() > longestnama) 
                            {
                                longestnama = list.get(i).getnama().length();
                            }
                            if (list.get(i).getharga().length() > longestharga) 
                            {
                                longestharga = list.get(i).getharga().length();
                            }
                            if (list.get(i).getstok().length() > longeststok) 
                            {
                                longeststok = list.get(i).getstok().length();
                            }
                            if (list.get(i).getjenis().length() > longestjenis) 
                            {
                                longestjenis = list.get(i).getjenis().length();
                            }
                            if (list.get(i).getbahan().length() > longestbahan) 
                            {
                                longestbahan = list.get(i).getbahan().length();
                            }
                            if (list.get(i).getwarna().length() > longestwarna) 
                            {
                                longestwarna = list.get(i).getwarna().length();
                            }
                            if (list.get(i).getsize().length() > longestsize) 
                            {
                                longestsize = list.get(i).getsize().length();
                            }
                            if (list.get(i).getmerk().length() > longestmerk) 
                            {
                                longestmerk = list.get(i).getmerk().length();
                            }
                        }
                        System.out.println("+------------------+");
                        System.out.println("| Menampilkan Data |");
                        System.out.println("+------------------+");
                        //garis tabel
                        // ================================//
                        System.out.print("+-");
                        for (int i = 0; i < longestId; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestnama; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestharga; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longeststok; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestjenis; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestbahan; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestwarna; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestsize; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestmerk; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.println("-+");
                    
                        //kolom
                        // ================================//
                        System.out.print("| ID");
                        for (int i = 0; i < longestId - 1; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print("| nama");
                        for (int i = 0; i < longestnama - 4; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | harga");
                        for (int i = 0; i < longestharga - 5; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | stok");
                        for (int i = 0; i < longeststok - 5; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | jenis");
                        for (int i = 0; i < longestjenis - 4; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | bahan");
                        for (int i = 0; i < longestbahan - 8; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | Gender");
                        for (int i = 0; i < longestwarna - 6; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | size");
                        for (int i = 0; i < longestsize - 5; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.print(" | merk");
                        for (int i = 0; i < longestmerk - 5; i++) 
                        {
                            System.out.print(" ");    
                        }
                        System.out.println(" |");

                        //garis lagi
                        // ================================//
                        System.out.print("+-");
                        for (int i = 0; i < longestId; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestnama; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestharga; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longeststok; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestjenis; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestbahan; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestwarna; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestsize; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestmerk; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.println("-+");

                        //print isi tabel
                        // ================================//
                        for (int i = 0; i < list.size(); i++) 
                        {
                            System.out.print("| " + list.get(i).getId());
                            for (int j = 0; j < longestId - list.get(i).getId().length(); j++) 
                            {
                                System.out.print(" ");    
                            }

                            System.out.print(" | " + list.get(i).getnama());
                            for (int j = 0; j < longestnama - list.get(i).getnama().length(); j++)  
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getharga());
                            for (int j = 0; j < longestharga - list.get(i).getharga().length(); j++) 
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getstok());
                            for (int j = 0; j < longeststok - list.get(i).getstok().length(); j++) 
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getjenis());
                            for (int j = 0; j < longestjenis - list.get(i).getjenis().length(); j++) 
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getbahan());
                            for (int j = 0; j < longestbahan - list.get(i).getbahan().length(); j++) 
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getwarna());
                            for (int j = 0; j < longestwarna - list.get(i).getwarna().length(); j++) 
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getsize());
                            for (int j = 0; j < longestsize - list.get(i).getsize().length(); j++) 
                            {
                                System.out.print(" ");    
                            }
                            System.out.print(" | " + list.get(i).getmerk());
                            for (int j = 0; j < longestmerk - list.get(i).getmerk().length(); j++) 
                            {
                                System.out.print(" "); 
                            }
                            System.out.println(" |");
                        }
                        //garis
                        // ================================//
                        System.out.print("+-");
                        for (int i = 0; i < longestId; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestnama; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestharga; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longeststok; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestjenis; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestbahan; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestwarna; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestsize; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.print("-+-");
                        for (int i = 0; i < longestmerk; i++) 
                        {
                            System.out.print("-");    
                        }
                        System.out.println("-+");
                    }
                default:
                    break;
            }
            //keluar program jika pilihan 3
        } while (menu != 3);
        scanner.close();
    }
}