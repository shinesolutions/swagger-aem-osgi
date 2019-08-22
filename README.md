Swagger AEM OSGI
-----------

Swagger AEM OSGI is an OpenAPI specification for configuring [Adobe Experience Manager (AEM)](http://www.adobe.com/au/marketing-cloud/enterprise-content-management.html) API.

This specification is used to generate client libraries for Ruby, Python, node.js, and Java using [Swagger Code Generator](https://github.com/swagger-api/swagger-codegen).

Learn more about Swagger AEM:

* [Generated Clients](https://github.com/shinesolutions/swagger-aem-osgi#generated-clients)
* [Development](https://github.com/shinesolutions/swagger-aem-osgi#development)
* [Testing](https://github.com/shinesolutions/swagger-aem-osgi#testing)
* [Frequently Asked Questions](https://github.com/shinesolutions/swagger-aem-osgi#frequently-asked-questions)
* [Versions History](https://github.com/shinesolutions/swagger-aem-osgi/blob/master/docs/versions.md)
* [Contribution](https://github.com/shinesolutions/swagger-aem-osgi#contribution)
* [Presentations](https://github.com/shinesolutions/swagger-aem-osgi/#presentations)

Swagger AEM OSGI is part of [AEM OpenCloud](https://aemopencloud.io) platform but it can be used as a stand-alone.

Generated Clients
-----------------

| Language   | Package                                                                                                                                                                                                                                                                 | Getting Started                                                                                                                                                                         | Status                                                                                                                                       |
|------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------|
| Ruby       | [swagger_aem_osgi](https://rubygems.org/gems/swagger_aem_osgi) [![Published Version](https://badge.fury.io/rb/swagger_aem_osgi.svg)](https://rubygems.org/gems/swagger_aem_osgi)                                                                                                            | [README](https://github.com/shinesolutions/swagger-aem-osgi/blob/master/ruby/README.md) [CHANGELOG](https://github.com/shinesolutions/swagger-aem-osgi/blob/master/ruby/CHANGELOG.md)             | [![swagger_aem_osgi Build Status](https://img.shields.io/travis/shinesolutions/swagger-aem-osgi.svg)](http://travis-ci.org/shinesolutions/swagger-aem-osgi) |
| Python     | [swaggeraemosgi](https://pypi.python.org/pypi/swaggeraemosgi) [![Published Version](https://badge.fury.io/py/swaggeraemosgi.svg)](https://pypi.python.org/pypi/swaggeraemosgi)                                                                                                          | [README](https://github.com/shinesolutions/swagger-aem-osgi/blob/master/python/README.md) [CHANGELOG](https://github.com/shinesolutions/swagger-aem-osgi/blob/master/python/CHANGELOG.md)         |                                                                                                                                              |
| Java       | [swaggeraemosgi4j](http://mvnrepository.com/artifact/com.shinesolutions/swaggeraemosgi4j) [![Published Version](https://maven-badges.herokuapp.com/maven-central/com.shinesolutions/swaggeraemosgi4j/badge.svg)](http://mvnrepository.com/artifact/com.shinesolutions/swaggeraemosgi4j) | [README](https://github.com/shinesolutions/swagger-aem-osgi/blob/master/java/README.md) [CHANGELOG](https://github.com/shinesolutions/swagger-aem-osgi/blob/master/java/CHANGELOG.md)             |                                                                                                                                              |
| JavaScript | Work in progress                                                                                                                                                                                                                                                        | [README](https://github.com/shinesolutions/swagger-aem-osgi/blob/master/javascript/README.md) [CHANGELOG](https://github.com/shinesolutions/swagger-aem-osgi/blob/master/javascript/CHANGELOG.md) |                                                                                                                                              |

Development
-----------

To run build targets using `swagger-codegen` in your path:

    make <target>

If you want to use a custom `swagger-codegen-cli.jar`:

    SWAGGER_CODEGEN_CLI_JAR=/path/to/swagger-codegen-cli.jar make <target>

Testing
-------

Unit tests are generated by `swagger-codegen` along with the client code.

Integration tests are part of Swagger AEM OSGI and require an AEM instance running on port 4502 with [Shine Solutions AEM Health Check](https://github.com/shinesolutions/aem-healthcheck) package installed.

By default it uses AEM running on http://localhost:4502 with `admin` username and `admin` password. AEM instance parameters can be configured using environment variables `aem_protocol`, `aem_host`, `aem_port`, `aem_username`, `aem_password`, and `aem_debug`.

Frequently Asked Questions
--------------------------

* __Q:__ How can I generate a new OpenAPI specification ?

  __A:__ To generate a new OpenAPI specification e.g. when there is a new release of AEM you simply can run the tool  `api_generator.rb`.

  Usage:

  `# ruby tools/openapi_spec_generator.rb --in templates/api.yml --out conf/api.yml'`

* __Q:__ How can I define a custom AEM host, user and password to generate OpenAPI Spec file ?

__A:__ To run the OpenAPI Spec generator against a defined AEM Host or to define your own username and password to authenticate against AEM you need to define them as environment variables

usage:
```
aem_protocol=https \
aem_host=author.sandpit.aemopencloud.net \
aem_port=443 \
aem_username=admin \
aem_password=admin \
ruby tools/openapi_spec_generator.rb --in templates/api.yml --out conf/api.yml
```

Contribution
------------

Since swagger-aem-osgi contains multiple languages, add a `[ruby|python|javascript|java]` prefix to language-specific commits, this will help with filtering full commits log.

Tagging should also be prefixed with:

* `api` when the release is for the OpenAPI specification, e.g. `api-1.0.0`
* `ruby|python|javascript|java` when the release is for the generated client, e.g. `ruby-0.9.2`, `python-0.9.0`

Presentations
-------------

* [Beyond AEM Curl Commands](https://www.slideshare.net/cliffano/beyond-aem-curl-commands) at [Adobe Immerse'18](https://immerse18.adobe-devs.adobeevents.com/)
* [Building An AEM API Clients Ecosystem](https://www.slideshare.net/cliffano/building-an-aem-api-clients-ecosystem/) at [Adobe Experience Cloud Meetup - 5th Edition](https://www.meetup.com/Melbourne-Adobe-Experience-Cloud/events/249851899/)
