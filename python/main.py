"""
    Saya Rafly Putra Santoso NIM 2100846 mengerjakan Tugas Praktikum 2
    dalam mata kuliah Desain Pemrograman Berorientasi Objek
    untuk keberkahanNya maka saya tidak melakukan
    kecurangan seperti yang telah dispesifikasikan
"""
#library
from Baju import Baju
import os

os.system('cls' if os.name == 'nt' else 'clear')

#deklarasi array
arr = []
menu = 0

#selama input bukan 3 maka
while menu != 3:
    # output
    print("+-------------------------------+")
    print("| Latihan Praktikum DPBO 2 2025 |")
    print("+-------------------------------+")
    print("| Pilihan Menu :                |")
    print("| 1. Menambahkan Data           |")
    print("| 2. Menampilkan Data           |")
    print("| 3. Keluar Dari Program        |")
    print("+-------------------------------+")

    #input user
    menu = int(input("Masukkan Pilihan Menu : "))
    
    #menu 1 untuk menambahkan data
    if menu == 1:
        os.system('cls' if os.name == 'nt' else 'clear')
        print("+------------------+")
        print("| Menambahkan Data |")
        print("+------------------+")
        # input user
        id = input("ID Product          : ")
        nama = input("Nama Product      : ")
        harga = input("Harga Product    : ")
        stok = input("Stok Product      : ")
        jenis = input("Jenis Product    : ")
        bahan = input("Bahan Product    : ")
        warna = input("Warna            : ")
        size = input("Size Product      : ")
        merk = input("Merk Product      : ")
        # instansiasi
        temp = Baju()
        #  input user dimasukkan ke temp menggunakan setter dengan masing masing atribut
        temp.set_id(id)
        temp.set_nama(nama)
        temp.set_harga(harga)
        temp.set_stok(stok)
        temp.setjenis(jenis)
        temp.setbahan(bahan)
        temp.setwarna(warna)
        temp.setsize(size)
        temp.setmerk(merk)
        # objek disatukan
        arr.append(temp)

        print("\nData berhasil ditambahkan!\n")
    
    #menu 2 untuk menampilkan data dengan tabel
    elif menu == 2:
        os.system('cls' if os.name == 'nt' else 'clear')
        # cek apakah terdapat data, kalau ada
        if len(arr) != 0:
            print("+------------------+")
            print("| Menampilkan Data |")
            print("+------------------+")

            longestid = 2 
            longestnama = 4
            longestharga = 5
            longeststok = 5
            longestjenis = 4
            longestbahan = 8
            longestwarna = 6
            longestsize = 5
            longestmerk = 11

            for i in arr:
                if len(i.getid()) > longestid:
                    longestid = len(i.getid())
                if len(i.getnama()) > longestnama:
                    longestnama = len(i.getnama())
                if len(i.getharga()) > longestharga:
                    longestharga = len(i.getharga())
                if len(i.getstok()) > longeststok:
                    longeststok = len(i.getstok())
                if len(i.getjenis()) > longestjenis:
                    longestjenis = len(i.getjenis())
                if len(i.getbahan()) > longestbahan:
                    longestbahan = len(i.getbahan())
                if len(i.getwarna()) > longestwarna:
                    longestwarna = len(i.getwarna())
                if len(i.getsize()) > longestsize:
                    longestsize = len(i.getsize())
                if len(i.getmerk()) > longestmerk:
                    longestmerk = len(i.getmerk())

            #print header table
            print(f"+-{'-' * (longestid + 1)}-+-{'-' * (longestnama + 1)}-+-{'-' * (longestharga + 1)}-+-{'-' * (longeststok + 1)}-+-{'-' * (longestjenis + 1)}-+-{'-' * (longestbahan + 1)}-+-{'-' * (longestwarna + 1)}-+-{'-' * (longestsize + 1)}-+-{'-' * (longestmerk+ 1)}-+")
            print("| ID ", "| Nama", " " * (longestnama - 4), "| Harga", " " * (longestharga - 5), "| Stok", " " * (longeststok - 5), "| Jenis", " " * (longestjenis - 4), "| Bahan", " " * (longestbahan - 8), "| Warna", " " * (longestwarna - 6), "| Size", " " * (longestsize - 5), "| Merk", " " * (longestmerk - 11), "|")
            print(f"+-{'-' * (longestid + 1)}-+-{'-' * (longestnama + 1)}-+-{'-' * (longestharga + 1)}-+-{'-' * (longeststok + 1)}-+-{'-' * (longestjenis + 1)}-+-{'-' * (longestbahan + 1)}-+-{'-' * (longestwarna + 1)}-+-{'-' * (longestsize + 1)}-+-{'-' * (longestmerk+ 1)}-+")

            #print isi tabel
            for i in arr:
                 if int(i.getid()) < 10:
                    print(
                        f"| {i.getid()}", " " * (longestid - len(i.getid())),
                        f"| {i.getnama()}", " " * (longestnama - len(i.getnama())),
                        f"| {i.getharga()}", " " * (longestharga - len(i.getharga())), 
                        f"| {i.getstok()}", " " * (longeststok - len(i.getstok())),
                        f"| {i.getjenis()}", " " * (longestjenis - len(i.getjenis())), 
                        f"| {i.getbahan()}", " " * (longestbahan - len(i.getbahan())), 
                        f"| {i.getwarna()}", " " * (longestwarna - len(i.getwarna())), 
                        f"| {i.getsize()}", " " * (longestsize - len(i.getsize())), 
                        f"| {i.getmerk()}", " " * (longestmerk - len(i.getmerk())),
                        "|"
                    )
                
                 elif int(i.getId()) >= 10 and int(i.getId()) < 1000:
                    print(
                        f"| {i.getId()} ",
                        f"| {i.getnama()}", " " * (longestnama - len(i.getnama())),
                        f"| {i.getharga()}", " " * (longestharga - len(i.getharga())), 
                        f"| {i.getstok()}", " " * (longeststok - len(i.getstok())),
                        f"| {i.getjenis()}", " " * (longestjenis - len(i.getjenis())), 
                        f"| {i.getbahan()}", " " * (longestbahan - len(i.getbahan())), 
                        f"| {i.getwarna()}", " " * (longestwarna - len(i.getwarna())), 
                        f"| {i.getwarna()}", " " * (longestwarna - len(i.getwarna())), 
                        f"| {i.getmerk()}", " " * (longestmerk - len(i.getmerk())),
                        "|"
                    )

            #garis paling bawah
            print(f"+-{'-' * (longestid + 1)}-+-{'-' * (longestnama + 1)}-+-{'-' * (longestharga + 1)}-+-{'-' * (longeststok + 1)}-+-{'-' * (longestjenis + 1)}-+-{'-' * (longestbahan + 1)}-+-{'-' * (longestwarna + 1)}-+-{'-' * (longestsize + 1)}-+-{'-' * (longestmerk+ 1)}-+") 

        #kalau data kosong
        else:
            print("\nData Masih kosong!\n")