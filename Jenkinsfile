pipeline{
    environment{
        docker_image=""
    }
    agent any
    stages{
        stage('git clone'){
            steps{
                git branch:'master'
                url:"https://github.com/chaithanya99/Calculator.git"

            }
        }
        stage('maven build'){
            steps{
                sh 'mvn clean compile install'
            }
        }
    }
}