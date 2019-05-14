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
    println(this.class.name)
    sh "echo 1"
    int num = 1
    println num
    println(this.class.name)
    sh "echo 1"
    int num1 = 1
    println num1
}

@NonCPS
def stageTwo() {


    print(num)
    sh("echo 2")
}