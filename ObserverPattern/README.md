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