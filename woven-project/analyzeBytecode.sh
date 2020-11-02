mkdir bytecodeanalysis
ajc -inpath target/test-0.1-SNAPSHOT.jar -aspectpath ../aspect/target/aspectjtest-0.1-SNAPSHOT.jar -outjar bytecodeanalysis/output.jar
cd bytecodeanalysis
jar -xf output.jar
javap -v de/test/FinalFieldConstructorExample.class > FinalFieldConstructorExampleWoven.txt

