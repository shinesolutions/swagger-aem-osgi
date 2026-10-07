package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteCorsImplCORSPolicyImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteCorsImplCORSPolicyImplProperties(
  alloworigin: Option[ConfigNodePropertyArray],
  alloworiginregexp: Option[ConfigNodePropertyArray],
  allowedpaths: Option[ConfigNodePropertyArray],
  exposedheaders: Option[ConfigNodePropertyArray],
  maxage: Option[ConfigNodePropertyInteger],
  supportedheaders: Option[ConfigNodePropertyArray],
  supportedmethods: Option[ConfigNodePropertyArray],
  supportscredentials: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteCorsImplCORSPolicyImplProperties {
  implicit lazy val comAdobeGraniteCorsImplCORSPolicyImplPropertiesJsonFormat: Format[ComAdobeGraniteCorsImplCORSPolicyImplProperties] = Json.format[ComAdobeGraniteCorsImplCORSPolicyImplProperties]
}

