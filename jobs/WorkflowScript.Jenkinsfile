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
    readlink -f $(which sh)
    readlink -f $(which shell)
    shell("echo 1")
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