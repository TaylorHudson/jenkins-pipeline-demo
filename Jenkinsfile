pipeline {
	agent any

	environment {
		mavenHome = tool 'jenkins-maven'
	}

	tools {
		jdk 'java-17'
	}

	stages {

	    	stage("Clone the project") {
			steps {
	      			git branch: 'main', url: 'https://github.com/TaylorHudson/jenkins-pipeline-demo.git'
			}
	    	}
    
		stage('Build'){
			steps {
				bat "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				bat "mvn test"
			}
		}

		stage('Deploy') {
			steps {
			    bat "mvn spring-boot:run"
			}
		}
	}
}
