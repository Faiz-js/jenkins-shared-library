def call(String credentialsId) {
  withCredentials([
    usernamePassword(
      credentialsId: credentialsId,
      usernameVariable: "DOCKER_USERNAME",
      passwordVariable: "DOCKER_PASSWORD"
    )
  ]) 
}
