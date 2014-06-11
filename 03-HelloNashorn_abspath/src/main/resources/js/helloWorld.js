var HelloHelper = Java.type("demo.HelloHelper");
var helloHelper = new HelloHelper();

function sayHelloImpl(name) {
    return helloHelper.getPrefix() + " " + name;
}

function newHelloWorld() {
    return new Packages.demo.HelloWorld() {
        sayHello: sayHelloImpl
    }
}

newHelloWorld();