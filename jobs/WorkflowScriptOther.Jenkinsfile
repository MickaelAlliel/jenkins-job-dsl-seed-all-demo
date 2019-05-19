node {  
    stage("Stage Three") {
        shell("echo Hello")
        stageThree()
    }

    stage("Stage Four") {
        stageFour()
    }
}

@NonCPS
def stageThree() {
    shell("echo 3")
    println(this.class.name)
}

@NonCPS
def stageFour() {
    int num = 4
    print(num)
    sh("echo 4")
}