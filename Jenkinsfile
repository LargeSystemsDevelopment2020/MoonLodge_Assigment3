pipeline {
    agent {
        docker {
            image "maven:3.6.3-adoptopenjdk-14"
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}