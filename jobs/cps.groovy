pipelineJob('cpsTest') {
    definition {
        cps {
            script(readFileFromWorkspace('jobs/cpsTest.Jenkinsfile'))
            sandbox()
        }
    }
}
