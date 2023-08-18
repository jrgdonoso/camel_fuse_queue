FROM registry.redhat.io/fuse7/fuse-eap-openshift-jdk8-rhel7:latest

WORKDIR /deployment

COPY . /deployment


USER root

RUN sed -i 's/\r$//' ./mvnw && \
    sh ./mvnw clean package -Dskiptests



EXPOSE ${PORTFUSE}
EXPOSE ${APPPORT}

ENTRYPOINT [ "java", "-jar", "./target/KCC-Migracion-Integraciones-Fuse-Entregas-KCH-0.0.1-SNAPSHOT.jar" ]