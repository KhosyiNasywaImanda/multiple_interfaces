public class Harimau extends hewan implements jenis,habbits{

    public Harimau(String namaPanggilan) {
        super(namaPanggilan);
    }

    @Override
    public void bergerak(){
        System.out.println("Harimau bergerak secara berjalan");
    }
    public void tidur(){
        System.out.println("Harimau memilih untuk menghabiskan setengah harinya dengan tidur siang");
    }
    public void suara(){
        System.out.println("suara Harimau adalah AUM (mengaum");
    }

    @Override
    public void kategori(){
        System.out.println("Harimau termasuk hewan Karnivora");
    }
    public void filum(){
        System.out.println("Harimau adalah hewan yang tergolong dalam filum Chordata (mempunyai saraf tulang belakang)");
    }


}
