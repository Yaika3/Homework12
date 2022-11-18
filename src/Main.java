import java.util.Scanner;

public class Main {
    public static void printSeparator(){
        System.out.println("=====");
    }
    public static void printIssues (int issueCount){
        System.out.println(issueCount);

    }
    public static int sum(int [] numbers ){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum =sum + numbers[i];
            
        }
        return sum;
    }
    public static int checkingTheYear (int year){
        if ((year % 4 == 0) && year % 100 != 0){
            System.out.println(year + " високосный год ");
        }
        else System.out.println(" не високосный год ");
        return year;
    }
    public static int checkingTheVersion (int client){
        int clientOS = 0;
        int clientAndroid = 1;
        if (client == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");}
        if (client == 1){
            System.out.println("Установите версию приложения для Android по ссылке");}
        return client;

    }
    public static int checkingTheYearOfManufacture (int Version ){
        if (Version < 2022 && Version >= 2015) ; {
            System.out.println("приложение будет работать корректно.");
            if (Version < 2015) {
                System.out.println("Но установите облегченную версию приложения по ссылке");}}
        return Version;

    }
    public static int checkingTheDistance(int deliveryDistance){
        if (deliveryDistance >=20 && deliveryDistance < 60){
            System.out.println("Доставка займет 2 дня");}
        if (deliveryDistance >60 && deliveryDistance < 100){
            System.out.println("Доставка займет 3 дня");}
        if (deliveryDistance > 100){
            System.out.println("Доставка невозможна");}
        return deliveryDistance;
    }
    public static void main(String[] args) {
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i+1) %3 ==0) {
                printSeparator();
            }


        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);

        //task 1

        int year = 2008; // метод в строке 17.
        checkingTheYear(year);

        //task 2
        Scanner in = new Scanner(System.in);
        System.out.print("Если вы пользуетесь Android нажмите 1, Если вы пользуетесь OS нажмите 0 ");
        int client = in.nextInt();
        checkingTheYear(client);




        in = new Scanner(System.in);
        System.out.print("Год выпуска ващего телефона? ");
        int Version = in.nextInt();
        checkingTheYearOfManufacture(Version); // метод в строке 36


        //task 3
        int deliveryDistance = 95;
        checkingTheDistance(deliveryDistance); // метод берет значение из deliveryDistance.  Строка 44.




    }



}