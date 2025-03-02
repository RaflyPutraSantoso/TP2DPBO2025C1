class PetShop 
{
      //atribut private
      private String id;         
      private String nama;    
      private String harga;    
      private String stok;
  
      //constructor
      public PetShop()
      {
          this.id = "";
          this.nama = "";
          this.harga = "";
          this.stok = "";
      }
      public PetShop(String id, String nama, String harga, String stok)
      {
          this.id = id;
          this.nama = nama;
          this.harga = harga;
          this.stok = stok;
      }
  
      //setter
      public void setId(String id)
      {
          this.id = id;
      }
      public void setnama(String nama)
      {
          this.nama = nama;
      }
      public void setharga(String harga)
      {
          this.harga = harga;
      }
      public void setstok(String stok)
      {
          this.stok = stok;
      }
  
      //getter
      public String getId()
      {
          return this.id;
      }
      public String getnama()
      {
          return this.nama;
      }
      public String getharga()
      {
          return this.harga;
      }
      public String getstok()
      {
          return this.stok;
      }
    
}
