#include <iostream>
#include <string>
#include "Aksesoris.cpp"

using namespace std;

//deklarasi class shirt yang menjadi anak dari Aksesoris
class Baju : public Aksesoris 
{
    //atribut private
    private:
     string size;
     string merk;

    public:
    //konstruktor
    Baju()
    {
        this->size = "";
        this->merk = "";
    }
    Baju(string size, string merk)
    {
        this->size = size;
        this->merk = merk;
    }

    //setter
    void setSize(string size)
    {
        this->size = size;
    }
    void setMerk(string merk)
    {
        this->merk = merk;
    }

    //getter
    string getSize()
    {
        return this->size;
    }
    string getMerk()
    {
        return this->merk;
    }

    //destructor
    ~Baju()
    {
        
    }
};