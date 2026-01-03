package chapter3;
/* 산술 연산자(2026.01.03) */
public class OperationEx1 {
    public static void main(String[] args){
        int mathScore = 90;
        int engScore = 70;

        int totalScore = mathScore + engScore; // 정수형 변수
        System.out.println(totalScore); // 총점

        double avgScore = totalScore / 2.0; // 실수형 변수
        System.out.println(avgScore); // 평균

        int minus = mathScore - engScore; // 빼기
        System.out.println(minus);

        int cross = mathScore * engScore; // 곱하기
        System.out.println((double)cross); // 형 변환 연습

        int rest = mathScore % engScore; // 나머지
        System.out.println(rest); // 정수 / 정수 = 정수
        System.out.println((float)rest); // 형 변환
    }
}
