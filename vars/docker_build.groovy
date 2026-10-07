def call(String docker_image, int docker_tag) {
  sh """ 
    docker build -t ${docker_image}:${docker_tag} .
  """ 
  }
