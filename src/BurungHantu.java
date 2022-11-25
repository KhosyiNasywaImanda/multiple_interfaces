public class BurungHantu extends hewan implements habbits,jenis {

    public BurungHantu(String namaPanggilan) {
        super(namaPanggilan);
    }

    @Override
    public void bergerak(){
        System.out.println("Burung Hantu bergerak secara terbang");
    }
    public void tidur(){
        System.out.println("Burung Hantu tidur di siang hari(hewan noktural)");
    }
    public void suara(){
        System.out.println("Burung hantu akan mengeluarkan suara gonggongan rendah ketika hewan ini terkejut atau merasa takut. Suara ini akan dihasilkan dalam sebuah interval yang tiba-tiba dan terdengar tajam, Jenis suara ini dikelompokkan sebagai bentuk threat atau ancaman untuk apa pun yang membuat hewan ini merasa terancam");
    }

    @Override
    public void kategori(){
        System.out.println("Burung hantu termasuk hewan Karnivora");
    }
    public void filum(){
        System.out.println("Burung hantuadalah hewan yang tergolong dalam filum Chordata (mempunyai saraf tulang belakang)");
    }
}
