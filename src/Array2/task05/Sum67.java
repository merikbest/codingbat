package Array2.task05;

/*Return the sum of the numbers in the array,
 except ignore sections of numbers starting with a 6 and extending to the next 7
 (every 6 will be followed by at least one 7). Return 0 for no numbers.

        sum67([1, 2, 2]) → 5
        sum67([1, 2, 2, 6, 99, 99, 7]) → 5
        sum67([1, 1, 6, 7, 2]) → 4*/

class Sum67 {
    public int sum67(int[] nums) {
        int result = 0;
        int annul7 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {                       //Если в масиве есть число  6 (начао)
                for (int j = i; nums[j] != 7; j++) {  //создаем цикл для заполнения нулями всех чисел от 6 до 7 (в том числе и 6 и 7)
                    nums[j] = 0;                      //в цикл for выполняется до того пока не будет найдено 7 (nums[j] != 7)
                    annul7 = j;
                }
                nums[annul7 + 1] = 0;              //цифра после 6 будет 0 до тех пор пока не появится цифра 7
            } else
                result += nums[i];
        }
        return result;
    }
}