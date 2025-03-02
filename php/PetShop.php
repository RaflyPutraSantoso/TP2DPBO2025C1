<?php
//deklarasi class
class PetShop
{
    //private atribut
    private $id;
    private $nama;
    private $harga;
    private $stok;
    private $foto;

    //constructor
    public function __construct($id = '', $nama = '', $harga = '', $stok = '',$foto = '')
    {
        $this->id = $id;
        $this->nama = $nama;
        $this->harga = $harga;
        $this->stok = $stok;
        $this->foto = $foto;
    }

    //setter
    public function setid($id)
    {
        $this->id = $id;
    }
    public function setnama($nama)
    {
        $this->nama = $nama;
    }
    public function setharga($harga)
    {
        $this->harga = $harga;
    }
    public function setstok($stok)
    {
        $this->stok = $stok;
    }
    public function setfoto($foto)
    {
        $this->foto = $foto;
    }

    //getter
    public function getid()
    {
        return $this->id;
    }
    public function getnama()
    {
        return $this->nama;
    }
    public function getharga()
    {
        return $this->harga;
    }
    public function getstok()
    {
        return $this->stok;
    }
    public function getfoto()
    {
        return $this->foto;
    }
}
?>