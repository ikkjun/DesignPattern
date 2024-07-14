# Flyweight 패턴
## 정의
인스턴스가 필요할 때 항상 new하지 않고, 이미 만들어진 인스턴스를 이용할 수 있다면 그것을 공유해서 사용하는 패턴이다.

## 구성요소
- Flyweight(플라이급) 역
평소처럼 인스턴스를 생성하면 프로그램이 무거워지기 때문에 공유해서 사용한다. (BigChar)
- FlyweightFactory(플라이급 공장) 역
Flyweight를 만드는 공장이다. (BigCharFactory)
- Client(의뢰자) 역
FlyweightFactory를 사용하여 Flyweight를 만들어 내고 이용한다. (BigString)
