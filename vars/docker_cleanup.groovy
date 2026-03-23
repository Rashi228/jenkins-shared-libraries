def call(String Project, String ImageTag, String DockerHubUser){
    bat "docker rmi ${DockerHubUser}/${Project}:${ImageTag}"
}