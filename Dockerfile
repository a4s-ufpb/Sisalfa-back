FROM tomcat:8.5.57-jdk8-openjdk
RUN sed -i 's/8080/8081/' /usr/local/tomcat/conf/server.xml
EXPOSE 8081
COPY ./target/Sisalfa-back.war /usr/local/tomcat/webapps/