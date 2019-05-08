pipelineJob('WorkflowScript') {
    definition {
        cps {
            script(readFileFromWorkspace('jobs/WorkflowScript.Jenkinsfile'))
            sandbox()
        }
    }
}

pipelineJob('WorkflowScript') {
    definition {
        cps {
            script(readFileFromWorkspace('jobs/WorkflowScriptNonCps.Jenkinsfile'))
            sandbox()
        }
    }
}
