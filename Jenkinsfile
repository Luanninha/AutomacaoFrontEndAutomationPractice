pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Luanninha/AutomacaoFrontEndAutomationPractice.git'
            }
        }

        stage('Build') {
            steps {
                // Compilação do projeto
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Execução dos testes
                sh 'mvn test'
            }
        }

        stage('Post-build Actions') {
            steps {
                // Ações pós-build, como arquivar relatórios de teste
                junit 'target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            // Passos a serem executados sempre, independente de sucesso ou falha
            cleanWs()
        }
        success {
            // Passos a serem executados em caso de sucesso
            echo 'Build successful!'
        }
        failure {
            // Passos a serem executados em caso de falha
            echo 'Build failed!'
        }
    }
}

