package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties(
  name: Option[ConfigNodePropertyString],
  minPoolSize: Option[ConfigNodePropertyInteger],
  maxPoolSize: Option[ConfigNodePropertyInteger],
  queueSize: Option[ConfigNodePropertyInteger],
  maxThreadAge: Option[ConfigNodePropertyInteger],
  keepAliveTime: Option[ConfigNodePropertyInteger],
  blockPolicy: Option[ConfigNodePropertyDropDown],
  shutdownGraceful: Option[ConfigNodePropertyBoolean],
  daemon: Option[ConfigNodePropertyBoolean],
  shutdownWaitTime: Option[ConfigNodePropertyInteger],
  priority: Option[ConfigNodePropertyDropDown]
)

object OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties {
  implicit lazy val orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesJsonFormat: Format[OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties] = Json.format[OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties]
}

