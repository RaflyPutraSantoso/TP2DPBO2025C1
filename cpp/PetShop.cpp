#include <iostream>
#include <string>

using namespace std;

//deklarasi kelas
class PetShop
{
    //atribut private
    private:
    string id;
    string nama;
    string harga;
    string stok;

    public:
    //constructor
    PetShop()
    {
        this->id = "";
        this->nama = "";
        this->harga = "";
        this->stok= "";
    }

    PetShop(string id, string nama, string harga, string stok) : id(id), nama(nama), harga(harga), stok(stok) 
    {
        this->id = id;
        this->nama = nama;
        this->harga = harga;
        this->stok= stok;
    }

    //setter
    void setId(string id)
    {
        this->id = id;
    }
    void setnama(string nama)
    {
        this->nama = nama;
    }
    void setharga(string harga)
    {
        this->harga = harga;
    }
    void setstok(string stok)
    {
        this->stok = stok;
    }

    //getter
    string getId()
    {
        return this->id;
    }
    string getnama()
    {
        return this->nama;
    }
    string getHarga()
    {
        return this->harga;
    }
    string getStok()
    {
        return this->stok;
    }

    //destructor
    ~PetShop()
    {
        
    }
    
};