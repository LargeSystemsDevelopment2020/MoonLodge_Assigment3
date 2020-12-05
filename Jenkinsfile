pipeline {
    agent any
    //{    
        // docker {
        //     image "maven:3.6.3-adoptopenjdk-14"
        // }
   // }
    stages {
        stage(' mvn package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}