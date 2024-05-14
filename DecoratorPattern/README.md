# Decorator Pattern
## 정의
객체에 점점 장식을 더해 가는 디자인 패턴

## 구성요소
- Component 역<br>
기능을 추가할 때 핵심이 되는 역할입니다. 케이크에 비유하자면, 장식하기 전의 스펀지 케이크에 해당합니 다. Component는 스펀지 케이크의 인터페이스(API)만을 정의합니다. 예제 프로그램에서는 Display 클래 스가 이 역할을 맡았습니다.
- ConcreteComponent 역
Component의 인터페이스(API)를 구현하는 구체적인 스펀지 케이크입니다. 예제 프로그램에서는 String-Display 클래스가 이 역할을 맡았습니다.
- Decorator(장식자) 역
Component와 동일한 인터페이스(API)를 가지며, 이 Decorator가 장식할 대상이 되는 Component도 가 지고 있습니다. 이 역은 자신이 장식할 대상을 아는 셈입니다. 예제 프로그램에서는 Border 클래스가 이 역 할을 맡았습니다.
- ConcreteDecorator(구체적인 장식자) 역
구체적인 Decorator입니다. 예제 프로그램에서는 SideBorder 클래스와 FullBorder 클래스가 이 역할을 맡 았습니다.