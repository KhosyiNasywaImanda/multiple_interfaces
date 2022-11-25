public class MainProgram {
    public static void main(String[] args) {

        System.out.println("=-=-=-==-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-===--=-=-=-=");
        System.out.println("                                 Harimau                                      ");
        System.out.println("=-=-=-==-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-===--=-=-=-=");
        Harimau hm = new Harimau("aleta");
        hm.bergerak();
        hm.tidur();
        hm.suara();
        hm.kategori();
        hm.filum();
        System.out.println();


        System.out.println("=-=-=-==-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-===--=-=-=-=");
        System.out.println("                                   Paus                                      ");
        System.out.println("=-=-=-==-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-===--=-=-=-=");
        paus ps = new paus("Kuro");
        ps.bergerak();
        ps.tidur();
        ps.suara();
        ps.kategori();
        ps.filum();
        System.out.println();


        System.out.println("=-=-=-==-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-===--=-=-=-=");
        System.out.println("                              Burung Hantu                                   ");
        System.out.println("=-=-=-==-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-===--=-=-=-=");
        BurungHantu bt = new BurungHantu("oweell");
        bt.bergerak();
        bt.tidur();
        bt.suara();
        bt.kategori();
        bt.filum();


    }
}
