job('Hello World') {
  steps {
    String clazz = execution.getNextScriptName(step.getPath());
    shell("echo ${clazz}")
    shell('echo "Hello World!"')
  }
}