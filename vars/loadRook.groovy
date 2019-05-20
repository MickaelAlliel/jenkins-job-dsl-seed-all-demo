@Grab(group='com.rookout', module='rook', version='0.1.76')
import com.rookout.rook.API
import com.rookout.rook.RookOptions


def call(body) {
    RookOptions opts = new RookOptions()
    opts.token = "ASDASD"
    API.start(opts)
}
