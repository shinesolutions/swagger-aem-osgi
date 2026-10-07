package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteRestImplServletDefaultGETServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteRestImplServletDefaultGETServletProperties(
  defaultLimit: Option[ConfigNodePropertyInteger],
  useAbsoluteUri: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteRestImplServletDefaultGETServletProperties {
  implicit lazy val comAdobeGraniteRestImplServletDefaultGETServletPropertiesJsonFormat: Format[ComAdobeGraniteRestImplServletDefaultGETServletProperties] = Json.format[ComAdobeGraniteRestImplServletDefaultGETServletProperties]
}

