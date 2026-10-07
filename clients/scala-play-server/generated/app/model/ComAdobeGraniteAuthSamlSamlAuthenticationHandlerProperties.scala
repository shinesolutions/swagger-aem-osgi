package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties(
  path: Option[ConfigNodePropertyArray],
  serviceRanking: Option[ConfigNodePropertyInteger],
  idpUrl: Option[ConfigNodePropertyString],
  idpCertAlias: Option[ConfigNodePropertyString],
  idpHttpRedirect: Option[ConfigNodePropertyBoolean],
  serviceProviderEntityId: Option[ConfigNodePropertyString],
  assertionConsumerServiceURL: Option[ConfigNodePropertyString],
  spPrivateKeyAlias: Option[ConfigNodePropertyString],
  keyStorePassword: Option[ConfigNodePropertyString],
  defaultRedirectUrl: Option[ConfigNodePropertyString],
  userIDAttribute: Option[ConfigNodePropertyString],
  useEncryption: Option[ConfigNodePropertyBoolean],
  createUser: Option[ConfigNodePropertyBoolean],
  userIntermediatePath: Option[ConfigNodePropertyString],
  addGroupMemberships: Option[ConfigNodePropertyBoolean],
  groupMembershipAttribute: Option[ConfigNodePropertyString],
  defaultGroups: Option[ConfigNodePropertyArray],
  nameIdFormat: Option[ConfigNodePropertyString],
  synchronizeAttributes: Option[ConfigNodePropertyArray],
  handleLogout: Option[ConfigNodePropertyBoolean],
  logoutUrl: Option[ConfigNodePropertyString],
  clockTolerance: Option[ConfigNodePropertyInteger],
  digestMethod: Option[ConfigNodePropertyString],
  signatureMethod: Option[ConfigNodePropertyString],
  identitySyncType: Option[ConfigNodePropertyDropDown],
  idpIdentifier: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties {
  implicit lazy val comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesJsonFormat: Format[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties] = Json.format[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties]
}

