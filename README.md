# ServiceLoader
<br/>

## 테스트 순서 
1. 인터페이스 HelloInterface를 만들고,<br/>
이를 구현한 Hello, Hallo를 만든다.<br/>
<br/>
2. resources/META-INF/services 디렉토리에 HelloInterface의 패키지명이 포함된 풀네임으로 된 파일을 만들고,<br/>
내용으로 Hello, Hallo의 패키지명이 포함된 풀네임을 적는다.<br/>
<br/>
3. 그리고 HelloMain에서 ServiceLoader로 HelloInterface를 구현한 클래스들의 메소드를 실행한다.<br/>
<br/><br/>

## 실제로는.. 
사실은 HelloInterface 인터페이스와
이를 구현한 구현체 클래스, ServiceLoader를 사용해서 메소드를 실행하는 클래스<br/>
모두 다 다른 프로젝트에 있다고 생각해야 한다. (사실 귀찮아서 한 곳에다 만들었ㄷ..)<br/>
각각 패키지로 만들고 메이븐 인스톨해서 로컬 저장소에 저장하고 의존성을 추가해서 테스트하면 된다. <br/>
<br/><br/>

## 중요!
여기에서 가장 중요한 부분은..<br/>
HelloMain에서는 HelloInterface 인터페이스의 구현체가 어떤 것들이 있는지 모른다는 것이다. <br/>
어떤 구현체들이 있는지 모르는 상태에서 ServiceLoader를 사용하여 <br/>
구현체들이 오버라이딩한 메소드들을 실행하는 것이다. <br/>
<br/><br/>

## 기타
커스텀 프로세서를 만들때에도 자바 Processor의 풀네임으로 된 파일을 만들었었는데..<br/>
Processor도 인터페이스이다.<br/>
어디선가 ServiceLoader로 Processor의 구현체들의 process() 메소드를 실행하는 것 같다. <br/>
(기본적으로 그렇게 실행하는 것 같다.)<br/>
그런데 실행이 아니라 컴파일만 했을 때 process()가 실행된다.<br/>
컴파일할 때 기본적으로 Processor 구현체들의 process()를 실행하는 것 같다. <br/>
자세한건 더 공부해봐야 알겠지만..  <br/>
<br/>

https://docs.oracle.com/javase/7/docs/api/java/util/ServiceLoader.html <br/>
https://docs.oracle.com/javase/9/docs/api/java/util/ServiceLoader.html <br/>
<br/><br/>

https://www.baeldung.com/java-annotation-processing-builder <br/>
<br/><br/>