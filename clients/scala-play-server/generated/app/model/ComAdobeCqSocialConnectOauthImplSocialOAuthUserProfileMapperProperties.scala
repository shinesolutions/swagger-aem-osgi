package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties(
  facebook: Option[ConfigNodePropertyArray],
  twitter: Option[ConfigNodePropertyArray],
  providerConfigUserFolder: Option[ConfigNodePropertyString]
)

object ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties {
  implicit lazy val comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesJsonFormat: Format[ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties] = Json.format[ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties]
}

