node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/TaylorHudson/jenkins-pipeline-demo.git'
  }

  stage("Compilation") {
    sh "./mvnw clean install -DskipTests"
  }

  stage("Tests") {
    sh "./mvnw install"
  }

  stage("Deployment") {
      sh "nohup ./mvnw spring-boot:run &"
  }

}