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
    println clazz.getProtectionDomain().getCodeSource()
    bytes = clazz.getProtectionDomain().getCodeSource().getLocation().getBytes();
    println "Class [Name:${clazz.getName()}] Bytes:${bytes.length} Interfaces: ${clazz.getInterfaces()}";

    sh("echo 1")

    clazz = this.getClass();
    bytes = clazz.getProtectionDomain().getCodeSource().getLocation().getBytes();
    println "Class [Name:${clazz.getName()}] Bytes:${bytes.length} Interfaces: ${clazz.getInterfaces()}";

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