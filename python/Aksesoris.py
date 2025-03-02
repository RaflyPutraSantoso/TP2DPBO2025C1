#library
from PetShop import PetShop

#deklarasi class yang menjadi anak dari PetShop
class Aksesoris(PetShop):
    #atribut private
    __jenis = ""
    __bahan = ""
    __warna = ""

    #constructor
    def __init__(self, jenis = "", bahan = "", warna = ""):
        self.jenis = jenis
        self.bahan = bahan
        self.warna = warna

    #setter
    def setjenis(self, jenis):
        self.__jenis = jenis
    def setbahan(self, bahan):
        self.__bahan = bahan
    def setwarna(self, warna):
        self.__warna = warna

    #getter
    def getjenis(self):
        return self.__jenis
    def getbahan(self):
        return self.__bahan
    def getwarna(self):
        return self.__warna