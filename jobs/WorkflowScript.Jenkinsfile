node {  
    stage("Stage One") {
        stageOne()
    }

    stage("Stage Two") {
        stageTwo()
    }
}

@NonCPS
def stageOne() {
    clazz = this.getClass();
    clazzIns = clazz.newInstance();
    bytes = clazzIns.getProtectionDomain().getCodeSource().getLocation().getBytes();
    println "Class [Name:${clazzIns.getName()}] Bytes:${bytes.length} Interfaces: ${clazzIns.getInterfaces()}";

    sh("echo 1")

    clazz = this.getClass();
    clazzIns = clazz.newInstance().getClosure();
    bytes = clazzIns.getProtectionDomain().getCodeSource().getLocation().getBytes();
    println "Class [Name:${clazzIns.getName()}] Bytes:${bytes.length} Interfaces: ${clazzIns.getInterfaces()}";

    println(this.class.name)
    int num = 1
    println num
    println(this.class.name)
    int num1 = 1
    println num1
}

@NonCPS
def stageTwo() {


    int num = 2
    print(num)
    sh("echo 2")
}