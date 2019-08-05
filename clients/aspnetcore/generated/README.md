# Org.OpenAPITools - ASP.NET Core 2.0 Server

Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API

## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```

## Run in Docker

```
cd src/Org.OpenAPITools
docker build -t org.openapitools .
docker run -p 5000:5000 org.openapitools
```
