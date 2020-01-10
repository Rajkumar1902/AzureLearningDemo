pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
			    echo 'Builing..'
                bat 'mvnw package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
		    echo 'Deploying..'
            when {
              expression {
                currentBuild.result == null || currentBuild.result == 'SUCCESS' 
              }
            }
            steps {
                bat 'make publish'
            }
        }
    }
}