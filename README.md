# A simple program with Scala language

It's just a simple prorgram in Scala language that uses arithmetic methods in Scala.

## prerequisites

You need to have JDK 8 or higher installed on your machine

check Java by:

`Java -version`

you might see something like this:

```
openjdk version "1.8.0_222"
OpenJDK Runtime Environment (build 1.8.0_222-8u222-b10-1ubuntu1~18.04.1-b10)
OpenJDK 64-Bit Server VM (build 25.222-b10, mixed mode)

```

for installing `sbt` visit [sbt reference manual](https://www.scala-sbt.org/release/docs/Setup.html)

## About program

this is a simple command line program that uses arithmetic methods in Scala for add and subtract two city instance. more arithmetic operations are in the way to be implemented.

### how to run project

clone:

`git clone https://gitlab.com/fractalliter/city-arithmetic.git`

go to project folder:

`cd city-arithmetic/`

run sbt:

`sbt`

and after initial build run project with the following command for addition:

`run london 14187146 + paris 12532901`

or this one for subtract:

`run london 14187146 - paris 12532901`