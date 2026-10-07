package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheFelixEventadminImplEventAdminProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheFelixEventadminImplEventAdminProperties(
  orgApacheFelixEventadminThreadPoolSize: Option[ConfigNodePropertyInteger],
  orgApacheFelixEventadminAsyncToSyncThreadRatio: Option[ConfigNodePropertyFloat],
  orgApacheFelixEventadminTimeout: Option[ConfigNodePropertyInteger],
  orgApacheFelixEventadminRequireTopic: Option[ConfigNodePropertyBoolean],
  orgApacheFelixEventadminIgnoreTimeout: Option[ConfigNodePropertyArray],
  orgApacheFelixEventadminIgnoreTopic: Option[ConfigNodePropertyArray]
)

object OrgApacheFelixEventadminImplEventAdminProperties {
  implicit lazy val orgApacheFelixEventadminImplEventAdminPropertiesJsonFormat: Format[OrgApacheFelixEventadminImplEventAdminProperties] = Json.format[OrgApacheFelixEventadminImplEventAdminProperties]
}

