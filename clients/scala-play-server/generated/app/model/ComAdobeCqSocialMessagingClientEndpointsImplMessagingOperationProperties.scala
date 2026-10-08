package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties(
  messageProperties: Option[ConfigNodePropertyArray],
  messageBoxSizeLimit: Option[ConfigNodePropertyInteger],
  messageCountLimit: Option[ConfigNodePropertyInteger],
  notifyFailure: Option[ConfigNodePropertyBoolean],
  failureMessageFrom: Option[ConfigNodePropertyString],
  failureTemplatePath: Option[ConfigNodePropertyString],
  maxRetries: Option[ConfigNodePropertyInteger],
  minWaitBetweenRetries: Option[ConfigNodePropertyInteger],
  countUpdatePoolSize: Option[ConfigNodePropertyInteger],
  inboxPath: Option[ConfigNodePropertyString],
  sentitemsPath: Option[ConfigNodePropertyString],
  supportAttachments: Option[ConfigNodePropertyBoolean],
  supportGroupMessaging: Option[ConfigNodePropertyBoolean],
  maxTotalRecipients: Option[ConfigNodePropertyInteger],
  batchSize: Option[ConfigNodePropertyInteger],
  maxTotalAttachmentSize: Option[ConfigNodePropertyInteger],
  attachmentTypeBlacklist: Option[ConfigNodePropertyArray],
  allowedAttachmentTypes: Option[ConfigNodePropertyArray],
  serviceSelector: Option[ConfigNodePropertyString],
  fieldWhitelist: Option[ConfigNodePropertyArray]
)

object ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties {
  implicit lazy val comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesJsonFormat: Format[ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties] = Json.format[ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties]
}

