# Mediator Pattern
## 1. 정의
멤버는 모두 중재자에게만 보고하고, 중재자만 멤버에게 지시를 내리는 패턴이다.
그룹의 각 멤버가 마음대로 다른 멤버와 소통하고 판단하는 것이 아니라, 항상 중재자를 통해서 행동한다. 
Mediator 패턴에서 '중재자'는 mediator(조정자), '각 멤버'는 colleague(동료)라고 한다.

다수의 객체 사이에서 조정해야 할 때 Mediator 패턴이 등장한다. 
표시 컨트롤 로직은 중재자 안에만 기술한다.

## 2. 구성요소
- Mediator(조정자, 중재자) 역
Colleague와 통신하고 조정하는 인터페이스(API)를 정의한다. (Mediator 인터페이스)
- ConcreteMediator(구체적인 조정자, 중재자) 역
Mediator의 인터페이스(API)를 구현해 실제로 조정한다. (LoginFrame 클래스)
- Colleague(동료) 역
Mediator와 통신하는 인터페이스(API)를 정의한다. (Colleague 인터페이스)
- ConcreteColleague(구체적인 동료) 역
Colleague의 인터페이스(AP)를 구현한다. (ColleagueButton, ColleagueTextField, ColleagueCheckbox 클래스)