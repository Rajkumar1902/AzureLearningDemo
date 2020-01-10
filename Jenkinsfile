pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
			    echo 'Builing..'
                bat 'mvn package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            when {
              expression {
                currentBuild.result == null || currentBuild.result == 'SUCCESS' 
              }
            }
            steps {
			    echo 'Deploying..'
                bat 'make publish'
            }
        }
    }
}