# Chain of Responsibility
## 정의
어떤 요청이 있을 때, 그 요청을 처리할 객체(오브젝트)를 고정적으로 결정할 수 없는 경우에, 여러 객체를 사슬(chain)처럼 연쇄적으로 묶고, 객체 사슬을 차례대로 돌면서 원하는 객체를 결정하는 패턴을 Chain of Responsibility 패턴이라고 한다. 

### 장점
- '요청하는 쪽'과 '처리하는 쪽'의 결합을 약하게 만들어서 각각 부품으로 독립시킬 수 있다. 
- 상황에 따라 요청을 처리할 객체가 변하는 프로그램에 대응할 수 있다.

## 구성요소
- Handler(처리자) 역<br>
요구를 처리하는 인터페이스(API)를 정의한다. (Support 클래스)

~ ConcreteHandler(구체적인 처리자) 역
요구를 구체적으로 처리합니다. 예제 프로그램에서는 NoSupport, Limitsupport, 0ddSupport, SpecialSup-port 클래스가 이 역할을 맡았습니다.
~ Client(요구자) 역
첫 번째 ConcreteHandler에 요구를 합니다. 예제 프로그램에서는 Main 클래스가 이 역할을 맡았습니다.

여러 객체를 사슬(chain)처럼 연쇄적으로 묶고, 객체 사슬을 차례대로 돌면서 원하는 객체를 결정하는 방법이다.

Use the Chain of Responsibility Pattern when you want to give more than one object a chance to handle a request.