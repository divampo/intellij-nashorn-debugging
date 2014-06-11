### 03-HelloNashorn_abspath ###

**Not working example**

Single module, used absolute path to load javascript file 

`engine.eval("load('" + NashornDemo.class.getResource("/js/helloWorld.js").getPath() + "')");`


