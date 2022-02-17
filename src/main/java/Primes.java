public class Primes {
    public static void main(String[] args) {
        for(int i = 2; i < 100; i++) //Проверка чисел от 2 до 100
        {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n){ //Определяет, является ли аргумент простым числом или нет
        for(int i = 2; i <= n; i++)
        {
            if(n != i & n%i == 0)
            {
                return false; //Если число делится нацело не только на себя и на единицу
            }
            else if(n == i & n%i == 0)
            {
                return true; //Если число делится нацело только на себя и на единицу
            }
        }
        return false;
    }
}
