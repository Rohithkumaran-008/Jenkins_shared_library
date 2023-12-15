def call() {
    sh 'trivy image rohith008/youtube:latest > trivyimage.txt'
}
