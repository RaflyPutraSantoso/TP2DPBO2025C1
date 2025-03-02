#include <iostream>
#include <string>
#include "PetShop.cpp"

using namespace std;

//deklarasi class yang menjadi anak dari Petshop
class Aksesoris : public PetShop 
{
    //atribut private
    private:
        string jenis;
        string bahan;
        string warna;

    public:
    //konstruktor
    Aksesoris()
    {
        this->jenis = "";
        this->bahan = "";
        this->warna = "";
    }

    Aksesoris(string jenis, string bahan, string warna)
    {
        this->jenis = jenis;
        this->bahan = bahan;
        this->warna = warna;
    }

    //setter
    void setJenis(string jenis)
    {
        this->jenis = jenis;
    }
    void setBahan(string bahan)
    {
        this->bahan = bahan;
    }
    void setWarna(string warna)
    {
        this->warna = warna;
    }

    //getter
    string getJenis()
    {
        return this->jenis;
    }
    string getBahan()
    {
        return this->bahan;
    }
    string getWarna()
    {
        return this->warna;
    }

    //destructor
    ~Aksesoris()
    {
        
    }
};