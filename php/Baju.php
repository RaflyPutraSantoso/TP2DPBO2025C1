<?php
//library
require('Aksesoris.php');

//deklarasi class Baju yang menjadi anak class Aksesoris
class Baju extends Aksesoris
{
     //private atribut
     private $size;
     private $merk;
     
     
     //constructor
     public function __construct($size = '', $merk = '')
     {
         $this->size = $size;
         $this->merk = $merk;
     }
 
     //setter
     public function setsize($size)
     {
         $this->size = $size;
     }
     public function setmerk($merk)
     {
         $this->merk = $merk;
     }
     
     
     //getter
     public function getsize()
     {
         return $this->size;
     }
     public function getmerk()
     {
         return $this->merk;
     }
     
     
}
?>
