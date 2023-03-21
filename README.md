# maven-docker

## create release artifact
mvn clean package

## create image from dockerfile using podman
podman build -t maven-docker -f ./Dockerfile .

## create container from image using podman
podman run --rm --name maven-docker -v ./data:/opt maven-docker

## start container
podman start -a maven-docker

### FAQ

- list all containers: podman ps -a
- remove all containers: podman rm -a