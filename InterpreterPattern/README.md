# Interpreter 패턴
## 정의
프로그램이 해결하려는 문제를 기술한 미니 언어를 이해하고 해석하여 프로그램을 실행하는 통역 프로그램을 말한다.

## 구성요소
- AbstractExpression(추상 표현) 역<br>
구문 트리의 노드에 공통 인터페이스를 선언한다. (Node 클래스)
- TerminalExpression(종단 표현) 역<br>
BNF의 터미널 익스프레션에 대응한다.
- NonterminalExpression(비종단 표현) 역<br>
BNF의 논터미널 익스프레션에 대응한다.
- Context(문맥, 전후관계) 역<br>
인터프리터가 구문 해석을 하기 위한 정보를 제공한다.
- Client(의뢰자) 역<br>
TerminalExpression과 NonterminalExpression을 호출한다. (Main 클래스)

## 특징
- 미니 언어의 종류
    - 정규 표현
    - 검색 구문
    - 일괄 처리 언어
- 각각의 논터미널에 대응하는 메소드를 쓸 때는 항상 이 메소드가 어디까지 토큰을 읽었는지, 이 메소드에서 나올 때 어디까지 토큰을 읽어야 하는지 알고 있어야 토큰을 하나 더 읽거나 못 읽는 버그를 피할 수 있다.