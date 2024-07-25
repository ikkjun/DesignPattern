# Proxy Pattern
## 정의
본인이 할 수 있는 일을 맡기고자 대리인을 내세운다.
객체지향에서는 본인도 대리인도 객체(오브젝트)가 된다.
바빠서 그 일을 힐 수 없는 본인 객체를 대신해서 대리인 객체가 어느 정도 일을 처리하게 된다.

## 구성요소
- Subject(본인) 역
Proxy와 Subject를 동일시 하기 위한 인터페이스를 정의한다. (Printable)
- Proxy(대리인) 역
Client의 요청을 최대한 처리하고, 혼자서 처리할 수 앖는 작업은 다른 클래스에게 맡긴다. (PrinterProxy)
- RealSubject(실제 본인) 역
- Client(의뢰인) 역