@Grab(group='com.rookout', module='rook', version='0.1.76')
import com.rookout.rook.API
import com.rookout.rook.RookOptions


def call(body) {
    def pipelineParams = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams

    RookOptions opts = new RookOptions()
    opts.token = pipelineParams.token
    API.start(opts)
}
