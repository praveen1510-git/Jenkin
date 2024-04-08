FROM eclipse-temurin:17
COPY target/rock.jar rock.jar
CMD [ "java","-jar","rock.jar" ]