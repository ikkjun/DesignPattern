# Chain of Responsibility
## 정의
어떤 요청이 있을 때, 그 요청을 처리할 객체(오브젝트)를 고정적으로 결정할 수 없는 경우에, 여러 객체를 사슬(chain)처럼 연쇄적으로 묶고, 객체 사슬을 차례대로 돌면서 원하는 객체를 결정하는 패턴을 Chain of Responsibility 패턴이라고 한다. 

### 장점
- '요청하는 쪽'과 '처리하는 쪽'의 결합을 약하게 만들어서 각각 부품으로 독립시킬 수 있다. 
- 상황에 따라 요청을 처리할 객체가 변하는 프로그램에 대응할 수 있다.

## 구성요소
- Handler(처리자) 역<br>
요구를 처리하는 인터페이스(API)를 정의한다. (Support 클래스)

- ConcreteHandler(구체적인 처리자) 역
요구를 구체적으로 처리한다. (NoSupport, Limitsupport, 0ddSupport, SpecialSupport 클래스)

- Client(요구자) 역
첫 번째 ConcreteHandler에 요구를 한다. (Main 클래스)

## 특징
1. 요구하는 사람과 요구를 처리하는 사람의 연결을 느슨하게 한다.
2. 동적으로 사슬 형태를 바꾼다.<br>
Chain of Responsibility 패턴처럼 위임을 통해 처리를 떠넘기면 상황 변화에 따라서 Concretellandler 역을 재편할 수 있다.
3. 자기 일에 집중할 수 있다.<br>
각각의 ConcreteHandler 역은 자신이 할 수 있는 일에 집중하고, 할 수 없는 일이라면 넘긴다. 
그렇게 하면 각각의 ConcteteHandler 역으로 작성해야 하는 처리가 그 ConcreteHandler 역에 고유한 내용으로 좁혀진다.
4. 떠넘기기로 처리가 지연될 수 있다.<br>
그 담당자가 바로 처리할 때와 비교하면 Chain of Responsibility 패턴을 적용한 경우의 처리는 지연된다. 
요구와 처리자의 관계가 고정적이고 처리 속도가 매우 중요한 경우에는 Chain of Responsibility 패턴을 사용하지 않는 편이 낫다.