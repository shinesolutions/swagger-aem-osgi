package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties(
  orgApacheSlingCommonsLogLevel: Option[ConfigNodePropertyDropDown],
  orgApacheSlingCommonsLogFile: Option[ConfigNodePropertyString],
  orgApacheSlingCommonsLogPattern: Option[ConfigNodePropertyString],
  orgApacheSlingCommonsLogNames: Option[ConfigNodePropertyArray],
  orgApacheSlingCommonsLogAdditiv: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties {
  implicit lazy val orgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesJsonFormat: Format[OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties] = Json.format[OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties]
}

