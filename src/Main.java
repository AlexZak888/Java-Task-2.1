public class Main {
    public static void main(String[] args) {

        int priceTicket = 30_000;
        int mile = 20;
        int bonus = priceTicket / mile;

        System.out.println("Количество начисленных миль за купленный билет: " + bonus);
    }
}