@Grab(group='com.rookout', module='rook', version='0.1.76')
import com.rookout.rook.API
import com.rookout.rook.RookOptions


def call(body) {
    def pipelineParams = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams

//    RookOptions opts = new RookOptions()
//    opts.token = pipelineParams.token
//    opts.host = "wss://staging.control.rookout.com"
//    opts.port = 443
//    opts.log_level = "DEBUG"
//    API.start(opts)
}
