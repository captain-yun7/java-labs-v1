package chapter1.labs.lab2;

/**
 * Lab 2: 자바 데이터 타입 실습
 * 
 * 이 실습은 자바의 기본 데이터 타입을 이해하고 사용하는 것을 목표로 합니다.
 */
public class DataTypesLab {
    public static void main(String[] args) {
        // TODO: 다음 기본 데이터 타입의 변수를 선언하고 값을 할당하세요.
        // 1. 정수형(byte, short, int, long) 변수 선언 및 할당
        byte byteValue = 10;
        short shortValue = 1000;
        int intValue = 100000;
        long longValue = 1000000000L;

        // TODO: 2. 실수형(float, double) 변수 선언 및 할당
        float floatValue = 3.14f;
        double doubleValue = 3.14159;

        // TODO: 3. 문자형(char) 변수 선언 및 할당
        char charValue = 'A';
        
        // TODO: 4. 논리형(boolean) 변수 선언 및 할당
        boolean booleanValue = true;
        
        // TODO: 5. 모든 변수 값을 출력하세요.
        System.out.println("===== 기본 데이터 타입 =====");
        System.out.println("byte 값: " + byteValue);
        System.out.println("short 값: " + shortValue);
        System.out.println("int 값: " + intValue);
        System.out.println("long 값: " + longValue);
        System.out.println("float 값: " + floatValue);
        System.out.println("double 값: " + doubleValue);
        System.out.println("char 값: " + charValue);
        System.out.println("boolean 값: " + booleanValue);
        
        // TODO: 6. 자신의 키(cm)와 몸무게(kg)를 저장하는 변수를 선언하고 
        // BMI 지수를 계산하여 출력하세요. (BMI = 몸무게(kg) / (키(m) * 키(m)))
        float height = (float) 175 /100;
        int weight = 60;
        float BMI = weight / (height * height);
        System.out.println("BMI: " + BMI);
    }
} 