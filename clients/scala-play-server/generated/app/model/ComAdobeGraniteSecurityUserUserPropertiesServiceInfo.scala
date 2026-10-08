package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteSecurityUserUserPropertiesServiceInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteSecurityUserUserPropertiesServiceInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteSecurityUserUserPropertiesServiceProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object ComAdobeGraniteSecurityUserUserPropertiesServiceInfo {
  implicit lazy val comAdobeGraniteSecurityUserUserPropertiesServiceInfoJsonFormat: Format[ComAdobeGraniteSecurityUserUserPropertiesServiceInfo] = Json.format[ComAdobeGraniteSecurityUserUserPropertiesServiceInfo]
}

