/*
    Saya Rafly Putra Santoso NIM 2100846 mengerjakan Tugas Praktikum 2
    dalam mata kuliah Desain Pemrograman Berorientasi Objek
    untuk keberkahanNya maka saya tidak melakukan
    kecurangan seperti yang telah dispesifikasikan
*/
#include <iostream>
#include <string>
#include <list>
#include "Baju.cpp"

using namespace std;

int main()
{
    // list
    list<Baju> llist;
    // instansiasi
    Baju temp;
    int menu = 0;
    string id, nama, harga, stok, jenis, bahan, warna, size, merk;

    do
    {
        // output awal
        cout << "+-------------------------------+" << endl;
        cout << "| Tugas Praktikum DPBO 2 2025 |" << endl;
        cout << "+-------------------------------+" << endl;
        cout << "| Pilihan Menu :                |" << endl;
        cout << "| 1. Menambahkan Data           |" << endl;
        cout << "| 2. Menampilkan Data           |" << endl;
        cout << "| 3. Keluar Dari Program        |" << endl;
        cout << "+-------------------------------+" << endl;
        cout << "\n";
        // input user untuk pilihan menu
        cout << "Masukkan menu pilihan : ";
        cin >> menu;

        switch (menu)
        {
        // case 1 untuk menambahkan data
        case 1:
            system("cls");
            cout << "+------------------+" << endl;
            cout << "| Menambahkan data |" << endl;
            cout << "+------------------+" << endl;
            // input user
            cout << "ID Product          : ";
            cin >> id;
            cout << "Name Product        : ";
            cin >> nama;
            cout << "Harga Product       : ";
            cin >> harga;
            cout << "Stok Product        : ";
            cin >> stok;
            cout << "Jenis Product       : ";
            cin >> jenis;
            cout << "Bahan Product       : ";
            cin >> bahan;
            cout << "Warna               : ";
            cin >> warna;
            cout << "Size Product        : ";
            cin >> size;
            cout << "Merk Product        : ";
            cin >> merk;

            // input user dimasukkan ke temp menggunakan setter dengan masing masing atribut
            temp.setId(id);
            temp.setnama(nama);
            temp.setharga(harga);
            temp.setstok(stok);
            temp.setJenis(jenis); 
            temp.setBahan(bahan); 
            temp.setWarna(warna); 
            temp.setSize(size);   
            temp.setMerk(merk);   

            llist.push_back(temp);

            cout << "\nData berhasil ditambahkan!" << endl;
            break;

        case 2:
            system("cls");
            // cek apakah list kosong apa ngga
            if (llist.empty())
            {
                cout << "\n Data Masih Kosong!" << endl;
            }
 
            else
            {
                
                int longestId = 2, longestNama = 4, longestharga = 5, longeststok = 5;
                int longestjenis = 4, longestbahan = 8, longestwarna = 6;
                int longestsize = 5, longestmerk = 11;

               
                for (list<Baju>::iterator it = llist.begin(); it != llist.end(); it++)
                {
                    if (it->getId().length() > longestId)
                    {
                        longestId = it->getId().length();
                    }
                    if (it->getnama().length() > longestNama)
                    {
                        longestNama = it->getnama().length();
                    }
                    if (it->getHarga().length() > longestharga)
                    {
                        longestharga = it->getHarga().length();
                    }
                    if (it->getStok().length() > longeststok)
                    {
                        longeststok = it->getStok().length();
                    }
                    if (it->getJenis().length() > longestjenis) 
                    {
                        longestjenis = it->getJenis().length(); 
                    }
                    if (it->getBahan().length() > longestbahan) 
                    {
                        longestbahan = it->getBahan().length(); 
                    }
                    if (it->getWarna().length() > longestwarna) 
                    {
                        longestwarna = it->getWarna().length(); 
                    }
                    if (it->getSize().length() > longestsize) 
                    {
                        longestsize = it->getSize().length(); 
                    }
                    if (it->getMerk().length() > longestmerk) 
                    {
                        longestmerk = it->getMerk().length(); 
                    }
                }

                cout << "+------------------+" << endl;
                cout << "| Menampilkan Data |" << endl;
                cout << "+------------------+" << endl;

                // Garis tabel
                cout << "+-";
                for (int i = 0; i < longestId; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestNama; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestharga; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longeststok; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestjenis; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestbahan; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestwarna; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestsize; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestmerk; i++)
                {
                    cout << "-";
                }
                cout << "-+" << endl;

                // Kolom
                cout << "| ID";
                for (int i = 0; i < longestId - 1; i++)
                {
                    cout << " ";
                }
                cout << "| Nama";
                for (int i = 0; i < longestNama - 4; i++)
                {
                    cout << " ";
                }
                cout << " | Harga";
                for (int i = 0; i < longestharga - 5; i++)
                {
                    cout << " ";
                }
                cout << " | Stok";
                for (int i = 0; i < longeststok - 5; i++)
                {
                    cout << " ";
                }
                cout << " | Jenis";
                for (int i = 0; i < longestjenis - 4; i++)
                {
                    cout << " ";
                }
                cout << " | Bahan";
                for (int i = 0; i < longestbahan - 8; i++)
                {
                    cout << " ";
                }
                cout << " | Warna";
                for (int i = 0; i < longestwarna - 6; i++)
                {
                    cout << " ";
                }
                cout << " | Size";
                for (int i = 0; i < longestsize - 5; i++)
                {
                    cout << " ";
                }
                cout << " | Merk";
                for (int i = 0; i < longestmerk - 11; i++)
                {
                    cout << " ";
                }
                cout << " |" << endl;

                // Garis tabel
                cout << "+-";
                for (int i = 0; i < longestId; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestNama; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestharga; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longeststok; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestjenis; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestbahan; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestwarna; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestsize; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestmerk; i++)
                {
                    cout << "-";
                }
                cout << "-+" << endl;

                // Isi tabel
                for (list<Baju>::iterator it = llist.begin(); it != llist.end(); it++)
                {
                    cout << "| " << it->getId();
                    for (int j = 0; j < longestId - it->getId().length(); j++)
                    {
                        cout << " ";
                    }

                    cout << " | " << it->getnama();
                    for (int j = 0; j < longestNama - it->getnama().length(); j++)
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getHarga();
                    for (int j = 0; j < longestharga - it->getHarga().length(); j++)
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getStok();
                    for (int j = 0; j < longeststok - it->getStok().length(); j++)
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getJenis(); 
                    for (int j = 0; j < longestjenis - it->getJenis().length(); j++) 
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getBahan(); 
                    for (int j = 0; j < longestbahan - it->getBahan().length(); j++) 
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getWarna(); 
                    for (int j = 0; j < longestwarna - it->getWarna().length(); j++) 
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getSize(); 
                    for (int j = 0; j < longestsize - it->getSize().length(); j++) 
                    {
                        cout << " ";
                    }
                    cout << " | " << it->getMerk(); 
                    for (int j = 0; j < longestmerk - it->getMerk().length(); j++) 
                    {
                        cout << " ";
                    }
                    cout << " |" << endl;
                }

                // Garis tabel
                cout << "+-";
                for (int i = 0; i < longestId; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestNama; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestharga; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longeststok; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestjenis; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestbahan; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestwarna; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestsize; i++)
                {
                    cout << "-";
                }
                cout << "-+-";
                for (int i = 0; i < longestmerk; i++)
                {
                    cout << "-";
                }
                cout << "-+" << endl;
            }
            break; 
        }
    } while (menu != 3); // case 3 ya keluar looping dan program berhenti

    return 0;
}