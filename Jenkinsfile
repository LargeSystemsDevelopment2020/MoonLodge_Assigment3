pipeline {
    agent {
        docker {
            image "maven:3.6.3-adoptopenjdk-14"
        }
    }
    stages {
        stage('clean install') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}