class Baju extends Aksesoris
{
    //atribut
    private String size;
    private String merk;

    //constructor
    public Baju()
    {
        this.size = "";
        this.merk = "";
    }
    public Baju(String size, String merk)
    {
        this.size = size;
        this.merk = merk;
    }

    //setter
    public void setsize(String size)
    {
        this.size = size;
    }
    public void setmerk (String merk)
    {
        this.merk = merk;
    }

    //getter
    public String getsize()
    {
        return this.size;
    }
    public String getmerk()
    {
        return this.merk;
    }
}
