def call(String project) {



        
  sh 'docker build . -t deekshithsn/devops-training:$Docker_tag'
		   withCredentials([string(credentialsId: 'docker_password', variable: 'docker_password')]) {
				    
				  sh 'docker login -u fdamoni -p Xhevdet1!'
				  sh 'docker push fdamoni/devops-training:$Docker_tag'
			}
}
