# State Pattern
## 정의
State 패턴에서는 상태를 클래스로 표현한다.

## 구성요소
- State(상태) 역<br>
상태에 의존한 동작을 하는 메소드 모음이다. (State 인터페이스)
- ConcreteState(구체적인 상태) 역<br>
구체적인 각각의 상태를 나타낸다. (DayState 클래스, NightState 클래스)
- Context(상황, 전후관계, 문맥)<br>
현재 상태를 나타내는 ConcreteState를 가진다.

## 특징
- 분할해서 통치해야 한다(divide and conquer).
- State 인터페이스에서 선언된 메소드는 모두 상태에 의존하는 처리이다.