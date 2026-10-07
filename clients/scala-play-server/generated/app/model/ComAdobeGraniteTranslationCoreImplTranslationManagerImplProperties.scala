package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties(
  defaultConnectorName: Option[ConfigNodePropertyString],
  defaultCategory: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties {
  implicit lazy val comAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesJsonFormat: Format[ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties] = Json.format[ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties]
}

