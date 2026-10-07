package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthImsImplImsConfigProviderImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties(
  oauthConfigmanagerImsConfigid: Option[ConfigNodePropertyString],
  imsOwningEntity: Option[ConfigNodePropertyString],
  aemInstanceId: Option[ConfigNodePropertyString],
  imsServiceCode: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties {
  implicit lazy val comAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesJsonFormat: Format[ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties] = Json.format[ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties]
}

