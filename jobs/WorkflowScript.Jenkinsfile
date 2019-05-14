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
    println(Class.getResource(this.class.name))
    sh("echo 1")
    println(Class.getResource(this.class.name))
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