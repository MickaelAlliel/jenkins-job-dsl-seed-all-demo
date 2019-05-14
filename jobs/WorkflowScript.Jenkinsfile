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
    clozure = clazz.newInstance().getClosure();
    clozureClass = clozure.getClass();
    bytes = clozureClass.getProtectionDomain().getCodeSource().getLocation().getBytes();
    println "Class [Name:${clozureClass.getName()}] Bytes:${bytes.length} Interfaces: ${clozureClass.getInterfaces()}";

    sh("echo 1")

    clazz = this.getClass();
    clozure = clazz.newInstance().getClosure();
    clozureClass = clozure.getClass();
    bytes = clozureClass.getProtectionDomain().getCodeSource().getLocation().getBytes();
    println "Class [Name:${clozureClass.getName()}] Bytes:${bytes.length} Interfaces: ${clozureClass.getInterfaces()}";

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