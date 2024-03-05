# Singleton Pattern
## 정의
Singleton Pattern은 인스턴스가 하나만 존재하는 것을 보증하는 패턴이다.

## 특징
Singleton은 static필드(클래스 변수)로 정의되고 Singleton 클래스의 인스턴스에서 초기화한다. 

Singleton 클래스의 생성자는 private으로 되어 있다. 
이는 Singleton 클래스 외부에서 생성자 호출을 금지하기 위해서이다.

Singleton 클래스의 유일한 인스턴스를 얻는 메소드로 getInstance가 제공된다. 이 getInstance는 static Factory Method의 일종이다.

- 필요한 이유<br>
  인스턴스가 여러 개 존재하면 인스턴스가 서로 영향을 미쳐 의외의 버그를 만들어 낼 수 있다. 그러나 인스턴스가 하나라는 보장이 있다면 그 전제 조건 하에서 프로그래밍을 할 수 있다.

- 생성 시기<br>
  프로그램 성성 후 처음 getInstance 메소드를 호출할 때 Singleton클래스가 초기화된다. 그리고 이 때 static 필드가 초기화되며 유일한 인스턴스가 만들어진다.

## 구성요소
- Singleton 클래스<br>
Singleton클래스는 유일한 인스턴스를 얻기 위한 static 메소드를 가지고 있다. 이 메소드는 항상 같은 인스턴스를 반환한다. 

 