job('Hello World') {
  steps {
    shell("echo ${this.class.name}")
    shell('echo "Hello World!"')
  }
}