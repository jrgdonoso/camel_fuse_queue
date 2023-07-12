FROM registry.redhat.io/fuse7/fuse-eap-openshift-jdk8-rhel7:latest

WORKDIR /deployment

COPY . /deployment

USER root
RUN chmod -R 777 /deployment/target
RUN sh ./mvnw clean package -Dskiptests

ENV PORT=8081

EXPOSE 8081

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "./target/KCC-FUSE-ORDENES-SERVICIO-0.0.1-SNAPSHOT.jar" ]