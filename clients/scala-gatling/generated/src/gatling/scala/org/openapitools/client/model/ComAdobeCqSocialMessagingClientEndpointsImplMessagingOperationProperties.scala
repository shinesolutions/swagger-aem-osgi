
package org.openapitools.client.model


case class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties (
    _messageProperties: Option[ConfigNodePropertyArray],
    _messageBoxSizeLimit: Option[ConfigNodePropertyInteger],
    _messageCountLimit: Option[ConfigNodePropertyInteger],
    _notifyFailure: Option[ConfigNodePropertyBoolean],
    _failureMessageFrom: Option[ConfigNodePropertyString],
    _failureTemplatePath: Option[ConfigNodePropertyString],
    _maxRetries: Option[ConfigNodePropertyInteger],
    _minWaitBetweenRetries: Option[ConfigNodePropertyInteger],
    _countUpdatePoolSize: Option[ConfigNodePropertyInteger],
    _inboxPath: Option[ConfigNodePropertyString],
    _sentitemsPath: Option[ConfigNodePropertyString],
    _supportAttachments: Option[ConfigNodePropertyBoolean],
    _supportGroupMessaging: Option[ConfigNodePropertyBoolean],
    _maxTotalRecipients: Option[ConfigNodePropertyInteger],
    _batchSize: Option[ConfigNodePropertyInteger],
    _maxTotalAttachmentSize: Option[ConfigNodePropertyInteger],
    _attachmentTypeBlacklist: Option[ConfigNodePropertyArray],
    _allowedAttachmentTypes: Option[ConfigNodePropertyArray],
    _serviceSelector: Option[ConfigNodePropertyString],
    _fieldWhitelist: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties {
    def toStringBody(var_messageProperties: Object, var_messageBoxSizeLimit: Object, var_messageCountLimit: Object, var_notifyFailure: Object, var_failureMessageFrom: Object, var_failureTemplatePath: Object, var_maxRetries: Object, var_minWaitBetweenRetries: Object, var_countUpdatePoolSize: Object, var_inboxPath: Object, var_sentitemsPath: Object, var_supportAttachments: Object, var_supportGroupMessaging: Object, var_maxTotalRecipients: Object, var_batchSize: Object, var_maxTotalAttachmentSize: Object, var_attachmentTypeBlacklist: Object, var_allowedAttachmentTypes: Object, var_serviceSelector: Object, var_fieldWhitelist: Object) =
        s"""
        | {
        | "messageProperties":$var_messageProperties,"messageBoxSizeLimit":$var_messageBoxSizeLimit,"messageCountLimit":$var_messageCountLimit,"notifyFailure":$var_notifyFailure,"failureMessageFrom":$var_failureMessageFrom,"failureTemplatePath":$var_failureTemplatePath,"maxRetries":$var_maxRetries,"minWaitBetweenRetries":$var_minWaitBetweenRetries,"countUpdatePoolSize":$var_countUpdatePoolSize,"inboxPath":$var_inboxPath,"sentitemsPath":$var_sentitemsPath,"supportAttachments":$var_supportAttachments,"supportGroupMessaging":$var_supportGroupMessaging,"maxTotalRecipients":$var_maxTotalRecipients,"batchSize":$var_batchSize,"maxTotalAttachmentSize":$var_maxTotalAttachmentSize,"attachmentTypeBlacklist":$var_attachmentTypeBlacklist,"allowedAttachmentTypes":$var_allowedAttachmentTypes,"serviceSelector":$var_serviceSelector,"fieldWhitelist":$var_fieldWhitelist
        | }
        """.stripMargin
}
