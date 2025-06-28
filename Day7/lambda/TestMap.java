package Day7.lambda;

import java.util.Arrays;
import java.util.List;

public class TestMap {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6,7,8,9};

        //Find Square of each num
        //for(int i=0;i<nums.length;i++){
          //  nums[i] *= nums[i];
            //System.out.println(nums[i]);
        //}

        //Find square if each num using map
        List<Integer> listNums= Arrays.asList(nums);
//        listNums = listNums.stream().map(num -> num * num).toList();
//        listNums.forEach(System.out::println);

        int SumOfEvenSquare = listNums.stream()
                .map(num-> num*num)
                .filter(num-> num%2 ==0)
                .reduce(0,(num1,num2)-> num1+num2);

        System.out.println(SumOfEvenSquare);
    }
}
