package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCommonsLogLogManagerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCommonsLogLogManagerProperties(
  orgApacheSlingCommonsLogLevel: Option[ConfigNodePropertyDropDown],
  orgApacheSlingCommonsLogFile: Option[ConfigNodePropertyString],
  orgApacheSlingCommonsLogFileNumber: Option[ConfigNodePropertyInteger],
  orgApacheSlingCommonsLogFileSize: Option[ConfigNodePropertyString],
  orgApacheSlingCommonsLogPattern: Option[ConfigNodePropertyString],
  orgApacheSlingCommonsLogConfigurationFile: Option[ConfigNodePropertyString],
  orgApacheSlingCommonsLogPackagingDataEnabled: Option[ConfigNodePropertyBoolean],
  orgApacheSlingCommonsLogMaxCallerDataDepth: Option[ConfigNodePropertyInteger],
  orgApacheSlingCommonsLogMaxOldFileCountInDump: Option[ConfigNodePropertyInteger],
  orgApacheSlingCommonsLogNumOfLines: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingCommonsLogLogManagerProperties {
  implicit lazy val orgApacheSlingCommonsLogLogManagerPropertiesJsonFormat: Format[OrgApacheSlingCommonsLogLogManagerProperties] = Json.format[OrgApacheSlingCommonsLogLogManagerProperties]
}

