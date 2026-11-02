package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingEngineImplAuthSlingAuthenticatorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(
  osgiHttpWhiteboardContextSelect: Option[ConfigNodePropertyString],
  osgiHttpWhiteboardListener: Option[ConfigNodePropertyString],
  authSudoCookie: Option[ConfigNodePropertyString],
  authSudoParameter: Option[ConfigNodePropertyString],
  authAnnonymous: Option[ConfigNodePropertyBoolean],
  slingAuthRequirements: Option[ConfigNodePropertyArray],
  slingAuthAnonymousUser: Option[ConfigNodePropertyString],
  slingAuthAnonymousPassword: Option[ConfigNodePropertyString],
  authHttp: Option[ConfigNodePropertyDropDown],
  authHttpRealm: Option[ConfigNodePropertyString],
  authUriSuffix: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties {
  implicit lazy val orgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesJsonFormat: Format[OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties] = Json.format[OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties]
}

