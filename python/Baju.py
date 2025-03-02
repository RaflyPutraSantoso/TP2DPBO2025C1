#library
from Aksesoris import Aksesoris

#deklarasi class yang menjadi anak dari Aksesoris
class Baju(Aksesoris):
    #atribut private
    __size = ""
    __merk = ""

    #constructor
    def __init__(self, size = "", merk = ""):
        self.__size = size
        self.__merk = merk

    #setter
    def setsize(self,size):
        self.__size = size
    def setmerk(self,merk):
        self.__merk = merk

    #getter
    def getsize(self):
        return self.__size
    def getmerk(self):
        return self.__merk