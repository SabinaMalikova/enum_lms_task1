public class Main {
    public static void main(String[] args) {

/*        TransportType деген enum туз. Ичине ар кандай типтеги унааларды жаз. Мисалы: CAR, BUS, TRUCK.
                Enum-дын ичинде бир  метод болсун:
        public  double calculateTravelCost(double distance);
        Бул метод транспорттун ар бир түрү үчүн өзүнүн жол баасын эсептеп чыгышы керек.

        (CAR)  Автоунаанын бир километринин баасы $0,1.
        (BUS)  Автобустун бир километринин баасы $0,05
        (TRUCK.) Трак үчүн бир километрдин баасы $0,02                      */


           for (TransportType value : TransportType.values()) {
               System.out.println(value+": "+value.calculateTravelCost(170));
           }









    }
}