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
    
    ConfigNodePropertyArray messageProperties
    
    ConfigNodePropertyInteger messageBoxSizeLimit
    
    ConfigNodePropertyInteger messageCountLimit
    
    ConfigNodePropertyBoolean notifyFailure
    
    ConfigNodePropertyString failureMessageFrom
    
    ConfigNodePropertyString failureTemplatePath
    
    ConfigNodePropertyInteger maxRetries
    
    ConfigNodePropertyInteger minWaitBetweenRetries
    
    ConfigNodePropertyInteger countUpdatePoolSize
    
    ConfigNodePropertyString inboxPath
    
    ConfigNodePropertyString sentitemsPath
    
    ConfigNodePropertyBoolean supportAttachments
    
    ConfigNodePropertyBoolean supportGroupMessaging
    
    ConfigNodePropertyInteger maxTotalRecipients
    
    ConfigNodePropertyInteger batchSize
    
    ConfigNodePropertyInteger maxTotalAttachmentSize
    
    ConfigNodePropertyArray attachmentTypeBlacklist
    
    ConfigNodePropertyArray allowedAttachmentTypes
    
    ConfigNodePropertyString serviceSelector
    
    ConfigNodePropertyArray fieldWhitelist
}
