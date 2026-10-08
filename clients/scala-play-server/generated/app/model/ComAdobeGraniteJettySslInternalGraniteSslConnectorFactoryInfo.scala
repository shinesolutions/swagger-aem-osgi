package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties],
  additionalProperties: Option[String],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo {
  implicit lazy val comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoJsonFormat: Format[ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo] = Json.format[ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo]
}

