package demo;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornDemo {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");


        HelloWorld helloWorld = (HelloWorld)engine.eval("load('" + NashornDemo.class.getResource("/js/helloWorld.js").getPath() + "')");

        String hello = helloWorld.sayHello("Nashorn");

        System.out.println(hello);

    }
}
