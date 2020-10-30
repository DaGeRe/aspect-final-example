# Running

This project demonstrates a problem when running AspectJ in Java 11.

To run it, build both projects e.g. using `cd aspect/ && mvn clean package && cd ../woven-project && mvn clean package` and afterwards run

`./runMainWithError.sh`

to get the error and

`runMainWithoutError.sh`

to show the output if the error does not appear (== if the field is not declared final).
