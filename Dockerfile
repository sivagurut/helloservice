ARG MAVEN_VERSION=latest
FROM maven:${MAVEN_VERSION}
CMD ["mvnw", "-DskipTests com.google.cloud.tools:jib-maven-plugin:build -Dimage=gcr.io/elevated-server-275615/hello-service"]
