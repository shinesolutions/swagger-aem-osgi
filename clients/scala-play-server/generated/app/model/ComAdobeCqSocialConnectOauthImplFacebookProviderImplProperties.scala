package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties(
  oauthProviderId: Option[ConfigNodePropertyString],
  oauthCloudConfigRoot: Option[ConfigNodePropertyString],
  providerConfigRoot: Option[ConfigNodePropertyString],
  providerConfigCreateTagsEnabled: Option[ConfigNodePropertyBoolean],
  providerConfigUserFolder: Option[ConfigNodePropertyDropDown],
  providerConfigFacebookFetchFields: Option[ConfigNodePropertyBoolean],
  providerConfigFacebookFields: Option[ConfigNodePropertyArray],
  providerConfigRefreshUserdataEnabled: Option[ConfigNodePropertyBoolean]
)

object ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties {
  implicit lazy val comAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesJsonFormat: Format[ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties] = Json.format[ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties]
}

