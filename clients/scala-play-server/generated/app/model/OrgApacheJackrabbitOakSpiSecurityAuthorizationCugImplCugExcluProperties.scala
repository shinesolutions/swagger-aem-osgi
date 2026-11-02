package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties(
  principalNames: Option[ConfigNodePropertyArray]
)

object OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties {
  implicit lazy val orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesJsonFormat: Format[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties] = Json.format[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties]
}

