# Bridge 패턴
Bridge 패턴은 '기능의 클래스 계층'과 '구현의 클래스 계층'으로 구분된 클래스 계층 사이를 연결하는 다리 역할을 하는 디자인 패턴이다.

## 기능의 클래스 계층
기능의 클래스 계층이란, 새로운 기능을 추가하고 싶을 때 클래스 계층 안에서 자신의 목적과 가까운 클래스를 찾아 그 하위 클래스를 만들고 원하는 기능을 추가한 새로운 클래스를 만드는 것을 의미한다.
- 상위 클래스에서는 기본적인 기능을 가지고 있다.
- 하위 클래스에서 새로운 기능을 추가한다.

## 구현의 클래스 계층
구현의 클래스 계층이란 새로운 구현을 만들기 위해 상위 클래스의 하위 클래스를 만들고 추상 메소드를 구현하게 하는 클래스 계층이다.
- 상위 클래스는 추상 메소드로 인터페이스를 규정한다.
- 하위 클래스는 구상 메소드로 그 인터페이스를 구현한다.

## 구성요소
- Abstraction(추상화) 클래스<br>기능 클래스의 계층의 최상위 클래스이다.
- RefinedAbstraction(개선된 추상화) 클래스<br>Abstraction 클래스에 기능 추가
- Implementor(구현자) 클래스<br>구현의 클래스 계층의 최상의 클래스
- ConcreteImplementor(구체적인 구현자)<br>구체적으로 Implementor 클래스의 인터페이스를 구현한다.

## 정리
Bridge 패턴의 특징은 기능의 클래스 계층과 구현의 클래스 계층을 분리하는 것이다.
두 개의 클래스 계층을 분리하면 각각의 클래스 계층을 독립적으로 확장할 수 있다.
기능을 추가하고 싶으면 기능의 클래스 계층에 클래스를 추가한다.
새로 추가한 기능은 모든 구현에서 이용할 수 있다.

'상속'은 클래스를 확장하는 편리한 방법이지만, 클래스 간의 연결을 강하게 고정시킨다. 
예제 프로그램에서는 Display 클래스 안에서 '위임'을 사용한다. 
Display 클래스의 impl 필드에는 구현의 인스턴스가 저장되어 있어 일을 떠넘기고 있다.
상속은 견고한 연결이지만, 위임은 느슨한 연결이다.