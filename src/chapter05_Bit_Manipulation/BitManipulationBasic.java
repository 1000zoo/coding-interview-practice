package chapter05_Bit_Manipulation;

public class BitManipulationBasic {

    // 비트 값 확인
    // i 번 째 비트가 0 인지 1 인지
    public boolean getBit(int num, int i) {
        return (num & (1 << i)) != 0;
    }

    // 비트 값 채워놓기
    // i 번 째 비트를 1로 지정
    public int setBit(int num, int i) {
        return num | (1 << i);
    }

    // 비트 값 제거하기
    // i 번 째 비트를 0으로 지정
    public int clearBit(int num, int i) {
        return num & ~(1 << i);
    }

    // 최상위 비트 부터 i 번째 까지 제거
    public int clearBitMSBTroughI(int num, int i) {
        return num & ((1 << i) - 1);
    }

    // 비트 값 바꾸기
    // i 번 째 비트를 반대로
    public int changeBit(int num, int i) {
        return num ^ (1 << i);
    }

    // i 번 째 비트를 원하는 비트로
    public int updateBit(int num, int i, boolean bit) {
        // 우선 i 번 째 비트를 0으로 비워둔 뒤, bit 이 1 (true) 라면 i 번 째 비트만 1로,
        // 아니라면 그대로 => (x | 0s = x)
        return (num & ~(1 << i)) | ((bit ? 1 : 0) << i);
    }
}
