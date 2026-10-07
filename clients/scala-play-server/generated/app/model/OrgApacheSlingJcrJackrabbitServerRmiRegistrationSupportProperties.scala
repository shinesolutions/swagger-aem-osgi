package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties(
  port: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties {
  implicit lazy val orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesJsonFormat: Format[OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties] = Json.format[OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties]
}

