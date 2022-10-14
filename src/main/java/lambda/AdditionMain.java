package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class AdditionMain {

    public static void main(String[] args) {
        Addition addition = new Addition() {
            //익명 class
            @Override
            public int add(int[] numbers) {
                int result = 0;
                for(int num : numbers){
                    result += num;
                }
                return result;
            }
        };
        //람다식 작성
        Addition addition2 = (numbers -> {  //numbers 는 매개변수이다 매개변수명은 바꿀수있다.
            int result = 0;
            for(int num : numbers){
                result += num;
            }
            return result;
        });

        BiFunction<Integer[],Integer[], Integer> addition3 = (nums1, nums2) -> {
            int result = 0;
            for(int num : nums1){
                result += num;
            }
            for(int num : nums1){
                result += num;
            }
            return result;
        };

        BiFunction<Integer, Integer, Integer> addition4 = (num1, num2) -> num1 + num2;
                                                                        // num1 + num2 중괄호를 빼고 적으면 무조건 리턴
                                                                        // {return num+ num2}로 return 을 쓸수있다.




        int result1 = addition.add(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println("결과1 " + result1);
        int result2 = addition2.add(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println("결과2 " + result2);
        int result3 = addition3.apply(new Integer[]{1,2,3,4,5,6,7,8,9,10},new Integer[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println("결과3 " + result3);

    }
}
