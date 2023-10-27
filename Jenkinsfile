pipeline{
    environment{
        docker_image=""
    }
    agent any
    stages{
        stage('git clone'){
            steps{
                git branch:'master',
                url:"https://github.com/chaithanya99/Calculator.git"

            }
        }
        stage('maven build'){
            steps{
                
                sh 'mvn clean compile install'
            }
        }
        stage('docker build'){
            steps{
                docker_image=docker.build "chaithanya970/spe-mini:latest"
            }
        }
        // stage('docker pushing'){
        //     steps{

        //     }
        // }
    }
}