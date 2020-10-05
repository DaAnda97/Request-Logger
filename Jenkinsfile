pipeline {

  agent any

  stages {

    stage('Setup') {
      steps {
        sh "./mvnw clean"
      }
    }

    stage('Download Dependencies') {
      steps {
        sh './mvnw dependency:purge-local-repository'
      }
    }

    stage('Test') {
      steps {
        sh "./mvnw test"
      }
    }

    stage('Package') {
      steps {
        sh "./mvnw package -DskipTests"
      }
    }


    stage('Dockerize') {
      when { expression { env.BRANCH_NAME ==~ /master/  } }
      steps {
        sh "docker build . -t andreasriepl/request-logger"
      }
    }

  }
}