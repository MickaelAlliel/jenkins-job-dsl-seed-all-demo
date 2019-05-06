String str = "mickael"
int num = 123
def test = "myTest"

job('hello_world') {
  steps {
    shell('echo "Hello World!"')
  }
}
