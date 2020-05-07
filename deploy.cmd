git clone https://github.com/sivagurut/helloservice

cd helloservice

mvn clean install -DskipTests

mvn -DskipTests com.google.cloud.tools:jib-maven-plugin:build -D image=gcr.io/$GOOGLE_CLOUD_PROJECT/hello-service:0.0.3-SNAPSHOT


kubectl delete deployment hello-service
kubectl delete service hello-service

kubectl create deployment hello-service --image=gcr.io/elevated-server-275615/hello-service:0.0.3-SNAPSHOT

kubectl create service loadbalancer hello-service --tcp=8080:8080
