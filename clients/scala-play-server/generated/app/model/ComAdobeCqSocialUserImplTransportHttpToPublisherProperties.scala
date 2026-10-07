package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialUserImplTransportHttpToPublisherProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties(
  enable: Option[ConfigNodePropertyBoolean],
  agentConfiguration: Option[ConfigNodePropertyArray],
  contextPath: Option[ConfigNodePropertyString],
  disabledCipherSuites: Option[ConfigNodePropertyArray],
  enabledCipherSuites: Option[ConfigNodePropertyArray]
)

object ComAdobeCqSocialUserImplTransportHttpToPublisherProperties {
  implicit lazy val comAdobeCqSocialUserImplTransportHttpToPublisherPropertiesJsonFormat: Format[ComAdobeCqSocialUserImplTransportHttpToPublisherProperties] = Json.format[ComAdobeCqSocialUserImplTransportHttpToPublisherProperties]
}

