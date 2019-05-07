pipelineJob('WorkflowScript') {
    definition {
        cps {
            script(readFileFromWorkspace('jobs/WorkflowScript.Jenkinsfile'))
            sandbox()
        }
    }
}
