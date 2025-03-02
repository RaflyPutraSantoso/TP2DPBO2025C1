<!-- /* 
    Saya Rafly Putra Santoso NIM 2100846 mengerjakan Tugas Praktikum 2
    dalam mata kuliah Desain Pemrograman Berorientasi Objek
    untuk keberkahanNya maka saya tidak melakukan
    kecurangan seperti yang telah dispesifikasikan
*/ -->
<?php

    //library 
    require ('Baju.php');

    // Tentukan folder tempat gambar disimpan
    $folder = 'image/';

    // Ambil semua file dari folder
    $files = scandir($folder);

        // Loop melalui setiap file
        foreach ($files as $file) {
            // Cek apakah file adalah gambar
            if ($file !== '.' && $file !== '..' && preg_match('/\.(jpg|jpeg|png|gif)$/i', $file)) {
                echo '<img src="' . $folder . $file . '" alt="Gambar" style="width: 100px; height: auto; margin: 5px;">';
            }
    }
    //instansiasi
    $baju1 = new Baju();
    $baju2 = new Baju();
    $baju3 = new Baju();
    $baju4 = new Baju();
    $baju5 = new Baju();



    // setiap indexs akan diisi dengan setter
    $baju1->setid("1");
    $baju1->setnama("makanankucingwhiskas");
    $baju1->setharga("50000");
    $baju1->setstok("30");
    $baju1->setJenis("makanan");
    $baju1->setBahan("dagingayam");
    $baju1->setwarna("merah");
    $baju1->setsize("1,5kg");
    $baju1->setmerk("whiskas");
    $baju1->setfoto("gambar1.jpg");


    $baju2->setid("2");
    $baju2->setnama("makanankucingmeow");
    $baju2->setharga("60000");
    $baju2->setstok("25");
    $baju2->setJenis("makanan");
    $baju2->setBahan("ikan");
    $baju2->setwarna("biru");
    $baju2->setsize("1,0kg");
    $baju2->setmerk("meow");
    $baju2->setfoto("gambar2.jpg");


    $baju3->setid("3");
    $baju3->setnama("makanankucingbola");
    $baju3->setharga("15000");
    $baju3->setstok("50");
    $baju3->setJenis("mainan");
    $baju3->setBahan("plastik");
    $baju3->setwarna("kuning");
    $baju3->setsize("L");
    $baju3->setmerk("kucinghappy");
    $baju3->setfoto("gambar1.jpg");

    $baju4->setid("4");
    $baju4->setnama("kandanganjing");
    $baju4->setharga("250000");
    $baju4->setstok("10");
    $baju4->setJenis("kandang");
    $baju4->setBahan("besi");
    $baju4->setwarna("hitam");
    $baju4->setsize("80x60x60");
    $baju4->setmerk("anjingaman");
    $baju4->setfoto("gambar2.jpg");


    $baju5->setid("5");
    $baju5->setnama("sabunmandikucing");
    $baju5->setharga("30000");
    $baju5->setstok("40");
    $baju5->setJenis("perawatan");
    $baju5->setBahan("ekstraklidahbuaya");
    $baju5->setwarna("hijau");
    $baju5->setsize("250ml");
    $baju5->setmerk("kucingbersih");
    $baju5->setfoto("gambar1.jpg");

    //masukan objek ke array
    $Baju = array($baju1, $baju2, $baju3, $baju4, $baju5);

    //ouput
    echo "<br> Data Produk <br>";
    //buat table
    echo "<table border = '2'>";
    echo "<tr>
            <th>ID</th>
            <th>Nama</th>
            <th>Harga </th>
            <th>Stok</th>
            <th>Jenis</th>
            <th>Bahan</th>
            <th>Warna</th>
            <th>Size</th>
            <th>Merk</th>
            <th>Foto</th>
        </tr>";

    //nampilin isi table
    for ($i = 0; $i < 5; $i++) 
{
    echo "<tr>";
    echo "<td style='padding: 10px;'>" . $Baju[$i]->getid() . "</td>";
    echo "<td style='padding: 10px;'>" . $Baju[$i]->getNama() . "</td>";
    echo "<td style='padding: 10px;'>" . $Baju[$i]->getharga() . "</td>";
    echo "<td style='padding: 10px;'>" . $Baju[$i]->getstok() . "</td>";
    echo "<td style='padding: 10px;'>" . $Baju[$i]->getJenis() . "</td>";
    echo "<td style='padding: 10px;'>" . $Baju[$i]->getbahan() . "</td>";
    echo "<td style='padding: 10px;'>" . $Baju[$i]->getwarna() . "</td>";
    echo "<td style='padding: 10px;'>" . $Baju[$i]->getsize() . "</td>";
    echo "<td style='padding: 10px;'>" . $Baju[$i]->getmerk() . "</td>";
    echo "<td style='padding: 10px;'><img src='" . $folder . $Baju[$i]->getfoto() . "' alt='Foto' style='width: 100px; height: auto;'></td>";
    
    echo "</tr>";
}
echo "</table>";
?>