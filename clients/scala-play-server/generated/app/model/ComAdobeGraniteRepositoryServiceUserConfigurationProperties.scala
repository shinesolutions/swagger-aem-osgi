package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteRepositoryServiceUserConfigurationProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteRepositoryServiceUserConfigurationProperties(
  serviceRanking: Option[ConfigNodePropertyInteger],
  serviceusersSimpleSubjectPopulation: Option[ConfigNodePropertyBoolean],
  serviceusersList: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteRepositoryServiceUserConfigurationProperties {
  implicit lazy val comAdobeGraniteRepositoryServiceUserConfigurationPropertiesJsonFormat: Format[ComAdobeGraniteRepositoryServiceUserConfigurationProperties] = Json.format[ComAdobeGraniteRepositoryServiceUserConfigurationProperties]
}

