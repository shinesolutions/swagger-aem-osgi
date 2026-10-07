package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheFelixScrScrServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheFelixScrScrServiceProperties(
  dsLoglevel: Option[ConfigNodePropertyDropDown],
  dsFactoryEnabled: Option[ConfigNodePropertyBoolean],
  dsDelayedKeepInstances: Option[ConfigNodePropertyBoolean],
  dsLockTimeoutMilliseconds: Option[ConfigNodePropertyInteger],
  dsStopTimeoutMilliseconds: Option[ConfigNodePropertyInteger],
  dsGlobalExtender: Option[ConfigNodePropertyBoolean]
)

object OrgApacheFelixScrScrServiceProperties {
  implicit lazy val orgApacheFelixScrScrServicePropertiesJsonFormat: Format[OrgApacheFelixScrScrServiceProperties] = Json.format[OrgApacheFelixScrScrServiceProperties]
}

