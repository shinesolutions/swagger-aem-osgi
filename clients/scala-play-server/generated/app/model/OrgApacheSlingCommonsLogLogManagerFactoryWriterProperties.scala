package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(
  orgApacheSlingCommonsLogFile: Option[ConfigNodePropertyString],
  orgApacheSlingCommonsLogFileNumber: Option[ConfigNodePropertyInteger],
  orgApacheSlingCommonsLogFileSize: Option[ConfigNodePropertyString],
  orgApacheSlingCommonsLogFileBuffered: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
  implicit lazy val orgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesJsonFormat: Format[OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties] = Json.format[OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties]
}

