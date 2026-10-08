package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthOauthImplGithubProviderImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties(
  oauthProviderId: Option[ConfigNodePropertyString],
  oauthProviderGithubAuthorizationUrl: Option[ConfigNodePropertyString],
  oauthProviderGithubTokenUrl: Option[ConfigNodePropertyString],
  oauthProviderGithubProfileUrl: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteAuthOauthImplGithubProviderImplProperties {
  implicit lazy val comAdobeGraniteAuthOauthImplGithubProviderImplPropertiesJsonFormat: Format[ComAdobeGraniteAuthOauthImplGithubProviderImplProperties] = Json.format[ComAdobeGraniteAuthOauthImplGithubProviderImplProperties]
}

