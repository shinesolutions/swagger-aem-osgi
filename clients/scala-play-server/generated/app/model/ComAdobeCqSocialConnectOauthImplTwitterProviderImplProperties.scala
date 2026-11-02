package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(
  oauthProviderId: Option[ConfigNodePropertyString],
  oauthCloudConfigRoot: Option[ConfigNodePropertyString],
  providerConfigRoot: Option[ConfigNodePropertyString],
  providerConfigUserFolder: Option[ConfigNodePropertyDropDown],
  providerConfigTwitterEnableParams: Option[ConfigNodePropertyBoolean],
  providerConfigTwitterParams: Option[ConfigNodePropertyArray],
  providerConfigRefreshUserdataEnabled: Option[ConfigNodePropertyBoolean]
)

object ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties {
  implicit lazy val comAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesJsonFormat: Format[ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties] = Json.format[ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties]
}

