package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties {
    
    ConfigNodePropertyString emailName
    
    ConfigNodePropertyBoolean emailCreatePostFromReply
    
    ConfigNodePropertyDropDown emailAddCommentIdTo
    
    ConfigNodePropertyInteger emailSubjectMaximumLength
    
    ConfigNodePropertyString emailReplyToAddress
    
    ConfigNodePropertyString emailReplyToDelimiter
    
    ConfigNodePropertyString emailTrackerIdPrefixInSubject
    
    ConfigNodePropertyString emailTrackerIdPrefixInBody
    
    ConfigNodePropertyBoolean emailAsHTML
    
    ConfigNodePropertyString emailDefaultUserName
    
    ConfigNodePropertyString emailTemplatesRootPath
}
