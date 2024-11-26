public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Task 2");
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Task 3");
        for(int i = 0; i <= 17; i = i + 2){
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Task 4");
        for(int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Task 5");
        for(int i = 1904; i <=2096; i = i + 4){
            System.out.println(i + " год является високосным.");
        }
        System.out.println(" ");
        System.out.println("Task 6");
        for(int i = 7; i <=98; i = i + 7){
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Task 7");
        for(int i = 1; i <=512; i = i * 2){
            System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Task 8");
        int salary = 0;
        for(int i = 1; i <=12; i++){
            salary = salary + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + salary);
        }
        System.out.println(" ");
        System.out.println("Task 9");
        float salary2 = 0;
        float forBank = 0F;
        for(int i = 1; i <=12; i++){
            forBank = salary2 /100;
            salary2 = salary2 + 29000 + forBank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + salary2);
        }
        System.out.println(" ");
        System.out.println("Task 10");
        for(int i = 1; i <= 10; i++ ){
            System.out.println("2 * " + i + " = " + i * 2);
        }
    }
}
