package org.openapitools.server.model


/**
 * @param messageProperties  for example: ''null''
 * @param messageBoxSizeLimit  for example: ''null''
 * @param messageCountLimit  for example: ''null''
 * @param notifyFailure  for example: ''null''
 * @param failureMessageFrom  for example: ''null''
 * @param failureTemplatePath  for example: ''null''
 * @param maxRetries  for example: ''null''
 * @param minWaitBetweenRetries  for example: ''null''
 * @param countUpdatePoolSize  for example: ''null''
 * @param inboxPath  for example: ''null''
 * @param sentitemsPath  for example: ''null''
 * @param supportAttachments  for example: ''null''
 * @param supportGroupMessaging  for example: ''null''
 * @param maxTotalRecipients  for example: ''null''
 * @param batchSize  for example: ''null''
 * @param maxTotalAttachmentSize  for example: ''null''
 * @param attachmentTypeBlacklist  for example: ''null''
 * @param allowedAttachmentTypes  for example: ''null''
 * @param serviceSelector  for example: ''null''
 * @param fieldWhitelist  for example: ''null''
*/
final case class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties (
  messageProperties: Option[ConfigNodePropertyArray] = None,
  messageBoxSizeLimit: Option[ConfigNodePropertyInteger] = None,
  messageCountLimit: Option[ConfigNodePropertyInteger] = None,
  notifyFailure: Option[ConfigNodePropertyBoolean] = None,
  failureMessageFrom: Option[ConfigNodePropertyString] = None,
  failureTemplatePath: Option[ConfigNodePropertyString] = None,
  maxRetries: Option[ConfigNodePropertyInteger] = None,
  minWaitBetweenRetries: Option[ConfigNodePropertyInteger] = None,
  countUpdatePoolSize: Option[ConfigNodePropertyInteger] = None,
  inboxPath: Option[ConfigNodePropertyString] = None,
  sentitemsPath: Option[ConfigNodePropertyString] = None,
  supportAttachments: Option[ConfigNodePropertyBoolean] = None,
  supportGroupMessaging: Option[ConfigNodePropertyBoolean] = None,
  maxTotalRecipients: Option[ConfigNodePropertyInteger] = None,
  batchSize: Option[ConfigNodePropertyInteger] = None,
  maxTotalAttachmentSize: Option[ConfigNodePropertyInteger] = None,
  attachmentTypeBlacklist: Option[ConfigNodePropertyArray] = None,
  allowedAttachmentTypes: Option[ConfigNodePropertyArray] = None,
  serviceSelector: Option[ConfigNodePropertyString] = None,
  fieldWhitelist: Option[ConfigNodePropertyArray] = None
)

