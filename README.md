# Kubernetes

Important Command to Build and Run applications:

**Docker images find/delete:**
docker ps 	// container
docker images  	// images
docker image rm 	// remove docker image

**Build docker app:**
docker build -t sagarunhale2294/kubernetes-demo .

**Run docker app:**
docker run -p 8080:8080 sagarunhale2294/kubernetes-demo
docker run -it -p 8080:8080 -d sagarunhale2294/kubernetes-demo

**Push docker image to docker hub:**
docker push sagarunhale2294/kubernetes-demo:latest

**Pull docker image from docker hub:**
docker pull sagarunhale2294/kubernetes-demo:latest


**Port forwarding:**
kubectl port-forward <pod/container_name> 8080:8080

**Get the details of Pod/Service:**
Kubectl describe pod <pod_name>
Kubectl describe service <service_name>
