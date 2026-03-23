def call(String Project, String ImageTag, String dockerhubuser){
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'DOCKER_PASS', usernameVariable: 'DOCKER_USER')]) {
        bat "docker login -u %DOCKER_USER% -p %DOCKER_PASS%"
    }
    bat "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}