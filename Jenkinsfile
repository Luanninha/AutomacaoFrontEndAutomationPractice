pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git credentialsId: 'your-credentials-id', url: 'https://github.com/Luanninha/AutomacaoFrontEndAutomationPractice.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                sh 'echo "Deploying to Staging..."'
                // Adicione seus comandos de implantação aqui
            }
        }
    }

    post {
        success {
            mail to: 'seu-email@exemplo.com',
                 subject: "Success: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
                 body: "Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' completed successfully."
        }
        failure {
            mail to: 'seu-email@exemplo.com',
                 subject: "Failure: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
                 body: "Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' failed. Please check the Jenkins logs for more details."
        }
    }
}

