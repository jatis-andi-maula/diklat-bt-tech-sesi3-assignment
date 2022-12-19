pipeline {
    agent any

    // tools {
    //     // Install the Maven version configured as "M3" and add it to the path.
    //     maven "M3"
    // }

    stages {
        stage('Git Clone') {
            steps {
                git branch: 'main', url: 'https://gitlab.com/andi.malik/andimalik-app.git'
            }
        }
        
        stage('Build') {
            steps {
                script {
                    sh "mvn clean package"
                }
            }
        }
    }
}
