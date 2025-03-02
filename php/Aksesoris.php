<?php

//library
require('PetShop.php');

//deklarasi class Aksesoris yang menjadi anak class PetShop
class Aksesoris extends PetShop
{
     //private atribut
     private $jenis;
     private $bahan;
     private $warna;
     
     //constructor
     public function __construct($jenis = '', $bahan = '', $warna = '')
     {
         $this->jenis = $jenis;
         $this->bahan = $bahan;
         $this->warna = $warna;
     }
 
     //setter
     public function setJenis($jenis)
     {
         $this->jenis = $jenis;
     }
     public function setBahan($bahan)
     {
         $this->bahan = $bahan;
     }
     public function setwarna($warna)
     {
         $this->warna = $warna;
     }
     
     //getter
     public function getJenis()
     {
         return $this->jenis;
     }
     public function getbahan()
     {
         return $this->bahan;
     }
     public function getwarna()
     {
         return $this->warna;
     }
     
}
?>
?>