def globalVar = "hahaha"

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
    def test = null
    def mickael = "mickael"
    shell("echo 3")
    println(this.class.name)
}

@NonCPS
def stageFour() {
    int num = 4
    print(num)
    sh("echo 4")
}