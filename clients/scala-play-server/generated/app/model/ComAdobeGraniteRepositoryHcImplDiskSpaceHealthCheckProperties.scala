package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties(
  hcTags: Option[ConfigNodePropertyArray],
  diskSpaceWarnThreshold: Option[ConfigNodePropertyInteger],
  diskSpaceErrorThreshold: Option[ConfigNodePropertyInteger]
)

object ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties {
  implicit lazy val comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesJsonFormat: Format[ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties] = Json.format[ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties]
}

