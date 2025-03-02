#deklarasi class
class PetShop():
    #atribut private
    __id = ""
    __nama = ""
    __harga = ""
    __stok = ""

    #constuctor
    def __init__(self, id = "", nama = "", harga = "", stok = ""):
        self.id = id
        self.nama = nama
        self.harga = harga
        self.stok = stok

    #setter
    def set_id(self, id):
        self.__id = id
    def set_nama(self, nama):
        self.__nama = nama
    def set_harga(self, harga):
        self.__harga = harga
    def set_stok(self, stok):
        self.__stok = stok

    #getter
    def getid(self):
        return self.__id
    def getnama(self):
        return self.__nama
    def getharga(self):
        return self.__harga
    def getstok(self):
        return self.__stok