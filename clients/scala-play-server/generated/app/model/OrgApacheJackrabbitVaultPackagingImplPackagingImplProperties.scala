package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitVaultPackagingImplPackagingImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties(
  packageRoots: Option[ConfigNodePropertyArray]
)

object OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties {
  implicit lazy val orgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesJsonFormat: Format[OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties] = Json.format[OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties]
}

