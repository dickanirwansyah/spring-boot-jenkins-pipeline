pipeline {
    agent any
    tools {
        maven 'Apache Maven 3.6.3'
    }
    stages {
        stage ('Build Maven Project') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/dickanirwansyah/spring-boot-jenkins-pipeline']])
                sh 'mvn clean install'
            }
        }
        stage ('Build Docker Images') {
            steps {
                script {
                    sh 'docker build -t dickanirwansyah1996/spring-boot-jenkins-pipeline:latest .'
                }
            }
        }
        stage ('Push Docker Images to Docker Hub'){
            steps {
                script {
                    withCredentials([string(credentialsId: 'springdocker', variable: 'springdockerkey')])  {
                        sh 'docker login -u dickanirwansyah1996 -p ${springdockerkey}'
                    }
                        sh 'docker push dickanirwansyah1996/spring-boot-jenkins-pipeline:latest'
                }
            }
        }
    }
}