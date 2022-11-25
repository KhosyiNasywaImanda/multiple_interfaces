public class paus extends hewan implements habbits,jenis {

    public paus(String namaPanggilan) {
        super(namaPanggilan);
    }

    @Override
    public void bergerak(){
        System.out.println("paus bergerak secara berenang");
    }
    public void tidur(){
        System.out.println("Paus ditemukan menghabiskan 7% hari mereka dengan posisi tidur vertikal di dekat permukaan air,di mana mereka tidur siang dari 10 sampai 15 menit. Para peneliti berpendapat pada saat itu bahwa paus bisa jadi adalah salah satu hewan yang paling sedikit tidurnya di dunia.");
    }
    public void suara(){
        System.out.println("paus dapat menghasilkan suara mencapai 188 desibel. Suara ini dapat terdengar hingga ratusan kilometer. Suara tersebut akan terbawa lebih jauh ke bawah air, beberapa sumber menyebutkan, suara paus dapat terdengar lebih dari 800 kilometer jauhnya.");
    }

    @Override
    public void kategori(){
        System.out.println("paus termasuk hewan Karnivora");
    }
    public void filum(){
        System.out.println("paus adalah hewan yang tergolong dalam filum Chordata (mempunyai saraf tulang belakang)");
    }

    
}
