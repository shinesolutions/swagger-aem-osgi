package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthImsImplIMSProviderImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthImsImplIMSProviderImplProperties(
  oauthProviderId: Option[ConfigNodePropertyString],
  oauthProviderImsAuthorizationUrl: Option[ConfigNodePropertyString],
  oauthProviderImsTokenUrl: Option[ConfigNodePropertyString],
  oauthProviderImsProfileUrl: Option[ConfigNodePropertyString],
  oauthProviderImsExtendedDetailsUrls: Option[ConfigNodePropertyArray],
  oauthProviderImsValidateTokenUrl: Option[ConfigNodePropertyString],
  oauthProviderImsSessionProperty: Option[ConfigNodePropertyString],
  oauthProviderImsServiceTokenClientId: Option[ConfigNodePropertyString],
  oauthProviderImsServiceTokenClientSecret: Option[ConfigNodePropertyString],
  oauthProviderImsServiceToken: Option[ConfigNodePropertyString],
  imsOrgRef: Option[ConfigNodePropertyString],
  imsGroupMapping: Option[ConfigNodePropertyArray],
  oauthProviderImsOnlyLicenseGroup: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteAuthImsImplIMSProviderImplProperties {
  implicit lazy val comAdobeGraniteAuthImsImplIMSProviderImplPropertiesJsonFormat: Format[ComAdobeGraniteAuthImsImplIMSProviderImplProperties] = Json.format[ComAdobeGraniteAuthImsImplIMSProviderImplProperties]
}

