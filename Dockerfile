# Usando uma imagem oficial do OpenJDK com Maven
FROM maven:3.9.2-eclipse-temurin-17 as build

# Definir diretório de trabalho no contêiner
WORKDIR /app

# Copiar o arquivo pom.xml e o diretório src para o contêiner
COPY pom.xml .
COPY src ./src

# Construir o projeto (compilar e empacotar o .jar)
RUN mvn clean package -DskipTests

# Imagem final usando OpenJDK 17
FROM eclipse-temurin:17-jdk

# Definir diretório de trabalho
WORKDIR /app

# Copiar o arquivo JAR gerado na etapa de build
COPY --from=build /app/target/gerenciamento_de_vagas-0.0.1-SNAPSHOT.jar ./gerenciamento_de_vagas.jar

# Expôr a porta que o Spring Boot estará ouvindo
EXPOSE 8080

# Comando para rodar a aplicação Spring Boot
ENTRYPOINT ["java", "-jar", "/app/gerenciamento_de_vagas.jar"]
