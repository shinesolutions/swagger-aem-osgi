<?php
/**
 * ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
 */
namespace OpenAPIServer\Model;

/**
 * ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
 */
class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $messageProperties */
    private $messageProperties;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $messageBoxSizeLimit */
    private $messageBoxSizeLimit;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $messageCountLimit */
    private $messageCountLimit;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $notifyFailure */
    private $notifyFailure;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $failureMessageFrom */
    private $failureMessageFrom;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $failureTemplatePath */
    private $failureTemplatePath;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $maxRetries */
    private $maxRetries;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $minWaitBetweenRetries */
    private $minWaitBetweenRetries;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $countUpdatePoolSize */
    private $countUpdatePoolSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $inboxPath */
    private $inboxPath;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $sentitemsPath */
    private $sentitemsPath;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $supportAttachments */
    private $supportAttachments;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $supportGroupMessaging */
    private $supportGroupMessaging;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $maxTotalRecipients */
    private $maxTotalRecipients;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $batchSize */
    private $batchSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $maxTotalAttachmentSize */
    private $maxTotalAttachmentSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $attachmentTypeBlacklist */
    private $attachmentTypeBlacklist;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $allowedAttachmentTypes */
    private $allowedAttachmentTypes;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $serviceSelector */
    private $serviceSelector;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $fieldWhitelist */
    private $fieldWhitelist;

}
