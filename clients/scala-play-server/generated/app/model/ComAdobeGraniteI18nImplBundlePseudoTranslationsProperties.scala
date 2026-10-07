package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteI18nImplBundlePseudoTranslationsProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties(
  pseudoPatterns: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties {
  implicit lazy val comAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesJsonFormat: Format[ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties] = Json.format[ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties]
}

