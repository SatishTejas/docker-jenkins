pipeline {
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/SatishTejas/docker-jenkins']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    sh 'docker build -t satishkumarjha/dockerjenkins .'
                }
            }
        }
        stage('Pushing Image Into Docker-Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u satishkumarjha -p ${dockerhubpwd}'
                    
                    sh 'docker push satishkumarjha/dockerjenkins'
                    }
                }
            }
        }
    }
}