pipeline {
  agent any
  stages {
    stage('Test') {
      step {
        sh 'echo testing'
      }
    }
  }
}
