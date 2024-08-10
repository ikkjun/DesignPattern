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