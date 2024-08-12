# Command 패턴
## 정의
Command 패턴은 명령을 표현하는 클래스를 하나의 객체로 표현하는 패턴이다.

## 구성요소
- Command 역
명령의 인터페이스(API)를 정의한다. (Command 인터페이스)
- ConcreteCommand(구체적인 명령) 역
Command의 인터페이스를 구현한다. (MacroCommand 클래스, DrawCommand 클래스)
- Receiver(수신자) 역
Command가 명령을 실행할 때 대상이 된다. (DrawCanvas)
- Client(의뢰자) 역
ConcreteCommand를 생성하고 그 때 Receiver를 할당한다. (Main 클래스)
- Invoker(호출자) 역
Command에 정의된 명령을 실행한다. (Main 클래스와 DrawCanvas 클래스)

## 특징
- 명령이 가져야 하는 정보는 목적에 따라 달라진다.
- 이력을 저장하는 인스턴스를 파일로 저장하면 이력이 보관된다.