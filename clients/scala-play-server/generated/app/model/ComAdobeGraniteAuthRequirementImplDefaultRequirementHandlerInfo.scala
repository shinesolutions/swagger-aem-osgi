package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties]
)

object ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo {
  implicit lazy val comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoJsonFormat: Format[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo] = Json.format[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo]
}

