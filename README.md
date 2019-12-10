mvn archetype:generate -DarchetypeGroupId=org.openjdk.jmh -DarchetypeArtifactId=jmh-java-benchmark-archetype

mvn clean package

java -jar target/benchmarks.jar

```
Benchmark                        Mode  Cnt         Score        Error  Units
DefangingIp.usingString         thrpt   25   2067720,190 ±  42074,144  ops/s
DefangingIp.usingStringBuilder  thrpt   25  17374206,713 ± 145536,904  ops/s
```