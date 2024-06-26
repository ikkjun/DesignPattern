# Observer Pattern
## 정의
Observer 패턴에서는 관찰 대상의 상태가 변화하면 관찰자에게 알린다.
Observer 패턴은 상태 변화에 따른 처리를 기술할 때 효과적이다.

## 구성요소
- Subject(관찰 대상자) 역<br>
관찰되는 대상을 나타낸다. (NumberGenerator 클래스)
- ConcreteSubject(구체적인 관찰 대상자) 역<br>
구체적인 관찰되는 대상을 표현한다. 상태가 변경되면 등록된 Observer에 알린다. (RandomNumberGenerator 클래스)
- Observer(관찰자) 역<br>
Subject로부터 상태가 변했다는 사실을 전달받는다. (Observer 인터페이스)
- ConcreteObserver(구체적인 관찰자) 역<br>
구체적인 Observer로서, update 메소드가 호출되면, 그 메소드 안에서 Subject의 현재 상태를 취득한다. (DigitObserver 클래스와 GraphObserver 클래스)

## 특징
1. 구상 클래스 부분을 교환하는 방법
    - 추상 클래스나 인터페이스를 사용하여 구상 클래스로부터 추상 메소드를 분리한다.
    - 인수로 인스턴스를 전달할 때나 필드로 인스턴스를 저장할 때는 구상 클래스형으로 하지 않고 추상 클래스나 인터페이스형으로 해둔다.
2. Model/View/Controller(MVC)
   - MVC 구조에서 Model과 View의 관계는 Observer 패턴의 Subject와 Observer 관계에 대응한다.

## 관련 패턴
- Mediator 패턴<br>
   - 공통점<br>
      상태 변화를 알린다.
   - 차이점: 패턴의 목적과 관점<br>
      - Mediator 패턴: Colleague 역의 조정이 목적
      - Observer 패턴: Subject 역의 상태 변화를 Observer역에 통지하고 동기화하는 것이 목적