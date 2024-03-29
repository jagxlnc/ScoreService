FROM ibmcom/websphere-liberty:kernel-ubi-min
USER root
COPY ./liberty/server.xml /config
COPY ./liberty/server.env /config


COPY target/ScoreService-0.0.1-SNAPSHOT.war /config/apps/ScoreService-0.0.1-SNAPSHOT.war
RUN chown -R 1001.0 /config /opt/ibm/wlp/usr/servers/defaultServer /opt/ibm/wlp/usr/shared/resources && chmod -R g+rw /config /opt/ibm/wlp/usr/servers/defaultServer  /opt/ibm/wlp/usr/shared/resources

USER 1001
RUN configure.sh
