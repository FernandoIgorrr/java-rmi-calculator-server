# java-rmi-calculator-server
Servidor das funções básicas de uma calculadora com rmi

Dirija-se até a pasta java do projeto *java-rmi-calculator-server/src/main/java* <br>
compile as classes e interfaces normalmente: <br>
```
javac com/server/interfaces/ICalculator.java
javac com/server/classes/Calculator.java
javac com/server/RMICalculatorServer.java
```

Aqui é para gerar o stub para a comunicação remota:
```
rmic com.server.classes.Calculator
```
Voltamos a compilar o resto das classes normalmente(a única que falta):
```
javac com/server/RMICalculatorClient.java
```

Agora só executar o servidor e em seguida o client:
```
java -Djava.security.policy=server.policy com.server.RMICalculatorServer
java -Djava.security.policy=server.policy com.server.RMICalculatorClient
```
