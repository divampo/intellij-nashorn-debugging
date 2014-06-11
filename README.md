### 01-HelloNashorn ###

**Working example**

Example was taken from [http://blog.jetbrains.com/idea/2014/03/debugger-for-jdk8s-nashorn-javascript-in-intellij-idea-13-1/](http://)

Single module, used relative path to load javascript file 

`engine.eval("load('src/main/resources/js/helloWorld.js')");`

### 02-HelloNashorn_submodule ###

**Not working example**

Project conteins submodule, doesn't make sense how javascript file is loaded  

`engine.eval("load('src/main/resources/js/helloWorld.js')");`


### 03-HelloNashorn_abspath ###

**Not working example**

Single module, used absolute path to load javascript file 

`engine.eval("load('" + NashornDemo.class.getResource("/js/helloWorld.js").getPath() + "')");`


