class Main{
    public static void main(String[] args) {
        professor p1 = new professor(7217617,"Mateus Lindo 171", "História" );
        porta d1 = new porta ("creme", 200, 80, false);
        televisor toshiba = new televisor(4, 100, false, true, true, false, true);
        controleremoto toshibacontrole = new controleremoto(6, 20,false, toshiba);

        System.out.println(p1);
        System.out.println(d1);
        System.out.println(toshiba);
        System.out.println(toshibacontrole);
    }  
}
