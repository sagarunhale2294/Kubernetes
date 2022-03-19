# Kubernetes

Important Command to Build and Run applications:
————————————————————————————————————————————————————————————————————————
**Docker images find/delete:**
`docker ps 	// container
docker images  	// images
docker image rm 	// remove docker image`
————————————————————————————————————————————————————————————————————————
**Build docker app:**
`docker build -t sagarunhale2294/kubernetes-demo .`
————————————————————————————————————————————————————————————————————————
**Run docker app:**
`docker run -p 8080:8080 sagarunhale2294/kubernetes-demo
docker run -it -p 8080:8080 -d sagarunhale2294/kubernetes-demo`
————————————————————————————————————————————————————————————————————————
**Push docker image to docker hub:**
`docker push sagarunhale2294/kubernetes-demo:latest`
————————————————————————————————————————————————————————————————————————
**Pull docker image from docker hub:**
`docker pull sagarunhale2294/kubernetes-demo:latest`
————————————————————————————————————————————————————————————————————————
**Basic Kubernetes command:**
`$ kubectl apply -f deploy.yml --namespace=my-namespace
$ kubectl delete -f deploy.yml
$ kubectl get pod -n my-namespace
$ kubectl get pod -o wide
$ kubectl get deployments -n my-namespace
$ kubectl get services`
————————————————————————————————————————————————————————————————————————
**Create/Edit deployment using docker image name:**
`$ kubectl create deployment <deployment_name> —image=<docker_image>
e.g.sagarunhale2294/kubernetes-demo
$ kubectl edit deployment <deployment_name>`
————————————————————————————————————————————————————————————————————————
**Port forwarding:**
`$ kubectl port-forward <pod/container_name> 8080:8080`
————————————————————————————————————————————————————————————————————————
**Get the details of Pod/Service:**
`$ kubectl describe pod <pod_name>
$ kubectl describe service <service_name>`

————————————————————————————————————————————————————————————————————————
**Get namespaces:**
// It will used for maintaining the nodes for particular area. like we need to configure particular resources to particular namespace, then we can do that.
`$ kubectl get namespaces`
————————————————————————————————————————————————————————————————————————
**Get Namespaces available nodes:**
`$ kubectl api-resources --namespaced=false $ kubectl api-resources --namespaced=true`
————————————————————————————————————————————————————————————————————————
