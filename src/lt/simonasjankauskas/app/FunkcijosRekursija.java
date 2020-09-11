package lt.simonasjankauskas.app;

public class FunkcijosRekursija {
    public static void main(String[] args) {
        int[] ourArray = {5, 60, 777, 22, 1520, 1, 222};
        int min = getMin(ourArray);
        System.out.println("Mažiausias skaičius masyve yra:" + min);
        int max = getMax(ourArray);
        System.out.println("Didžiausias skaičius masyve yra:" + max);
        int sum = getSum(ourArray);
        System.out.println("Masyve esančių skaičių suma yra:" +sum);
    }
    // ... Mažiausio skaičiaus gražinimas
    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++) {
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
    // ... Didžiausio skaičiaus gražinimas
    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++) {
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
    // ... Visų masyve esančių skaičių suma
    public static int getSum(int[] inputArray) {
        int sum = 0;
        for (int i : inputArray) {
            sum = sum + i;
        }
        return sum;
    }
}

