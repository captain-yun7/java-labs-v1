package chapter1.labs.lab4;

/**
 * Lab 4: 자바 연산자 실습
 * 
 * 이 실습은 자바의 다양한 연산자를 이해하고 활용하는 것을 목표로 합니다.
 */
public class OperatorsLab {
    public static void main(String[] args) {
        // TODO: 1. 산술 연산자 사용하기
        // 두 개의 정수형 변수를 선언하고 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산을 수행하세요.
        int a = 10;
        int b = 3;

        System.out.println("===== 산술 연산자 =====");
        System.out.println("a + b = " + (a + b));  // 덧셈
        System.out.println("a - b = " + (a - b));  // 뺄셈
        System.out.println("a * b = " + (a * b));  // 곱셈
        System.out.println("a / b = " + (a / b));  // 나눗셈 (몫)
        System.out.println("a % b = " + (a % b));  // 나머지

        // TODO: 2. 증감 연산자 사용하기
        // 변수를 선언하고 전위 증가, 후위 증가, 전위 감소, 후위 감소 연산을 수행하세요.
        // 각 단계별로 변수의 값을 출력하여 변화를 확인하세요.

        System.out.println("\n===== 증감 연산자 =====");
        int c = 5;
        System.out.println("c = " + c);
        System.out.println("++c = " + (++c));  // 전위 증가 (먼저 증가 후 사용)
        System.out.println("c++ = " + (c++));  // 후위 증가 (사용 후 증가)
        System.out.println("c = " + c);
        System.out.println("--c = " + (--c));  // 전위 감소 (먼저 감소 후 사용)
        System.out.println("c-- = " + (c--));  // 후위 감소 (사용 후 감소)
        System.out.println("c = " + c);
        
        // TODO: 3. 비교 연산자 사용하기
        // 두 변수를 비교하여 결과를 출력하세요 (==, !=, >, <, >=, <=).
        System.out.println("\n===== 비교 연산자 =====");
        System.out.println("a == b: " + (a == b));  // 같음
        System.out.println("a != b: " + (a != b));  // 다름
        System.out.println("a > b: " + (a > b));    // 크다
        System.out.println("a < b: " + (a < b));    // 작다
        System.out.println("a >= b: " + (a >= b));  // 크거나 같다
        System.out.println("a <= b: " + (a <= b));  // 작거나 같다
        
        // TODO: 4. 논리 연산자 사용하기
        // boolean 변수를 사용하여 AND(&&), OR(||), NOT(!) 연산을 수행하세요.
        System.out.println("\n===== 논리 연산자 =====");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));  // 논리 AND
        System.out.println("x || y: " + (x || y));  // 논리 OR
        System.out.println("!x: " + (!x));          // 논리 NOT
        
        // TODO: 5. 대입 연산자 사용하기
        // 변수를 선언하고 복합 대입 연산자(+=, -=, *=, /=, %=)를 사용하여 값을 변경하세요.
        System.out.println("\n===== 대입 연산자 =====");
        int d = 10;
        System.out.println("d = " + d);
        d += 5;  // d = d + 5와 동일
        System.out.println("d += 5: " + d);
        d -= 3;  // d = d - 3와 동일
        System.out.println("d -= 3: " + d);
        d *= 2;  // d = d * 2와 동일
        System.out.println("d *= 2: " + d);
        d /= 4;  // d = d / 4와 동일
        System.out.println("d /= 4: " + d);
        d %= 3;  // d = d % 3와 동일
        System.out.println("d %= 3: " + d);
        
        // TODO: 6. 삼항 연산자 사용하기
        // 조건에 따라 다른 값을 할당하는 예제를 작성하세요.
        System.out.println("\n===== 삼항 연산자 =====");

        int score = 85;

        // 삼항 연산자 사용해서 grade 할당
        String grade = (score >= 90) ? "A" :
                (score >= 80) ? "B" :
                        (score >= 70) ? "C" : "F";

        System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
    }
} 