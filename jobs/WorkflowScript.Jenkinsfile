@Grab('com.rookout.rook')
import com.rookout.rook.API
import com.rookout.rook.RookOptions

node {
    stage("Stage One") {
        RookOptions opts = new RookOptions()
        opts.token = "ASDASD"
        API.start(opts)
        shell("echo Hello")
        stageOne()
    }

    stage("Stage Two") {
        stageTwo()
    }
}

@NonCPS
def stageOne() {
    sh 'echo $0'
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