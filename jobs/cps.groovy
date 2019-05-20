@Grab(group='com.rookout', module='rook', version='0.1.76');

pipelineJob('WorkflowScript') {
    definition {
        cps {
            script(readFileFromWorkspace('jobs/WorkflowScript.Jenkinsfile'))
            sandbox()
        }
    }
}

pipelineJob('WorkflowScriptOther') {
    definition {
        cps {
            script(readFileFromWorkspace('jobs/WorkflowScriptOther.Jenkinsfile'))
            sandbox()
        }
    }
}

pipelineJob('WorkflowScriptNonCps') {
    definition {
        cps {
            script(readFileFromWorkspace('jobs/WorkflowScriptNonCps.Jenkinsfile'))
            sandbox()
        }
    }
}
