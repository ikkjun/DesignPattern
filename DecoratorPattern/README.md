# Decorator Pattern
## 정의
객체에 점점 장식을 더해 가는 디자인 패턴

## 구성요소
- Component 역<br>
기능을 추가할 때 핵심이 된다. Component는 인터페이스(API)만을 정의한다. (Display 클래스)
- ConcreteComponent 역<br>
Component의 인터페이스(API)를 구현하는 구체적인 클래스이다. (String-Display 클래스)
- Decorator(장식자) 역<br>
Component와 동일한 인터페이스(API)를 가지며, 이 Decorator가 장식할 대상이 되는 Component도 가지고 있다. (Border 클래스)
- ConcreteDecorator(구체적인 장식자) 역
구체적인 Decorator이다. (SideBorder 클래스와 FullBorder 클래스)

## 특징
### 투과적 인터페이스
Decotator 패턴에서는 장식들과 내용물을 동일시한다.
투과적 인터페이스란 장식틀을 사용해 내용물을 감싸도 인터페이스(API)는 가려지지 않고 다른 클래스에서 볼 수 있는 것이다.
인터페이스(API)가 투과적이므로 Decorator 패턴에서는 Composite 패턴과 유사한 재귀적인 구조가 등장한다. 

#### Decorator 패턴과 Composite 패턴의 공통점과 차이점
##### 공통점
재귀적인 구조를 다룬다. 
##### 차이점
Decorator 패턴은 바깥 테두리를 겹쳐 기능을 추가해 나가는 것이 주된 목적이다.

### 내용물을 바꾸지 않고 기능을 추가할 수 있다.
### 동적으로 기능을 추가할 수 있다.
### 단순한 구성이어도 다양한 기능을 추가할 수 있다.