# 문제

7.4 주차장: 객체지향 원칙에 따라 주차장을 설계하라.

# 가정
- 주차장은 총 4층이다.
    - 각 층은 ParkingFloor 로 구현된다.
- 층 마다 공간은 100칸으로 동일하다.
- 주차공간 마다 고유 ID 가 존재한다.
- 차량의 종류와 관계없이 요금을 받는다.
- 주간요금, 심야요금이 나누어 져있다.
- 주차장 클래스는 차량 입출 기록을 가지고 있다.
- 모든 차량 객체들은 입출기록에 저장된다.
- 모든 차량 객체들은 고유번호, 차종, 입차시간을 가지고있다.