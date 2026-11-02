package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties(
  name: Option[ConfigNodePropertyString],
  types: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties {
  implicit lazy val comAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesJsonFormat: Format[ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties] = Json.format[ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties]
}

