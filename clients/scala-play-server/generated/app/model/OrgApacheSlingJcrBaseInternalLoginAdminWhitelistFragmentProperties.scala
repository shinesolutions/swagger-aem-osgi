package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties(
  whitelistName: Option[ConfigNodePropertyString],
  whitelistBundles: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties {
  implicit lazy val orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesJsonFormat: Format[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties] = Json.format[OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties]
}

