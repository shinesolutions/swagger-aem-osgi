package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties {
    ConfigNodePropertyArray messageProperties = null

    ConfigNodePropertyInteger messageBoxSizeLimit = null

    ConfigNodePropertyInteger messageCountLimit = null

    ConfigNodePropertyBoolean notifyFailure = null

    ConfigNodePropertyString failureMessageFrom = null

    ConfigNodePropertyString failureTemplatePath = null

    ConfigNodePropertyInteger maxRetries = null

    ConfigNodePropertyInteger minWaitBetweenRetries = null

    ConfigNodePropertyInteger countUpdatePoolSize = null

    ConfigNodePropertyString inboxPath = null

    ConfigNodePropertyString sentitemsPath = null

    ConfigNodePropertyBoolean supportAttachments = null

    ConfigNodePropertyBoolean supportGroupMessaging = null

    ConfigNodePropertyInteger maxTotalRecipients = null

    ConfigNodePropertyInteger batchSize = null

    ConfigNodePropertyInteger maxTotalAttachmentSize = null

    ConfigNodePropertyArray attachmentTypeBlacklist = null

    ConfigNodePropertyArray allowedAttachmentTypes = null

    ConfigNodePropertyString serviceSelector = null

    ConfigNodePropertyArray fieldWhitelist = null

}
