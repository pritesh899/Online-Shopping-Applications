default: 
	javac *.java

registry: 
	rmiregistry 1118 &

runServer: 
	java -Djava.security.policy=policy MarketPlaceServer

runClient: 
	java -Djava.security.policy=policy MarketPlaceClient