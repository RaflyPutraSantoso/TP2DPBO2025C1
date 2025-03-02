# TP2DPBO2025C1
## Janji

Saya Rafly Putra Santoso NIM 2100846 tugas praktikum 2
dalam mata kuliah Desain Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan
kecurangan seperti yang telah dispesifikasikan
Aamiin.

## Soal

Melanjutkan kondisi class pada TP1

Soal

Buatlah kode program berbasis OOP yang menggunakan bahasa pemrograman CPP, Java, Python, dan PHP dengan konsep multi-level inheritance maka hanya akan ada 3 level class dan terdapat 3 class. Secara dasar, classnya yaitu:

PetShop: id, nama_produk, harga_produk, stok_produk, foto_produk
Aksesoris: jenis, bahan, warna (child dari PetShop)
Baju: untuk, size, merk (child dari Aksesoris)
Notes

Boleh menambahkan atribut baru (TIDAK BOLEH MENAMBAHKAN CLASS BARU)
Atribut foto_produk KHUSUS BAHASA PHP
Khusus JAVA tidak usah upload file .class cukup .java saja
Sertakan design diagram yang merepresentasikan hubungan/relasi antar class
README.md cukup 1 yang berisi: janji, penjelasan atribut dan methods, penjelasan alur program, dan dokumentasi boleh diletakkan di sini juga kalau mau 
CPP, Java, Python wajib dapat menerima inputan user, khusus PHP boleh hardcode atau jika mau interaktif menerima actions pada website juga boleh kalau mau (gak ada bonus)
Kode tidak wajib diberikan komentar, yang wajib adalah penjelasan SECARA LENGKAP pada README.md


## Diagram
terdiri dari 3 class yaitu : 
**Petshop**
**Aksesoris (child dari PetShop)**
**Baju (child dari Aksesoris)**

Didalam class **PetShop** memiliki 5 Atribut, yaitu : 
* Id 
* Nama
* Harga
* Stok
* Foto
  
Didalam class **Aksesoris** memiliki 3 Atribut, yaitu : 
* Jenis
* Bahan
* Warna

Didalam class **Baju** memiliki 2 Atribut, yaitu : 
* Size
* Merk

  
## Penjelasan 

Untuk dokumentasi menggunakan screenshot yang sudah tersedia di masing-masing folder bahasa.

Lalu untuk alur program : <br>

1. Compile file sesuai bahasa
2. Run programnya
3. Ketika program berhasil dijalankan, maka akan keluar sebuah menu yang berisi 3 pilihan yaitu:
   - menambahkan data : untuk menambahkan data product
   - menampilkan data : untuk menampilkan keseluruhan isi data dengan table
   - keluar dari program
4. Semua bahasa sudah menggunakan alur yang ke-3 kecuali PHP karna di Hardcoded
