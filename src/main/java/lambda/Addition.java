package lambda;

@FunctionalInterface        // 메소드를 1개 이상 만들수없게한다.
                            // 람다로 만들때는 FunctionalInterface 를 넣어야한다 -> 개발자가 실수하지않도록
public interface Addition {
    public int add(int[] numbers);
}
