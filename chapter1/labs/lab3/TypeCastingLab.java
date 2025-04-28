package chapter1.labs.lab3;

/**
 * Lab 3: 자바 타입 변환(Type Casting) 실습
 * 
 * 이 실습은 자바의 타입 변환에 대해 이해하고 실습하는 것을 목표로 합니다.
 */
public class TypeCastingLab {
    public static void main(String[] args) {
        // TODO: 1. 자동 형변환(Implicit Casting) 예제
        // byte -> int, int -> long, long -> float, float -> double 순으로 
        // 변수를 선언하고 자동 형변환을 수행한 뒤 결과 출력하기
        System.out.println("===== 자동 형변환 =====");
        byte byteValue = 10;
        int intValue = byteValue;  // byte -> int 자동 형변환
        System.out.println("byte 값: " + byteValue);
        System.out.println("int 값: " + intValue);

        intValue = 500;
        long longValue = intValue; // int -> long 자동 형변환
        System.out.println("\nint 값: " + intValue);
        System.out.println("long 값: " + longValue);

        long longValue2 = 10000000000L;
        float floatValue = longValue2;
        System.out.println("\nlong 값: " + longValue2);
        System.out.println("float 값: " + floatValue);

        float floatValue2 = 10f;
        double doubleValue = floatValue2;
        System.out.println("\nfloat 값: " + floatValue2);
        System.out.println("double 값: " + doubleValue);

        
        // TODO: 2. 명시적 형변환(Explicit Casting) 예제
        // double -> float -> long -> int -> char -> short -> byte 순으로
        // 변수를 선언하고 명시적 형변환을 수행한 뒤 결과 출력하기
        System.out.println("\n===== 명시적 형변환 =====");
        double doubleValue3 = 3.14159;
        char charValue;
        short shortValue;

        floatValue = (float) doubleValue3;
        longValue = (long) floatValue;
        intValue = (int) longValue;
        charValue = (char) intValue;
        shortValue = (short) charValue;
        byteValue = (byte) shortValue;

        System.out.println("double 값: " + doubleValue3);
        System.out.println("float 값: " + floatValue);
        System.out.println("long 값: " + longValue);
        System.out.println("int 값: " + intValue);
        System.out.println("char 값: " + charValue);
        System.out.println("short 값: " + shortValue);
        System.out.println("byte 값: " + byteValue);

        // TODO: 3. 데이터 손실 확인하기
        // int 값을 byte로 변환하여 데이터 손실이 발생하는 예제 작성하기
        System.out.println("\n===== 데이터 손실 확인하기 =====");

        intValue = 129;
        byteValue = (byte) intValue;    // int -> byte 명시적 형변환 (범위 초과로 값 손실)
        System.out.println("int 값: " + intValue);
        System.out.println("byte 값: " + byteValue);  // byte 범위(-128~127)를 벗어나 오버플로우 발생
        
        // TODO: 4. 문자열과 숫자 간 변환하기
        // 문자열 "123"을 정수로, "3.14"를 실수로 변환하기

        System.out.println("\n===== 문자열과 숫자 간 변환하기 =====");

        int i5 = Integer.parseInt("123");
        System.out.println("Integer.parseInt(\"123\") = " + i5);

        double d5 = Double.parseDouble("3.14");
        System.out.println("Double.parseDouble(\"3.14\") = " + d5);

        // TODO: 5. 숫자를 문자열로 변환하기
        // 정수 456과 실수 7.89를 문자열로 변환하기
        System.out.println("\n=====숫자를 문자열로 변환하기 =====");

        String str4 = Integer.toString(456);
        System.out.println("Integer.toString(456) = " + str4);

        String str5 = Double.toString(7.89);
        System.out.println("Double.toString(7.89) = " + str5);

    }
} 