pipeline {
    agent {
        docker {
            image 'openjdk:11'
            args '-v "$PWD":/app'
            reuseNode true
        }
    }
    
    stages {
		stage ("build") {
        	steps {
                sh './gradlew clean build'
            }
        }
    }
}