package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthOauthImplGraniteProviderProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthOauthImplGraniteProviderProperties(
  oauthProviderId: Option[ConfigNodePropertyString],
  oauthProviderGraniteAuthorizationUrl: Option[ConfigNodePropertyString],
  oauthProviderGraniteTokenUrl: Option[ConfigNodePropertyString],
  oauthProviderGraniteProfileUrl: Option[ConfigNodePropertyString],
  oauthProviderGraniteExtendedDetailsUrls: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteAuthOauthImplGraniteProviderProperties {
  implicit lazy val comAdobeGraniteAuthOauthImplGraniteProviderPropertiesJsonFormat: Format[ComAdobeGraniteAuthOauthImplGraniteProviderProperties] = Json.format[ComAdobeGraniteAuthOauthImplGraniteProviderProperties]
}

