class Aksesoris extends PetShop
{
    //atribut private
    private String jenis;
    private String bahan;
    private String warna;

    //constructor
    public Aksesoris()
    {
        this.jenis = "";
        this.bahan = "";
        this.warna = "";
    }
    public Aksesoris(String jenis, String bahan, String warna)
    {
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
    }

    //setter
    public void setjenis(String jenis)
    {
        this.jenis = jenis;
    }
    public void setbahan(String bahan)
    {
        this.bahan = bahan;
    }
    public void setwarna(String warna)
    {
        this.warna = warna;
    }
    
    //getter
    public String getjenis()
    {
        return this.jenis;
    }
    public String getbahan()
    {
        return this.bahan;
    }
    public String getwarna()
    {
        return this.warna;
    }


}