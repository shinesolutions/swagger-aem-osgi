package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties(
  hcTags: Option[ConfigNodePropertyArray],
  accountLogins: Option[ConfigNodePropertyArray],
  consoleLogins: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties {
  implicit lazy val comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesJsonFormat: Format[ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties] = Json.format[ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties]
}

