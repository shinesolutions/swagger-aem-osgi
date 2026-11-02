package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteSecurityUserUserPropertiesServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties(
  adapterCondition: Option[ConfigNodePropertyString],
  graniteUserpropertiesNodetypes: Option[ConfigNodePropertyArray],
  graniteUserpropertiesResourcetypes: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteSecurityUserUserPropertiesServiceProperties {
  implicit lazy val comAdobeGraniteSecurityUserUserPropertiesServicePropertiesJsonFormat: Format[ComAdobeGraniteSecurityUserUserPropertiesServiceProperties] = Json.format[ComAdobeGraniteSecurityUserUserPropertiesServiceProperties]
}

