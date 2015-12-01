# Introduction
The project's aim is to smooth your learning path to master Scala programming language.
The project  offers tests with answers that are all supposed to help people learning (and ultimately mastering) 
Scala while solving problems described in [S-99: Ninety-Nine Scala Problems](http://aperiodic.net/phil/scala/s-99/) 
(package pl.japila.scalania.s99, copied from [https://github.com/jaceklaskowski/scalania](https://github.com/jaceklaskowski/scalania)).

# How to use
This project is built by maven. To run all test, type
```
mvn test
``` 
Unit test is wrote in specs, and has annotated with `@RunWith(classOf[JUnitRunner])`. Therefore all unit test could be ran in eclipse directly.

