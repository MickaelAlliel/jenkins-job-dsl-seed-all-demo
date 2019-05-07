node {
    println(this.class.name)

    //// TODO: TEST HERE
        Field f;
        try {
            f = ClassLoader.class.getDeclaredField("classes");
            f.setAccessible(true);
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            Vector<Class> classes =  (Vector<Class>) f.get(classLoader);

            for(Class cls : classes){
                java.net.URL location = cls.getResource('/' + cls.getName().replace('.',
                        '/') + ".class");
                if (!location.toString().contains("rook")) {
                    System.out.println("<p>"+location +"<p/>");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    stage("Stage One") {
        println(this.class.name)
        sh "echo 1"
        int num = 1
        println num
    }

    stage("Stage Two") {
        println(this.class.name)
        def num = 2
        print(num)
        sh("echo 2")
    }
}